package com.training.company.two;

//    Accessmodifier returnType methodName(parameters){
//        //statments
// logic
//    }

public class InheritClazz {
    //main method
//    public static void main(String[] args) {
//
//        InheritClazz inheritClazz = new InheritClazz();
//
//
//        System.out.println("Additional Value is " + inheritClazz.getAdd(2, 3));
//        System.out.println("Substraction Value is " + inheritClazz.getSubt(14, 8));
//    }

    /**
     * Adding Two Int variables
     *
     * @param a
     * @param b
     * @return
     */
    public int getAdd(int a, int b) {
        int c = a + b;
        return c;
    }


    /**
     * Subtracting two int
     *
     * @param a
     * @param b
     * @return
     */
    public int getSubt(int a, int b) {

        // a = 2;  b = 10   = -8
        int c = 0;

        if (a > b) {

            c = a - b; //-8

        }
        return c;

    }


}
