import { Component, HostListener, OnInit, Inject, PLATFORM_ID } from '@angular/core';
import { isPlatformBrowser, CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatSelectModule } from '@angular/material/select';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatFormFieldModule } from '@angular/material/form-field';

interface Movie {
  title: string;
  poster: string;
  genre: string;
  rating: number;
  description: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    MatCardModule,
    MatIconModule,
    MatSelectModule,
    MatGridListModule,
    MatToolbarModule,
    MatFormFieldModule,
  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  selectedGenre: string = 'All';
  cols: number = 4;

  movies: Movie[] = [
  {
    title: 'The Shawshank Redemption',
    poster: "https://upload.wikimedia.org/wikipedia/en/8/81/ShawshankRedemptionMoviePoster.jpg",
    genre: 'Drama',
    rating: 5,
    description: 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.',
  },
  {
    title: 'Inception',
    poster: "https://upload.wikimedia.org/wikipedia/en/2/2e/Inception_%282010%29_theatrical_poster.jpg",
    genre: 'Action',
    rating: 5,
    description: 'A skilled thief who steals corporate secrets through dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.',
  },
  {
    title: 'The Dark Knight',
    poster: "https://play-lh.googleusercontent.com/auIs5tjWlLYaFPGClZOJ7m5YVbnX6uBvz0X02r8TkwFKdzE53ww2MqWSS9gU0YNqoYwvpg",
    genre: 'Action',
    rating: 5,
    description: 'Batman faces the Joker, a criminal mastermind who wants to plunge Gotham into anarchy.',
  },
  {
    title: 'Forrest Gump',
    poster: "https://m.media-amazon.com/images/I/71xzEu8NuJL._UF894,1000_QL80_.jpg",
    genre: 'Drama',
    rating: 4,
    description: 'The presidencies of Kennedy and Johnson, the Vietnam War, and more through the eyes of an Alabama man with a low IQ.',
  },
  {
    title: 'The Godfather',
    poster: "https://m.media-amazon.com/images/M/MV5BNGEwYjgwOGQtYjg5ZS00Njc1LTk2ZGEtM2QwZWQ2NjdhZTE5XkEyXkFqcGc@._V1_.jpg",
    genre: 'Drama',
    rating: 5,
    description: 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.',
  },
  {
    title: 'Avengers: Endgame',
    poster: "https://disney.images.edge.bamgrid.com/ripcut-delivery/v2/variant/disney/7b350a2f-0b3e-4033-8125-34c4d67e3bbe/compose?aspectRatio=1.78&format=webp&width=1200",
    genre: 'Action',
    rating: 4,
    description: 'After the devastating events of Infinity War, the Avengers assemble once more to reverse Thanos\' actions and restore balance to the universe.',
  },
];

  constructor(@Inject(PLATFORM_ID) private platformId: Object) {}

  ngOnInit(): void {
    if (isPlatformBrowser(this.platformId)) {
      this.onResize(); // initialize cols based on current window size
    }
  }

  get filteredMovies(): Movie[] {
    if (this.selectedGenre === 'All') {
      return this.movies;
    }
    return this.movies.filter((movie) => movie.genre === this.selectedGenre);
  }

  get averageRating(): string {
    if (!this.movies.length) {
      return '0.0';
    }
    const totalRating = this.movies.reduce((acc, movie) => acc + movie.rating, 0);
    return (totalRating / this.movies.length).toFixed(1);
  }

  @HostListener('window:resize')
  onResize(): void {
    if (!isPlatformBrowser(this.platformId)) {
      return;
    }
    const width = window.innerWidth;
    if (width <= 480) {
      this.cols = 1;
    } else if (width <= 768) {
      this.cols = 2;
    } else if (width <= 1024) {
      this.cols = 3;
    } else {
      this.cols = 4;
    }
  }
}
