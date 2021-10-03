/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.Scanner;

public class Solution32 {

    /*
    Write a Guess the Number game that has three levels of difficulty.
    The first level of difficulty would be a number between 1 and 10.
    The second difficulty set would be between 1 and 100.
    The third difficulty set would be between 1 and 1000.
     */

    //method that lets the user play the Guess the number game
    public void guessTheNumber(){

        int difficulty=0;

        int guess=0;
        int count=1;
        boolean isValid=true;
        //loop to trap bad input
        do{
            System.out.print("Enter the difficulty level (1, 2, 3): ");
            try{
                difficulty = scan.nextInt();
                isValid=false;
                //checks if difficulty is between 1 and 3
                if(difficulty<=0 || difficulty >=4){
                    System.out.println("You have to input a number between 1 and 3!");
                    isValid=true;
                }


            }
            catch(Exception e){
                System.out.println("You have to input a number between 1 and 3!");
                scan.nextLine();
            }


        }while(isValid);

        //makes a random number based on the difficulty level
        int number = (int) (Math.random()* Math.pow(10,difficulty)) + 1;

        System.out.print("I have my number. What's your guess? ");

        //loop that counts non numeric input as a bad guess
        do{

            isValid = false;

            try{
                guess = scan.nextInt();
                isValid = true;
            }
            catch(Exception e){
                System.out.print("Has to be a number. Guess again: ");
                scan.nextLine();
                count++;

            }

            if(guess<number && isValid){
                System.out.print("Too low. Guess again: ");
                count++;
            }

            if(guess>number && isValid){
                System.out.print("Too high. Guess again: ");
                count++;
            }




        }
        while(number!=guess);

        System.out.printf("You got it in %d guesses!\n", count);


    }

    //Scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution32 sol = new Solution32();
        String playAgain;

        System.out.println("Let's play Guess the Number!\n");


        //loop to keep the game going as long as the user wants to
        do{
            sol.guessTheNumber();
            scan.nextLine();
            System.out.print("\nDo you wish to play again (Y/N)? ");
            playAgain = scan.nextLine();
            System.out.println();
        }while(!playAgain.equals("n") && !playAgain.equals("N"));



    }
}
