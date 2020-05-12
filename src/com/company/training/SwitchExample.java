package com.company.training;

public class SwitchExample {


    /*
     *   if (month == 1){
     *   Jan
     * }
     * if()
     * EXPRESSION == >
     * SWITCH(EXPRESSION){
     *
     *   CASE X :
     * /// STATEMENTS
     *
     * BREAK;
     * }
     *
     * CASE Y :
     *
     * // STATEMENTS
     *
     * DEFAULT:
     *
     * //
     *}
     * */


    public static void main(String[] args) {

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Today is Monday!!");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            case 3:
                System.out.println("Today is Wed");
                break;
            case 4:
                System.out.println("Today is Thrusday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is  Sunday!! ");
        }


        //  int day = 3;


//        if(day==1){
//            System.out.println("Today is MOnday");
//        }
//        if(day==2){
//            System.out.println("Today is Tuesday");
//        }
//        if(day==3){
//            System.out.println("Today is Wed");
//        }
//        if(day==4){
//            System.out.println("Today is Thrsuday");
//        }
//        if(day==5){
//            System.out.println("Today is Fri");
//        }
//        if(day==6){
//            System.out.println("Today is Saturday");
//        } if(day==7){
//            System.out.println("Today is Sunday");
//        }
//

    }
}
