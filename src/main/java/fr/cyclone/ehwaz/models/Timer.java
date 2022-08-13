package fr.cyclone.ehwaz.models;

import lombok.*;

@Getter
@Setter
public class Timer extends AEvent{
    private Integer time;
    final protected EventType eventType = EventType.TIMER;

    public Timer(Integer time){
        this.time = time;
    }
    public Timer(Integer order, Integer time){
        super(order);
        this.time = time;
    }
}
