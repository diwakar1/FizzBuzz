package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String Fizz = getBuzz(i);
            System.out.println(Fizz);

        }
    }


        public static String getBuzz ( int i){

            String fb ;


            if ((i % 3 == 0) && (i % 5 == 0)) {
                fb = "FizzBuzz";
            } else if ((i % 3 == 0)) {
                fb = "Fizz";
            } else if (i % 5 == 0) {
                fb = "Buzz";
            } else {
                fb = Integer.toString(i);

            }


            return fb;
        }
    }












