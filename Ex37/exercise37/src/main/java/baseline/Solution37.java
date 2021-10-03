/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution37 {

    /*
    Create a program that generates a secure password.
    Prompt the user for the minimum length, the number of special characters, and the number of numbers.
     Then generate a password for the user using those inputs.
     */

    //method that takes in the minimum length of the password,
    // how many special characters, and how many numbers are in the password
    public String generatePassword(int minLen,int specialChars, int numbers){

        List<Character> alphabet = new ArrayList<>();

        List<Character> numberList = new ArrayList<>();

        List<Character> specials = new ArrayList<>();

        List<Character> password = new ArrayList<>();

        //list for letters
        for(int i=0;i<26;i++){
            alphabet.add(i,(char) ('a' + i));
        }

        //list for numbers
        for(int i=0;i<10;i++){
            numberList.add(i,(char) (i+'0'));
        }

        //list for special characters
        for(int i=33;i<48;i++){
            specials.add(i-33,(char) i);
        }

        //add random special characters to the password
        for(int i=0;i<specialChars;i++){

            int rand = (int) (Math.random()*specials.size());
            password.add(specials.get(rand));

        }

        //add random numbers to the password
        for(int i=0;i<numbers;i++){

            int rand = (int) (Math.random()*numberList.size());
            password.add((char) numberList.get(rand));
        }


        for(int i=0;i<minLen - numbers+specialChars;i++){

            int rand = (int) (Math.random()*alphabet.size());
            password.add(alphabet.get(rand));

        }

        /*
         for(Character c : password){
            System.out.printf("%c",c);
        }
         */

        //finally compose the password by jumbling around the list
        String pass="";
        int temp = password.size();
        for(int i=0;i<temp;i++){

            int rand = (int) (Math.random()*password.size());

            pass+=password.get(rand);

            password.remove(password.get(rand));

        }

        return pass;

    }

    //Scanner object for taking input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        Solution37 sol = new Solution37();

        System.out.print("What's the minimum length? ");
        int minLen = scan.nextInt();
        System.out.print("How many special characters? ");
        int specialChars = scan.nextInt();
        System.out.print("How many numbers? ");
        int nums = scan.nextInt();

        String password= sol.generatePassword(minLen,specialChars,nums);

        System.out.println(password);
    }


}
