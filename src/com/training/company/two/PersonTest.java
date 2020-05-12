package com.training.company.two;

public class PersonTest {

    public static void main(String[] args) {

        Person john = new Person();

        john.setFirstName("John");
        john.setLastName("Smith");
        john.setAge(33);
        john.setEyeColor("Brown");
        john.setAddress("1 Water St");

        Person rita = new Person();

        rita.setFirstName("Rita");
        rita.setLastName("Nair");
        rita.setAge(33);
        rita.setEyeColor("Black");
        rita.setAddress("100 Manhattan ave");

// john and rita

        System.out.println(john.getFirstName());
        System.out.println(rita.getFirstName());


    }
}
