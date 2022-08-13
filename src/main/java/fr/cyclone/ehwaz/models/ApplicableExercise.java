package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Exercise {
    @NonNull
    public String name;

    @NonNull
    public ArrayList<Set> sets;

    @NonNull
    public String commentary;

    public Integer initialSecondRest = 60;
}
