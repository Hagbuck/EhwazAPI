package fr.cyclone.ehwaz.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.cyclone.ehwaz.model.db.ApplicableExercise;
import fr.cyclone.ehwaz.model.db.ApplicableSet;
import fr.cyclone.ehwaz.model.db.Exercise;
import fr.cyclone.ehwaz.model.enumeration.EMuscle;
import fr.cyclone.ehwaz.model.enumeration.ERepType;
import fr.cyclone.ehwaz.model.enumeration.EUnit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
public class ApplicableExerciseTest {
    @Test
    public void basicApplicableExercise() throws Exception{
        Exercise dc = new Exercise("DC", "Push up exercise", new ArrayList<>(Arrays.asList(EMuscle.CHEST, EMuscle.TRICEPS, EMuscle.POSTERIOR_DELTOID)));

        ArrayList<ApplicableSet> sets1 = new ArrayList<>(Arrays.asList(
                new ApplicableSet(10, ERepType.REPETITION, 60.0, EUnit.KG, false, 120),
                new ApplicableSet(10, ERepType.REPETITION, 60.0, EUnit.KG, false, 120)
        ));
        ApplicableExercise appEx = new ApplicableExercise(dc, sets1);

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(appEx));
    }

    @Test
    public void maintainLastRepApplicableExercise() throws Exception{
        Exercise curl = new Exercise("Curl", "", new ArrayList<>(Arrays.asList(EMuscle.BICEPS)));

        ArrayList<ApplicableSet> sets1 = new ArrayList<>(Arrays.asList(
                new ApplicableSet(10, ERepType.REPETITION, 10.0, EUnit.KG, false, 60),
                new ApplicableSet(10, ERepType.REPETITION, 10.0, EUnit.KG, false, 60),
                new ApplicableSet(10, ERepType.REPETITION, 10.0, EUnit.KG, false, 0),
                new ApplicableSet(12, ERepType.STATIC, 10.0, EUnit.KG, false, 60)
        ));

        ApplicableExercise appEx = new ApplicableExercise(curl, sets1);

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(appEx));
    }
}
