package com.capg.movieinfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="movieinfo_tbl")
public class MovieInfo {

	@Id
	@Column(name="mid")
	private int movieId;
	@Column(name="mtitle",length=15)
	private String movieTitle;
	@Column(name="mdesc",length=15)
	private String movieDescription;
	
	

	public MovieInfo() {
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public MovieInfo(int movieId, String movieTitle, String movieDescription) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.movieDescription = movieDescription;
	}

	@Override
	public String toString() {
		return "MovieInfo [movieId=" + movieId + ", movieTitle=" + movieTitle + ", movieDescription=" + movieDescription
				+ "]";
	}
	
	
	
}
