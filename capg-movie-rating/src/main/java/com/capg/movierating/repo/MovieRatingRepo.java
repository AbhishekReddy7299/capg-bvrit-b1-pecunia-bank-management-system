package com.capg.movierating.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.movierating.model.MovieRating;

@Repository
public interface MovieRatingRepo extends JpaRepository<MovieRating,Number>{

}
