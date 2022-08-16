package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ApplicableExercise {
    @NonNull
    public Exercise exercise;

    @NonNull
    public ArrayList<ApplicableSet> sets;

    private Commentary commentary;

    /** To preload the timer on the front app **/
    public Integer initialSecondRest = 60;

    /** To preload the timer on the front app **/
    public Integer endingSecondRest = 60;

    /** Name the station can be used if there is many same station for the ex, but the feeling is different **/
    public Integer stationName;
}
