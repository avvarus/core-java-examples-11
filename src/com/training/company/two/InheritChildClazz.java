package com.training.company.two;

public class InheritChildClazz extends InheritClazz {

    // Extends keywords


    /**
     * this method muls two int values
     *
     * @param a
     * @param b
     * @return
     */
    public int getMultiplication(int a, int b) {

        return a * b;
    }

    /**
     * this method divides two int values
     *
     * @param a
     * @param b
     * @return
     */
    public int getDivision(int a, int b) {

        return a / b;  //Asuming a > b
        // break;
        //continue;
    }
}
