package com.capg.movieinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.movieinfo.model.MovieInfo;

@Repository
public interface MovieInfoRepo extends JpaRepository<MovieInfo,Integer>
{

}
