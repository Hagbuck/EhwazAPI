package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Session {
    @NonNull
    public String name;

    @NonNull
    public ArrayList<ApplicableExercise> exercises;

    public String description;
}
