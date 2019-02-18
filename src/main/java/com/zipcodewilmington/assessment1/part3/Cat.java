package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    String catName = "Wiggles";
    Integer catAge =  5;


    public Cat(String name, Integer age) {

        this.catName = name;
        this.catAge = age;


    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

        this.catAge = age;

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {

        this.catName = name;

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
    }
    String catSpeak = "meow";
    /**
     * @return meow as a string
     */
    public String speak() {

return catSpeak;
    }
}
