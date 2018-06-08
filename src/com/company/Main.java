package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
public class Main {

    static int ind = 0;
    static String[] a = {"rock", "Paper", "scissors","Lizard","spock"};


    public static void main(String[] args) {
        Random rand = new Random();
        int random1 = getRandomNumber();
        int random2 = getRandomNumber();

        System.out.println("welcome to the Crazy Fun Insane FizBuzz");

        if (random1 == random2) {
            System.out.println("Shazam!!");
        } else {
            if (random1 < random2) {
                int stor = random1;
                random1 = random2;
                random2 = stor;
            }
            if ((random1 - random2) < 10) {
                System.out.println("this won't take long");

            }

            for (int i = random2; i <= random1; i++) {
                String Fizz = getBuzz(i);
                System.out.println(Fizz);

            }
        }
    }


    public static String getBuzz(int i) {

        String fb = "";


        if ((i % 3 == 0) && (i % 5 == 0)) {
            fb = "FizzBuzz";
        } else if ((i % 3 == 0)) {
            fb = "Fizz";
        } else if (i % 5 == 0) {
            fb = "Buzz";


        } else {
            fb = Integer.toString(i);

        }
        if (i % 7 == 0) {

            fb = fb + " -This number is multiple of seven";

        }
        else if ((i % 2 == 0) && (i > 10)) {

            fb = fb + " " + a[ind];
            ind++;
            if(ind >4 ){

                ind =0;

            }


        }
        return fb;
    }


        public static int getRandomNumber () {
            Random rand = new Random();

            int num = rand.nextInt(100) + 1;

            return num;
        }


    }














