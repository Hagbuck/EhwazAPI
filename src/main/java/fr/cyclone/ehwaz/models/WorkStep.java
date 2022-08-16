package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class WorkStep {
    @NonNull
    private ArrayList<ApplicableExercise> exercises;

    private Commentary commentary;
}
