package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */

    String dogName = "Dog Name";
    Integer dogAge = Integer.MAX_VALUE;
    String dogSpeak = "Bark";

    public Dog(String name, Integer age) {

        this.dogName = name;
        this.dogAge = age;

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {

        this.dogAge = age;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {

        this.dogName = name;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
    }

    /**
     * @return bark as a string
     */
    public String speak() {

        return this.dogSpeak;
    }
}
