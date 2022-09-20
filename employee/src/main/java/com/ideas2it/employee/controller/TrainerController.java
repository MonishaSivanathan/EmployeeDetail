package com.ideas2it.employee.controller;

import com.ideas2it.employee.dto.TraineeDto;
import com.ideas2it.employee.dto.TrainerDto;
import com.ideas2it.employee.repository.TraineeRepository;
import com.ideas2it.employee.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Receive and process all requests from client
 */
@RestController
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    /*
     * Get trainee details from client
     * @param traineeDto
     */
    @PostMapping
    public void getTrainer(@RequestBody TrainerDto trainerDto){
        trainerService.insertTrainerDto(trainerDto);
    }

    /*
     * Get trainee details by id
     * @param id
     */
    @GetMapping("/{trainerId}")
    public  TrainerDto getTrainerById (@PathVariable("trainerId") int id){
        return trainerService.getTrainerDetail(id);
    }

    /*
     * To get all trainees list
     * @return List<TraineeDto>
     */
    @GetMapping
    public List<TrainerDto> getAllTrainers(){
        return trainerService.getAllTrainerDetails();
    }

    /*
     * Update trainee details
     * @param traineeId, traineeDto
     */
    @PutMapping("/{trainerId}")
    public TrainerDto updateTrainer(@RequestBody TrainerDto trainerDto) {
        return trainerService.updateTrainer(trainerDto);
    }

    /*
     * Delete trainee details by id
     * @param id
     */
    @DeleteMapping("/{trainerId}")
    public String deleteTrainer(@PathVariable("trainerId") int id){
        if (trainerService.deleteTrainerDetail(id)) {
            return "Deleted";
        } else {
            return "Try after sometimes";
        }
    }
}

