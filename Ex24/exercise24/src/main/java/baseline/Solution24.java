/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.Scanner;

public class Solution24 {

    /*
    Create a program that compares two strings and determines if the two strings are anagrams.
    The program should prompt for both input strings and display the output as shown in the example that follows.
     */

    //method that takes in two Strings and compares them to see if they are anagrams of each other
    //returns true if they are anagrams and false if they are not
    public boolean isAnagram(String word1, String word2){

        // checks if word lengths are the same, if they arent they are not anagrams
        if(word1.length() != word2.length()){
            return false;
        }
        //array that will keep count of how many letters in word 1
        int[] letterCount1 = new int[26];
        //array that will keep count of how many letters in word 2
        int[] letterCount2 = new int[26];

        //makes words lowercase for easier comparison
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        for(int i =0 ;i<word1.length();i++){

            letterCount1[word1.charAt(i)-97]++;
        }

        for(int i = 0;i<word2.length();i++){

            letterCount2[word2.charAt(i)-97]++;

        }

        for(int i=0;i<letterCount1.length;i++){

            if(letterCount1[i] != letterCount2[i])
                return false;

        }

        return true;

    }

    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){
        //init object of class in order to use its methods
        Solution24 sol = new Solution24();

        //prompt and take in input
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String word1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String word2 = scan.nextLine();

        //check if they are anagrams
        if(sol.isAnagram(word1,word2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", word1, word2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1,word2);
        }


    }


}
