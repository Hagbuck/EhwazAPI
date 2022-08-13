package fr.cyclone.ehwaz.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class AEvent {
    @NonNull
    protected Integer order;

    protected EventType eventType = EventType.NONE;
}