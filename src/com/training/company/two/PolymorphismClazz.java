package com.training.company.two;


// OOPS Polymorphism
//Interheritance  overriding, overloading
//Encapsulation -- >
// Abstraction -- >  CAR -- > doors, tires, color, left , right ,
// class , object ,

// is - A   child is from parent
// touch phone is a phone
/*
 *
 * */

public class PolymorphismClazz {

    public static void main(String[] args) {

        DogClazz dog = new DogClazz();
        dog.getSound();

        HorseClazz horse = new HorseClazz();
        horse.getSound();

    }

}
