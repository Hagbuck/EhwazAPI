package fr.cyclone.ehwaz.models;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Program {
    @NonNull
    public String name;

    @NonNull
    public ArrayList<Session> sessions;

    public String description;
}
