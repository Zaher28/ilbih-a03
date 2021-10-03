/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.Scanner;

public class Solution28 {

    /*
    Write a program that prompts the user for five numbers
     and computes the total of the numbers.
     */

    //method that sums up 5 numbers with a for loop
    public double sumNumbers(){

        double sum=0.00;

        for(int i = 0;i<5;i++){

            System.out.print("Enter a number: ");
            sum+=scan.nextDouble();

        }

        return sum;

    }

    //Scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){
        //Solution28 object to use its methods
        Solution28 sol = new Solution28();

        System.out.printf("The total is %.2f", sol.sumNumbers());

    }
}
