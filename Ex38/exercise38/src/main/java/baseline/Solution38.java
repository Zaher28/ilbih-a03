/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.Scanner;

public class Solution38 {

    //method that converts a string into an int array
    public int[] convertStringToIntArray(String numbers){


        //have temp variable be start of string
        char temp=numbers.charAt(0);
        int i=0;
        int countSpaces=0;
        String sub=numbers;
        int j=0;

        //count spaces in string to know size of future array
        while(sub.indexOf(' ')!=-1){

            sub= sub.substring(sub.indexOf(' ') + 1);
            countSpaces++;

        }

        //new array
        int[] arr = new int[countSpaces+1];

        //get all the numbers separated by white spaces
        while(i<numbers.length()){

            if(temp == ' '){
                i++;
                temp = numbers.charAt(i);
                continue;
            }

            String num = "";
            while(temp!=' ' && i<numbers.length()){

                num+=temp;
                i++;
                if(i<numbers.length())
                    temp=numbers.charAt(i);



            }

            arr[j] = Integer.parseInt(num);
            j++;
            i++;
            if(i<numbers.length())
                temp = numbers.charAt(i);



        }

        return arr;
    }

    //method that takes in an array of numbers and
    // returns an array with only the even ones
    public int[] filterEvenNumbers(int[] numbers){

        int count=0;
        int j=0;

        for(int i: numbers){
            if(i%2 == 0)
                count++;
        }

        int[] even = new int[count];

        for(int i =0;i<numbers.length;i++){
            if(numbers[i]%2 == 0){
                even[j]=numbers[i];
                j++;
            }


        }

        return even;

    }

    //Scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        Solution38 sol = new Solution38();

        //ask for numbers and store them in String to later parse into array
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = scan.nextLine();

        int[] arr = sol.convertStringToIntArray(numbers);
        int[] even = sol.filterEvenNumbers(arr);

        System.out.print("The even numbers are");
        for(int i: even){
            System.out.print(" " + i);
        }
        System.out.println(".");




    }
}
