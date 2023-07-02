package org.fasttrackit.tema7;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person (String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isMarried() {
        return this.married;
    }

    public String toString() {
        return String.format(("Persona %s are %d ani si este casatorit?"),name, age) + married;
    }

    public String isMajor() {
        String ageLimit = age > 18 ? "Major" : "minor";
        String altString = "";
        if(age>18){
            altString = "Major;";
        }else {
            altString = "Minor";
        }
        return "";
    }
}
