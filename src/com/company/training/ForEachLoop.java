package com.company.training;

public class ForEachLoop {

    public static void main(String[] args) {


        //for each

        // for (type variable: arrayName){
        //  // code blocks
        // }

        String[] cars = {"tesla","bmw","fiat"};

//        for (int r=0 ; r<cars.length; r++){
//
//            System.out.println(cars[r]);
//        }

 // for each
        for (String str :cars) {

            System.out.println(str);

        }

    }
}
