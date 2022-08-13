package fr.cyclone.ehwaz.controlers;

import fr.cyclone.ehwaz.models.Exercise;
import fr.cyclone.ehwaz.models.Set;
import fr.cyclone.ehwaz.models.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class WorkoutController {
    @GetMapping("/workout")
    public Workout getWorkout(){
        ArrayList<Exercise> exos = new ArrayList<>();

        Set s1 = new Set(10, false, 60.0, 180, 8, 2, "");
        Set s2 = new Set(9, false, 60.0, 180, 10, 0, "Echec musculaire");
        ArrayList<Set> sets1 = new ArrayList<>();
        sets1.add(s1);
        sets1.add(s2);
        Exercise ex1 = new Exercise("DC", sets1, "Very good");

        exos.add(ex1);

        return new Workout(0, new Date(), new Date(), "WoD", exos);
    }
}
