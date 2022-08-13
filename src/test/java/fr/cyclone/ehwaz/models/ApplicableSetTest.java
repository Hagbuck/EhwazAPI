package fr.cyclone.ehwaz.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

public class ApplicableSetTest {
    @Test
    public void basicSet() throws Exception{
        ApplicableSet set = new ApplicableSet(10, false, 60.0, 0, 8, 2, "");

        ObjectMapper objMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(objMapper.writeValueAsString(set));
    }
}
