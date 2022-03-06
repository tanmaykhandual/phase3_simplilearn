package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Feedback;
import com.simplilearn.repo.FeedbackRepository;

@RestController
public class FeedbackConroller {

	@Autowired
	FeedbackRepository feedbackRepository;
	
	@PostMapping("/feedback")
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback)
	{
		int x=feedbackRepository.save(feedback);
		if(x>0)
			return new ResponseEntity<Feedback>(feedback,HttpStatus.CREATED);
		else
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
