package com.wipro.abdul.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.abdul.example.entity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{

	

}
