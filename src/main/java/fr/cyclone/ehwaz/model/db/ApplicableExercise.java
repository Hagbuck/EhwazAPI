package fr.cyclone.ehwaz.model.db;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class ApplicableExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "exercise_id")
    @NonNull
    public Exercise exercise;

    @NonNull
    public ArrayList<ApplicableSet> sets;

    @OneToOne
    @JoinColumn(name = "commentary_id")
    private Commentary commentary;

    /** To preload the timer on the front app **/
    public Integer initialSecondRest = 60;

    /** To preload the timer on the front app **/
    public Integer endingSecondRest = 60;

    /** Name the station can be used if there is many same station for the ex, but the feeling is different **/
    public Integer stationName;
}
