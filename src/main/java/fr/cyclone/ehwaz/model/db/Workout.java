package fr.cyclone.ehwaz.model.db;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    public Date workoutStart;

    @NonNull
    public Date workoutEnd;

    @NonNull
    public String name;

    @NonNull
    public ArrayList<WorkStep> workSteps;
}
