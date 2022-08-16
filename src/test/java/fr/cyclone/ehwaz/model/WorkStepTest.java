package fr.cyclone.ehwaz.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.cyclone.ehwaz.model.db.ApplicableExercise;
import fr.cyclone.ehwaz.model.db.ApplicableSet;
import fr.cyclone.ehwaz.model.db.Exercise;
import fr.cyclone.ehwaz.model.db.WorkStep;
import fr.cyclone.ehwaz.model.enumeration.EMuscle;
import fr.cyclone.ehwaz.model.enumeration.ERepType;
import fr.cyclone.ehwaz.model.enumeration.EUnit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkStepTest {
    @Test
    public void basicSet() throws Exception{
        Exercise curl = new Exercise("Biceps Curl", "", new ArrayList<>(Arrays.asList(EMuscle.BICEPS)));
        Exercise tric = new Exercise("Triceps Extension", "", new ArrayList<>(Arrays.asList(EMuscle.TRICEPS)));

        ArrayList<ApplicableSet> sets_curl = new ArrayList<>(Arrays.asList(
                new ApplicableSet(10, ERepType.REPETITION, 10.0, EUnit.KG, false, 60),
                new ApplicableSet(10, ERepType.REPETITION, 10.0, EUnit.KG, false, 0),
                new ApplicableSet(12, ERepType.STATIC, 10.0, EUnit.KG, false, 60)
        ));

        ArrayList<ApplicableSet> sets_tri = new ArrayList<>(Arrays.asList(
                new ApplicableSet(10, ERepType.REPETITION, 15.0, EUnit.KG, false, 60),
                new ApplicableSet(10, ERepType.REPETITION, 15.0, EUnit.KG, false, 0),
                new ApplicableSet(12, ERepType.STATIC, 15.0, EUnit.KG, false, 60)
        ));

        ApplicableExercise appExCurl = new ApplicableExercise(curl, sets_curl);
        ApplicableExercise appExTri = new ApplicableExercise(tric, sets_curl);

        WorkStep ws = new WorkStep(new ArrayList<>(Arrays.asList(appExCurl, appExTri)));

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(ws));
    }
}
