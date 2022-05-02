package com.globomatics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globomatics.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
