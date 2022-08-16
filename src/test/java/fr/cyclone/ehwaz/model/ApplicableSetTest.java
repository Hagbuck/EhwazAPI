package fr.cyclone.ehwaz.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.cyclone.ehwaz.model.db.ApplicableSet;
import fr.cyclone.ehwaz.model.enumeration.ERepType;
import fr.cyclone.ehwaz.model.enumeration.EUnit;
import org.junit.jupiter.api.Test;

public class ApplicableSetTest {
    @Test
    public void basicSet() throws Exception{
        ApplicableSet set = new ApplicableSet(10, ERepType.REPETITION, 10.0, EUnit.KG, false, 60);

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(set));
    }
}
