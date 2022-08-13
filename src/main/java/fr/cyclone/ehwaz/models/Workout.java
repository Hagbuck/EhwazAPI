package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Workout {
    @NonNull
    public Date workoutStart;

    @NonNull
    public Date workoutEnd;

    @NonNull
    public String name;

    @NonNull
    public ArrayList<ApplicableExercise> exercises;
}
