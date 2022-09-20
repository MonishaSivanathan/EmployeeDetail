package com.ideas2it.employee.service.impl;

import com.ideas2it.employee.dto.TraineeDto;
import com.ideas2it.employee.exception.EmployeeRuntimeException;
import com.ideas2it.employee.helper.Helper;
import com.ideas2it.employee.model.Trainee;
import com.ideas2it.employee.repository.TraineeRepository;
import com.ideas2it.employee.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * <p>
 * Implementation for handling all business logics of Trainee model
 * </p>
 */
@Service
public class TraineeServiceImpl implements TraineeService  {
    @Autowired
    public TraineeRepository traineeRepository;

    public TraineeDto insertTraineeDetails(TraineeDto traineeDto) {
        return Helper.changeTraineeToDto(traineeRepository.save(Helper.changeDtoToTrainee(traineeDto)));
    }
    /**
     * <p>
     * Retrieves all trainee from the database.
     * </p>
     *
     * @return the retrieved trainee list
     */
    public List<TraineeDto> getAllTraineeDetails() throws EmployeeRuntimeException {
        List<Trainee> trainees = traineeRepository.findAll();
        if(trainees.isEmpty()) {
            throw new EmployeeRuntimeException("No Employee Found");
        }
        else {
            return //data.getEmployeeDetails()
                    trainees.stream()
                            .map(trainee -> {
                                return Helper.changeTraineeToDto(trainee);
                            })
                            .collect(Collectors.toList());
        }
    }

    /**
     * <p>
     * Retrieves trainee from the trainees list by id
     * and returns as traineeDto.
     * </p>
     *
     * @param id
     *        with which trainee is retrieved from list
     * @return the retrieved trainee as traineeDto
     */
    public TraineeDto getTraineeDetail(int id) {
        Optional<Trainee> trainee = traineeRepository.findById(id);
        TraineeDto traineeDto = null;
        if (trainee.isPresent()) {
            traineeDto =  Helper.changeTraineeToDto(trainee.get());
        }
        return traineeDto;
    }

    /**
     * <p>
     * Deletes trainee from the trainees list by id.
     * </p>
     *
     * @param id with which trainee is retrieved from list
     * @return
     */
    public boolean deleteTraineeDetail(int id) {
        traineeRepository.deleteById(Integer.valueOf(id));
        return false;
    }

    /**
     * <p>
     * Retrieves trainee from the trainees list by id
     * and updates the trainee with the given map.
     * </p>
     *
     *boolean value if updated or not
     */

    public TraineeDto updateTrainee(TraineeDto traineeDto) {
        return Helper.changeTraineeToDto(traineeRepository.save(Helper.changeDtoToTrainee(traineeDto)));
    }
}


