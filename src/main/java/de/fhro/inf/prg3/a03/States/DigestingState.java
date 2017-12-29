package de.fhro.inf.prg3.a03.States;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

public class DigestingState extends State {

    public DigestingState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        return null;
    }
}
