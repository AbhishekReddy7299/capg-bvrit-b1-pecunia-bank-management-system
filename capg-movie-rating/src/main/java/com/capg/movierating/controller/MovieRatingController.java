package com.capg.movierating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capg.movierating.model.MovieRating;
import com.capg.movierating.service.MovieRatingService;

@RestController
public class MovieRatingController {
	@Autowired
	MovieRatingService service;
	
	
	@GetMapping("/rating/{id}")
	public  ResponseEntity<MovieRating> getMovieRatingById(@PathVariable int id){
		
		MovieRating rating=service.getMovieRatingById(id);
	
		ResponseEntity<MovieRating> movieResponseEntity;
		
		
		
		if(rating!=null) {
			
		movieResponseEntity=new ResponseEntity<>(rating,HttpStatus.OK);
		}
		else {
			movieResponseEntity=new ResponseEntity<>(new MovieRating(),HttpStatus.NOT_FOUND);
		}
		
		return movieResponseEntity; 
	}

}
