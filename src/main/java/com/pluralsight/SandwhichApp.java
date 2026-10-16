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

        //start calculating the total
        double total = 0;

        //depending on sammy size update the total
        if(sammySize == 1){
            //update the total to be 5.45

        }else if(sammySize == 2){
            //update the total to 8.95

        }else{
            //they gave us a bad choice
            System.out.println("I cant understand you selection");
            System.exit(0);
        }

        //determine discount based on age (if there is a discount) and update the total
        if(age <= 17){

            //take 10% off the total

        }else if( age >= 65){

            //take 20% off the total

        }

        //display the total
        System.out.printf("Sammy total: $%.2f", total);

    }

}
