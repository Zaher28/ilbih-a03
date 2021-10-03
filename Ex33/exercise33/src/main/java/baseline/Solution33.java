/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */

package baseline;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Solution33 {

    /*
    Create a Magic 8 Ball game that prompts for a question and
     then displays either "Yes," "No," "Maybe," or "Ask again later."
     */

    //method which takes in a list of options, then prompts the user for a question
    //and prints out a response from the "Magic 8 Ball"
    public void shakeMagic8Ball(String[] arr){
        //asks and takes in question
        System.out.println("What's your question?");
        scan.nextLine();
        //"shakes" the 8 ball
        int rand =(int) (Math.random()*4);

        System.out.printf("\n%s",arr[rand]);


    }

    //Scanner object for input
    public static final Scanner scan = new Scanner (System.in);

    //main method
    public static void main(String[] args){

        Solution33 sol = new Solution33();

        //list of responses
        String[] list;
        list = new String[]{"Yes,", "No,", "Maybe,", "Ask again later."};

        //"Shaking" the magic 8 ball
        sol.shakeMagic8Ball(list);


    }
}
