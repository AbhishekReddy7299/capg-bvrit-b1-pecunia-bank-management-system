package com.capg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.models.Trainee;

public interface TraineeRepoInterface extends JpaRepository<Trainee,Integer> {

}
