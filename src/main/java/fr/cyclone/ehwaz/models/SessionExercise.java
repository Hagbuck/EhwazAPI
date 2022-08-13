package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class SessionExercise {
    @NonNull
    public Exercise exercise;

    @NonNull
    public ArrayList<SessionSet> sets;

    /** To preload the timer on the front app **/
    public Integer initialSecondRest = 60;

    /** To preload the timer on the front app **/
    public Integer endingSecondRest = 60;
}
