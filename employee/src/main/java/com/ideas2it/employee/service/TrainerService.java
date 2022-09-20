package com.ideas2it.employee.service;

import com.ideas2it.employee.dto.TrainerDto;
import com.ideas2it.employee.exception.EmployeeRuntimeException;
import java.util.List;

public interface TrainerService {
    void insertTrainerDto(TrainerDto trainerDto);

    List<TrainerDto> getAllTrainerDetails() throws EmployeeRuntimeException;

    TrainerDto getTrainerDetail(int id);

    boolean deleteTrainerDetail(int id);
    TrainerDto updateTrainer(TrainerDto trainerDto);
}





