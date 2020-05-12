package com.company.training;

//import static com.copany.util.*;

public class Constants {

    public static final String PI_CONSTANT = "3.14456";

    static double areaCircle(int radius, String pi) {

        // PI * R square

        //radius * radius * pi


        return radius * radius * Double.parseDouble(pi);
    }

    public static void main(String[] args) {

        // final , static , that cant


        double areaCalculate = areaCircle(4, PI_CONSTANT);

        System.out.println("Area is " + areaCalculate);


    }


}
