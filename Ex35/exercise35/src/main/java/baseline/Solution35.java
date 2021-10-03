/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

//for scanner and arrayList
import java.util.*;

public class Solution35 {


    //method that will pick a winner out of a bunch of names in the list
    public void pickAWinner(List<String> names){

        int rand =(int) (Math.random()*names.size());

        System.out.printf("The winner is... %s",names.get(rand));

    }
    //method that will take in all names and put them into a list
    public void takeInInput(List<String> names){

        String name="";
        //loop that takes in input until a blank is reached
        do{

            System.out.print("Enter a name: ");
            name = scan.nextLine();

            if(!name.equals(""))
                names.add(name);

        }while(!name.equals(""));


    }

    //Scanner object for input
    public static final Scanner scan = new Scanner (System.in);

    //main method
    public static void main(String[] args){

        Solution35 sol = new Solution35();

        //list to hold in the names
        List<String> names = new ArrayList<>();

        //take in input and pick a winner
        sol.takeInInput(names);
        sol.pickAWinner(names);

    }
}
