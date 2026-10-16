package com.pluralsight;

import java.util.Scanner;

public class SandwhichApp {

    public static void main(String[] args) {

        //create a scanner to get input from folks
        Scanner myScan = new Scanner(System.in);

        //ask what size sammy do you want?
        System.out.println("""
                What size sammy do you want?
                    1) Regular ($5.45)
                    2) Large ($8.95)
                Let me know when you are ready:
                """);

        //capture the answer
        int sammySize = myScan.nextInt();

        //ask them their age
        System.out.println("""
                How old are you?
                <= 17 gets 10% off
                >= 65 gets 25% off 
                """);

        int age = myScan.nextInt();



    }

}
