package fr.cyclone.ehwaz.models;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class ApplicableSet extends ASet {
    private String commentary;

    public ApplicableSet(Integer reps, Boolean bodyWeight, Double weight, Integer staticTime, Integer rpe, Integer rir, String commentary) {
        super(reps, bodyWeight, weight, staticTime, rpe, rir);
        this.commentary = commentary;
    }

    public ApplicableSet(Integer order, Integer reps, Boolean bodyWeight, Double weight, Integer staticTime, Integer rpe, Integer rir, String commentary) {
        super(order, reps, bodyWeight, weight, staticTime, rpe, rir);
        this.commentary = commentary;
    }
}
