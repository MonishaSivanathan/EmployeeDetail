package com.ideas2it.employee.service;

import com.ideas2it.employee.dto.TraineeDto;
import com.ideas2it.employee.exception.EmployeeRuntimeException;

import java.util.List;

public interface TraineeService {
    TraineeDto insertTraineeDetails(TraineeDto traineeDto);
    List<TraineeDto> getAllTraineeDetails() throws EmployeeRuntimeException;
    TraineeDto getTraineeDetail(int id);
    boolean deleteTraineeDetail(int id);

    TraineeDto updateTrainee(TraineeDto traineeDto);
}





