package com.capg.movieinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.capg.movieinfo.model.MovieInfo;
import com.capg.movieinfo.service.MovieInfoService;

@RestController
public class MovieInfoController {
	@Autowired
	MovieInfoService service;
	
@GetMapping("/movieinfo/{id}")
 public ResponseEntity<MovieInfo> getMovieInfoById(@PathVariable("id") int id){
	ResponseEntity<MovieInfo> reMovieInfo;
	MovieInfo info=service.getMovieById(id);
	
	
	if(info!=null) {
		
		reMovieInfo=new ResponseEntity<>(info,HttpStatus.OK);
	}
	else {
		
		reMovieInfo=new ResponseEntity<>(new MovieInfo(),HttpStatus.NOT_FOUND);
	}
	
	 return reMovieInfo;
 }
}
