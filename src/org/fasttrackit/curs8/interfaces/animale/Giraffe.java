package org.fasttrackit.curs8.interfaces.animale;

public class Giraffe implements Mamifere {
    @Override
    public void speak() {
        System.out.println("nom");
    }

    @Override
    public void bite() {
        System.out.println("girrafe bite");
    }

    @Override
    public boolean isAnimalOlderThan(int desiredAge) {
        return false;
    }

    @Override
    public void nastereNaturala() {
        System.out.println("birth giraffe ");
    }
}