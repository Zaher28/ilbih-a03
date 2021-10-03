/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

public class Solution30 {

    /*
    Create a program that generates a multiplication
     table for the numbers 1 through 12 (inclusive).
     */

    //method that generates a multiplication table
    public void generateMultiplicationTable(){

        for(int i=1;i<=12;i++){

            for(int j = 1;j<=12;j++){

                System.out.printf("%5s   ",i*j);


            }

            System.out.println();

        }
    }

    //main method
    public static void main(String[] args){

        Solution30 sol = new Solution30();

        sol.generateMultiplicationTable();

    }

}
