package com.railway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
    List<Train> findBySourceAndDestination(String source, String destination); 
}
