package com.capg.movierating.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="movierating_tbl")
public class MovieRating {

	@Id
	@Column(name="mid")
	private int movieId;
	@Column(name="mrating")
	private double rating;
	
	

	public MovieRating() {
		// TODO Auto-generated constructor stub
	}

	public MovieRating(int movieId, double rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieRating [movieId=" + movieId + ", rating=" + rating + "]";
	}
	
	
	
}
