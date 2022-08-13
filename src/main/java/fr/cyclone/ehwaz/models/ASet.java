package fr.cyclone.ehwaz.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
abstract public class ASet extends AEvent {
    @NonNull
    protected Integer reps;

    @NonNull
    protected Boolean bodyWeight;

    @NonNull
    protected Double weight;

    protected Integer staticTime = 0;

    protected Integer rpe;

    protected Integer rir;

    final protected EventType eventType = EventType.SET;

    public ASet(Integer order, Integer reps, Boolean bodyWeight, Double weight, Integer staticTime, Integer rpe, Integer rir) {
        super(order);
        this.reps = reps;
        this.bodyWeight = bodyWeight;
        this.weight = weight;
        this.staticTime = staticTime;
        this.rpe = rpe;
        this.rir = rir;
    }
}
