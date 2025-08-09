package com.wipro.abdul.example.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionWrapper {
	
	private Long id;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
}
