/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution29 {


    /*
    Write a quick calculator that prompts for the rate of return on an investment
    and calculates how many years it will take to double your investment.
     */

    //method that takes in rate of return and calculates the years to double the investment
    public int yearsToDoubleInvestment(int rateOfReturn){

        return 72/rateOfReturn;
    }

    //method that takes in input and ensures it is correct
    public void takeInInput(){

        Solution29 sol = new Solution29();

        int rateOfReturn=0;
        boolean isValid = true;

        do{

            System.out.print("What is the rate of return? ");
            //tries to get correct input
            try{
                rateOfReturn = scan.nextInt();
                isValid=false;
                //if input is 0, say its invalid and ensure loop continues
                if(rateOfReturn==0){
                    isValid=true;
                    System.out.print("Sorry. That's not a valid input.\n");
                }

            }
            //catches exception
            catch(Exception e){
                //invalid input
                System.out.print("Sorry. That's not a valid input.\n");
                scan.next();
            }

        }
        while(isValid);

        System.out.printf("It will take %d years to double your initial investment.", sol.yearsToDoubleInvestment(rateOfReturn));

    }

    //Scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        Solution29 sol = new Solution29();

        sol.takeInInput();

    }




}
