package fr.cyclone.ehwaz.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Commentary {
    @NonNull
    String commentary;

    Integer rating;
}
