package fr.cyclone.ehwaz.model.db;

import fr.cyclone.ehwaz.model.enumeration.ERepType;
import fr.cyclone.ehwaz.model.enumeration.EUnit;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class ApplicableSet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private Integer reps;

    @NonNull
    private ERepType repType;

    @NonNull
    private Double value;

    @NonNull
    private EUnit unit;

    @NonNull
    private Boolean bodyWeight;

    @NonNull
    private Integer secondRest;

    @OneToOne
    @JoinColumn(name = "commentary_id")
    private Commentary commentary;

    private Integer rpe;

    private Integer rir;
}
