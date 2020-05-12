package com.training.company.two;

public class InterfaceExample implements Inter, AnotherInterface {
    @Override
    public void somBehavior() {
        System.out.println("I have some behavior");
    }

    @Override
    public void secondBehavior() {

        System.out.println("I have some behavior from another method ");
    }
}
