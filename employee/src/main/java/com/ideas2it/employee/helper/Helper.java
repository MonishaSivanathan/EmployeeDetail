package com.ideas2it.employee.helper;

import com.ideas2it.employee.dto.TrainerDto;
import com.ideas2it.employee.model.Trainer;
import com.ideas2it.employee.dto.TraineeDto;
import com.ideas2it.employee.model.Trainee;

public class Helper {

    public static Trainer changeDtoToTrainer(TrainerDto trainerDto) {
        Trainer trainer = new Trainer(trainerDto.getId(),trainerDto.getEmployeeId(), trainerDto.getEmployeeName(), trainerDto.getEmployeeJoiningDate(), trainerDto.getEmployeeGender(),
                trainerDto.getDesignation(), trainerDto.getMobileNumber(), trainerDto.getEmailId(), trainerDto.getBloodGroup(),
                trainerDto.getMaritalStatus(), trainerDto.getPay(), trainerDto.getDateOfBirth(), trainerDto.getProjectName());

        return trainer;
    }
        public static TrainerDto changeTrainerToDto(Trainer trainer) {
                TrainerDto trainerDto = new TrainerDto(trainer.getId(), trainer.getEmployeeId(), trainer.getEmployeeName(), trainer.getEmployeeJoiningDate(), trainer.getEmployeeGender(),
                trainer.getDesignation(), trainer.getMobileNumber(), trainer.getEmailId(), trainer.getBloodGroup(),
                trainer.getMaritalStatus(), trainer.getPay(), trainer.getDateOfBirth(), trainer.getProjectName());
        return trainerDto;
    }

    public static Trainer changeDtoToTrainer(TrainerDto trainerDto, Trainer trainer) {
        trainer.setEmployeeName(trainerDto.getEmployeeName());
        trainer.setDateOfBirth(trainerDto.getDateOfBirth());
        trainer.setMobileNumber(trainerDto.getMobileNumber());
        trainer.setEmailId(trainerDto.getEmailId());
        return trainer;
    }

    public static Trainee changeDtoToTrainee(TraineeDto traineeDto) {
        Trainee trainee =  new Trainee (traineeDto.getId(),traineeDto.getEmployeeId(), traineeDto.getEmployeeName(), traineeDto.getEmployeeJoiningDate(), traineeDto.getEmployeeGender(),
                traineeDto.getDesignation(), traineeDto.getMobileNumber(), traineeDto.getEmailId(), traineeDto.getBloodGroup(),
                traineeDto.getMaritalStatus(), traineeDto.getPay(), traineeDto.getDateOfBirth(), traineeDto.getTaskAssign());
        return trainee;
    }
    public static TraineeDto changeTraineeToDto(Trainee trainee) {
        TraineeDto traineeDto = new TraineeDto(trainee.getId(),trainee.getEmployeeId(), trainee.getEmployeeName(), trainee.getEmployeeJoiningDate(), trainee.getEmployeeGender(),
                trainee.getDesignation(), trainee.getMobileNumber(), trainee.getEmailId(), trainee.getBloodGroup(),
                trainee.getMaritalStatus(), trainee.getPay(), trainee.getDateOfBirth(), trainee.getTaskAssign());
        return traineeDto;
    }

    public static Trainee changeDtoToTrainee(TraineeDto traineeDto, Trainee trainee) {
        trainee.setEmployeeName(traineeDto.getEmployeeName());
        trainee.setDateOfBirth(traineeDto.getDateOfBirth());
        trainee.setMobileNumber(traineeDto.getMobileNumber());
        trainee.setEmailId(traineeDto.getEmailId());
        return trainee;
    }
}


