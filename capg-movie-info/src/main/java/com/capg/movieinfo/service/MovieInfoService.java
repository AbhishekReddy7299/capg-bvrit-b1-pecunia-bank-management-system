package com.capg.movieinfo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.movieinfo.model.MovieInfo;
import com.capg.movieinfo.repo.MovieInfoRepo;

@Service
public class MovieInfoService {
	
	
	@Autowired
	MovieInfoRepo  movieInfoDao;

	public MovieInfo getMovieById(int id) {
		
		return movieInfoDao.findById(id).get();
	}
}
