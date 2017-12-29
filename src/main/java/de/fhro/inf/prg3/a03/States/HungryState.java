package de.fhro.inf.prg3.a03.States;

import de.fhro.inf.prg3.a03.Animal;
import de.fhro.inf.prg3.a03.State;

public class HungryState extends State {

    public HungryState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("I've starved for a too long time...good bye...");
        return new DeathState(animal, -1);
    }

    public State feed(){
        logger.info("Om nom nom...");
        return new DigestingState(animal, animal.getDigest(), duration - time);
    }

}
