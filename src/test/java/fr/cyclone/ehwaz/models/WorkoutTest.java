package fr.cyclone.ehwaz.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class WorkoutTest {
    @Test
    public void buildWorkout() throws Exception {
        ArrayList<ApplicableExercise> exos = new ArrayList<>();

        Exercise dc = new Exercise("DC", "Push up exercise", new ArrayList<>(Arrays.asList(Muscle.CHEST, Muscle.TRICEPS, Muscle.POSTERIOR_DELTOID)));

        ArrayList<AEvent> sets1 = new ArrayList<>(Arrays.asList(
                new ApplicableSet(10, false, 60.0, 0, 8, 2, ""),
                new ApplicableSet(9, false, 60.0, 0, 10, 0, "Echec musculaire")
        ));

        ApplicableExercise ex1 = new ApplicableExercise(dc, sets1, "Very good");

        exos.add(ex1);

        Workout w = new Workout(new Date(), new Date(), "WoD", exos);

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(w));
    }
}
