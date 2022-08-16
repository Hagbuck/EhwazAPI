package fr.cyclone.ehwaz.model.db;

import fr.cyclone.ehwaz.model.enumeration.EMuscle;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    public String name;

    @NonNull
    public String description;

    @NonNull
    public ArrayList<EMuscle> muscles;
}
