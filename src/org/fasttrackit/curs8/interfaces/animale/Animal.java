package org.fasttrackit.curs8.interfaces.animale;

//extends interface -> CUVANTUL EXTENDS
//pt obiecte -> CUVANTUL IMPLEMENTS
public interface Animal {
    String NUMELE_FIINTEI = "animal";

    void speak();

    void bite();

    boolean isAnimalOlderThan(int desiredAge);

    default void eat() {
        System.out.println("eat");
    }

    static void doSomethingElse() {
        System.out.println("anything else");
    }


}