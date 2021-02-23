package ru.mirea.ikbo_16_19.isaev.exercise4;

import java.util.Arrays;

public class Human {
    Leg[] legs = {
            new Leg("Left leg"), new Leg("Right leg")
    };
    //wait, what for do I need it?
    Hand[] hands = {
            new Hand("Left hand"), new Hand("Right hand")
    };

    @Override
    public String toString() {
        return "Human{" +
                "legs=" + Arrays.toString(legs) +
                ", hands=" + Arrays.toString(hands) +
                '}';
    }
}

class Leg extends Human {
    String legPlace;

    public Leg(String legPlace) {
        this.legPlace = legPlace;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "legPlace='" + legPlace + '\'' +
                '}';
    }
}

class Hand extends Human{
    String handPlace;

    public Hand(String handPlace) {
        this.handPlace = handPlace;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handPlace='" + handPlace + '\'' +
                '}';
    }
}

class Head extends Human{
    String takeAnotherHead;

    public Head(String takeAnotherHead) {
        this.takeAnotherHead = takeAnotherHead;
    }

    @Override
    public String toString() {
        return "Head{" +
                "takeAnotherHead='" + takeAnotherHead + '\'' +
                '}';
    }
}
