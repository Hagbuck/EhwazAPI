package fr.cyclone.ehwaz.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
public class ApplicableExerciseTest {
    @Test
    public void basicApplicableExercise() throws Exception{
        Exercise dc = new Exercise("DC", "Push up exercise", new ArrayList<>(Arrays.asList(Muscle.CHEST, Muscle.TRICEPS, Muscle.POSTERIOR_DELTOID)));

        ArrayList<AEvent> sets1 = new ArrayList<>(Arrays.asList(
                new ApplicableSet(1,10, false, 60.0, 0, 8, 2, ""),
                new Timer(2, 60),
                new ApplicableSet(3,10, false, 60.0, 0, 8, 2, "")
        ));
        ApplicableExercise appEx = new ApplicableExercise(dc, sets1, "Very good");

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(appEx));
    }

    @Test
    public void superSetApplicableExercise() throws Exception{
        Exercise curl = new Exercise("Curl", "", new ArrayList<>(Arrays.asList(Muscle.BICEPS)));
        Exercise tric = new Exercise("Extension Triceps", "", new ArrayList<>(Arrays.asList(Muscle.TRICEPS)));

        ApplicableSet set_curl = new ApplicableSet(10, false, 10.0, 0, 8, 2, "");
        ApplicableSet set_tri = new ApplicableSet(10, false, 10.0, 0, 8, 2, "");

        ArrayList<AEvent> sets1 = new ArrayList<>(Arrays.asList(set_curl));
        ApplicableExercise appEx = new ApplicableExercise(curl, sets1, "Very good");

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(appEx));
    }

    @Test
    public void maintainLastRepApplicableExercise() throws Exception{
        Exercise curl = new Exercise("Curl", "", new ArrayList<>(Arrays.asList(Muscle.BICEPS)));

        ArrayList<AEvent> sets1 = new ArrayList<>(Arrays.asList(
                new ApplicableSet(1, 10, false, 10.0, 0, 8, 2, ""),
                new Timer(2, 60),
                new ApplicableSet(3, 10, false, 10.0, 0, 8, 2, ""),
                new Timer(4, 60),
                new ApplicableSet(5, 1, false, 10.0, 10, 10, 0, "")
        ));

        ApplicableExercise appEx = new ApplicableExercise(curl, sets1, "Very good");

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(appEx));
    }
}
