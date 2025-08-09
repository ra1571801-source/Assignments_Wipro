package com.wipro.abdul.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.abdul.example.entity.QuestionWrapper;
import com.wipro.abdul.example.entity.Quiz;
import com.wipro.abdul.example.entity.Response;

@Service
public interface QuizService {



	List<QuestionWrapper> getQuizQuestions(Long id);




	Quiz createQuiz(String difficultyLevel, String category, String title);




	Integer calculateResult(Long id, List<Response> responses);




	

}
