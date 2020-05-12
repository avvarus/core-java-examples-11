package com.training.company.two;

public class TestClazz {

    // construvtor
    // starts with class name
    // no return tyoe
    // used initialize value
    // take parameters


    int x, v, y;

    // default constructor
    public TestClazz() {
    }

    // X and V
    public TestClazz(int x, int v) {
        this.x = x;
        this.v = v;
    }


    public TestClazz(int x, int v, double dd) {
        this.x = x;
        this.v = v;
    }


    public TestClazz(int x, int v, int y) {
        //
        System.out.println("Testing Constructors !!");
        System.out.println("Multiplcation values for the supplied values is " + mulValues(x, v, y));
    }

    public TestClazz(int a, int b, String text) {
        //
        System.out.println("Trying out Constructors !!");
        System.out.println("Print value " + a);
        System.out.println("Print Value " + b);
        System.out.println("Print Value " + text);
    }

    /**
     * @param vale1
     * @param vale2
     * @param vale3
     * @return
     */
    private int mulValues(int vale1, int vale2, int vale3) {
        return vale1 * vale2 * vale3;

    }


}
