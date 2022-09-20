package com.ideas2it.employee.repository;

import com.ideas2it.employee.model.Trainee;
import com.ideas2it.employee.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainerRepository extends JpaRepository<Trainer,Integer> {

    }


