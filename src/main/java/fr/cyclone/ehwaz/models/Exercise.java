package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    @NonNull
    public String name;

    @NonNull
    public String description;

    @NonNull
    public ArrayList<EMuscle> muscles;
}
