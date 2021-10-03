/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {

    /*
    Write a program that prompts for response times from a website in milliseconds.
    It should keep asking for values until the user enters done
    The program should print the average time (mean),
    the minimum time, the maximum time, and the population standard deviation.
     */


    //method that takes in a list of numbers and returns the average
    public double average(List<Integer> numbers){

        int sum=0;
        for(Integer i : numbers){
            sum+=i;
        }

        return sum/(1.0*numbers.size());

    }

    //method that takes in a list of numbers and returns the biggest number
    public int max(List<Integer> numbers){

        int max=0;

        for(Integer i : numbers){
            if(max<i){
                max= i;
            }
        }

        return max;
    }

    //method that takes in a list of numbers and returns the smallest number
    public int min(List<Integer> numbers){

        int min=Integer.MAX_VALUE;

        for(Integer i : numbers){
            if(min>i){
                min= i;
            }
        }

        return min;

    }

    //method that takes in a list of numbers and returns the standard deviation of the numbers
    public double std(List<Integer> numbers){

        double mean = average(numbers);
        double sum=0;

        for(Integer i: numbers){

            sum+=Math.pow(i-mean,2);

        }

        return Math.sqrt(sum/numbers.size());
    }



    //Scanner object for inputs
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        Solution36 sol = new Solution36();

        List<Integer> stats = new ArrayList<>();

        boolean isValid=true;
        String number="";
        int num=0;

        do{
            System.out.print("Enter a number: ");
            number = scan.nextLine();

            try{
                num=Integer.parseInt(number);
                stats.add(num);

            }catch(Exception e){

                if(number.equals("done"))
                    isValid=false;
                else{
                    System.out.print("Input has to be a positive integer!\n");
                }

            }


        }while(isValid);

        System.out.print("Numbers: ");
        for (Integer i : stats) {

            System.out.printf("%d, ", i);

        }

        System.out.println();

        System.out.printf("The average is %.2f\n",sol.average(stats));
        System.out.printf("The minimum is %d\n", sol.min(stats));
        System.out.printf("The maximum is %d\n", sol.max(stats));
        System.out.printf("The standard deviation is %.2f", sol.std(stats));

    }
}
