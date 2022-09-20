package com.ideas2it.employee.controller;

import com.ideas2it.employee.dto.TraineeDto;
import com.ideas2it.employee.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Receive and process all requests from client
 */
@RestController
@RequestMapping("/trainees")
public class TraineeController {

    private final TraineeService traineeService;

    @Autowired
    public TraineeController(TraineeService traineeService){
        this.traineeService = traineeService;
    }

    /*
     * Get trainee details from client
     * @param traineeDto
     */
    @PostMapping
    public TraineeDto getTrainee(@RequestBody TraineeDto traineeDto){
        return traineeService.insertTraineeDetails(traineeDto);
    }

    /*
     * Get trainee details by id
     * @param id
     */
    @GetMapping("/{id}")
    public  TraineeDto getTraineeById (@PathVariable("id") int id){
        return traineeService.getTraineeDetail(id);
    }

    /*
     * To get all trainees list
     * @return List<TraineeDto>
     */
    @GetMapping
    public List<TraineeDto> getAllTrainees(){
        return traineeService.getAllTraineeDetails();
    }

    /*
     * Update trainee details
     * @param traineeId, traineeDto
     */
    @PutMapping
    public TraineeDto updateTrainee(@RequestBody TraineeDto traineeDto) {
        return traineeService.updateTrainee(traineeDto);
    }

    /*
     * Delete trainee details by id
     * @param id
     */
    @DeleteMapping("/{id}")
    public String deleteTrainee(@PathVariable("id") int id){
        if (traineeService.deleteTraineeDetail(id)) {
            return "Deleted";
        } else {
            return "Try after sometimes";
        }
    }
}
