package fr.cyclone.ehwaz.controllers;

import fr.cyclone.ehwaz.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class WorkoutController {
    @GetMapping("/workout")
    public Workout getWorkout(){
        ArrayList<ApplicableExercise> exos = new ArrayList<>();

        return new Workout(new Date(), new Date(), "WoD", exos);
    }
}
