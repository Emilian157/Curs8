package org.fasttrackit.curs8.interfaces.animale;

public class Dog implements Animal {

    public void speak() {
        System.out.println("WOOF");
    }

    public void bite() {
        System.out.println("musca");
    }

    @Override
    public boolean isAnimalOlderThan(int desiredAge) {
        return false;
    }

    public void run() {

    }
}