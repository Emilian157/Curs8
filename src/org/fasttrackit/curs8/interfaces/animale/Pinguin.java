package org.fasttrackit.curs8.interfaces.animale;

public class Pinguin implements Animal {

    public void speak() {
        System.out.println("flap");
    }

    public void bite() {
        System.out.println("bite");
    }

    @Override
    public boolean isAnimalOlderThan(int desiredAge) {
        return false;
    }
}