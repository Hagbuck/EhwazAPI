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
public class WorkStep {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private ArrayList<ApplicableExercise> exercises;

    @OneToOne
    @JoinColumn(name = "commentary_id")
    private Commentary commentary;
}
