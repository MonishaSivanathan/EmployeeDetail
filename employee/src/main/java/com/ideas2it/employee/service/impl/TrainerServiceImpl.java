package com.ideas2it.employee.service.impl;

import com.ideas2it.employee.exception.EmployeeRuntimeException;
import com.ideas2it.employee.repository.TrainerRepository;
import com.ideas2it.employee.dto.TrainerDto;
import com.ideas2it.employee.model.Trainer;
import com.ideas2it.employee.helper.Helper;
import com.ideas2it.employee.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class TrainerServiceImpl implements TrainerService  {

    @Autowired
    public TrainerRepository trainerRepository;

    public void insertTrainerDto(TrainerDto trainerDto) {
        trainerRepository.save(Helper.changeDtoToTrainer(trainerDto));
    }

    public List<TrainerDto> getAllTrainerDetails() throws EmployeeRuntimeException {
        List<Trainer> trainers = trainerRepository.findAll();
        if(trainers.isEmpty()) {
            throw new EmployeeRuntimeException("No Employee Found");
        }
        else {
            return trainers.stream()
                    .map(trainer -> {
                       return Helper.changeTrainerToDto(trainer);
                    })
                    .collect(Collectors.toList());
        }
    }

    public TrainerDto getTrainerDetail(int id) {
        Optional<Trainer> trainer = trainerRepository.findById(id);
        TrainerDto traineeDto = null;
        if (trainer.isPresent()) {
            traineeDto = Helper.changeTrainerToDto(trainer.get());
        }
        return traineeDto;
    }

    public boolean deleteTrainerDetail(int id) {
        trainerRepository.deleteById(id);
        return false;
    }

    public TrainerDto updateTrainer(TrainerDto trainerDto) {
        return Helper.changeTrainerToDto(trainerRepository.save(Helper.changeDtoToTrainer(trainerDto)));
    }
}
