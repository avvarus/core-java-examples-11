package com.company.training;

public class ForLoop {

    public static void main(String[] args) {


        //i++ === i+1
//        for (int i=0 ; i<5 ; i++){
//
//            System.out.println(i);
//
//        }
//        System.out.println("End of for loop ");

//        for (int i = 10; i <= 10; i = i + 2) {
//
//            System.out.println(i);
//
//        }

//
//        for (int i = 10; i >= 0; i--) { // decrement
//
//            System.out.println(i);
//
//        }


//break and continue
        for (int i =0 ; i<=10;i++){

            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End of the loop !!");
    }

}


/**
 * for loop
 * <p>
 * for (statememt1 ; statememnt 2 ;, statement 3){
 * <p>
 * // block block
 * <p>
 * }
 * <p>
 * statement 1 before the execution block,
 * ststment 2 defines the condition for execution the code block
 * statement is executed after the code black has been executed
 */
