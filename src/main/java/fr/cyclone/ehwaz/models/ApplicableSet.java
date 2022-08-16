package fr.cyclone.ehwaz.models;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ApplicableSet {
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

    private Commentary commentary;

    private Integer rpe;

    private Integer rir;
}
