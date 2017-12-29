package de.fhro.inf.prg3.a03.States;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

public class DeathState extends State {

    public DeathState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        throw new IllegalStateException("This is no buddhistic animal - reincarnation is no option!");
    }
}
