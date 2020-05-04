package com.company.training;

public class Operators {


    public static void main(String[] args) {

        /// +, _, *, /, %,  Arthematic
        // ++, -- // increment , decrement
        //<, > == , >!=,<!=  Comparator operators
        // && , || , !

        int x = 2;
        // x > 3  && x < 10


        /* && operator
         *   True   &&  True = True
         *   true   && False = false
         *   false && true = false
         *   false && false = false
         *
         * */

        /*  || operator
         *   True   ||  True = True
         *   true   || False = true
         *   false || true = true
         *   false || false = false
         *
         * */


        System.out.println(x > 3 || x < 10);


        // !


        boolean bool = true;
        System.out.println("value " + !bool);

        // true ---> false

    }


}
