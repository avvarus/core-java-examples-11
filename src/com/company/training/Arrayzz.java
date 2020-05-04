package com.company.training;

public class Arrayzz {

    public static void main(String[] args) {



        // Arrays are used to store multiple values in a single variab;e.
        //instead of declaring multiple variables for each value.

        int q = 10;
        int w = 20;
        int f = 30;


        // TypeoftheArray[] variableName = {};

        int[] myInt = {10,20,30,40}; //4
        //index, this used to retrive the arrays
        //change in array value
        myInt[2]=50;
        //System.out.println(myInt[2]);


        // size of the array
        //System.out.println(myInt.length);


        // Access the array
        for (int r=0 ; r<myInt.length; r++){

            System.out.println(myInt[r]);
        }
        System.out.println("End of the loop");


        //ArrayIndexOutOfBoundsException
       // myInt[6]=100;
        //System.out.println(myInt[6]);

//Once array initialized, you can change the values of the array,
// but cant access the elemnts out of sized of the array


        String[] cars = {"tesla","bmw","fiat"};

        for (int r=0 ; r<cars.length; r++){

            System.out.println(cars[r]);
        }

        // multi dimention array

        int[][] myInts = {{1,2,3,4,5},{5,6,7}};

        for (int i=0; i<myInts.length; ++i ){
            for(int j =0;j<myInts[i].length;++j){
                System.out.println(myInts[i][j]);
            }
        }



    }
}
