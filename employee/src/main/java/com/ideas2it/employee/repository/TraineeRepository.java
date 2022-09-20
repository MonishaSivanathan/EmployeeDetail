package com.ideas2it.employee.repository;

import com.ideas2it.employee.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {


}

