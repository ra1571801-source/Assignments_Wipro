package com.wipro.abdul.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.abdul.example.entity.Question;
import com.wipro.abdul.example.entity.Question.Category;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	@Query(value = "SELECT * FROM question q WHERE q.category = :category AND q.difficulty_level = :difficulty ORDER BY RAND() LIMIT 3", nativeQuery = true)
	
	List<Question> findRandomQuestionsByCategoryAndDifficultyLevel(String difficultyLevel, String category);

	List<Question> findByCategory(Category category);

	

}
