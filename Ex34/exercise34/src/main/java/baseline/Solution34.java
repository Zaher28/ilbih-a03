/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

//to use a list
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {

    /*
    Create a small program that contains a list of employee names.
    Print out the list of names when the program runs the first time.
    Prompt for an employee name and remove that specific name from the list of names.
    Display the remaining employees, each on its own line.
     */

    //method that takes in the list of names and the name to remove and removes it
    public void removeEmployeeFromList(List<String> employees, String nameToRemove){

        employees.remove(nameToRemove);

    }
    //Scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        Solution34 sol = new Solution34();

        //list of employees
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("There are 5 employees:");

        //for each to go through and print all employees
        for (String employee : employees) {
            System.out.printf("%s\n", employee);
        }

        //remove employee and spacing
        System.out.print("\nEnter an employee name to remove: ");
        String nameToRemove = scan.nextLine();
        System.out.println();

        sol.removeEmployeeFromList(employees, nameToRemove);

        //for each to go through and print all remaining employees
        System.out.println("There are 4 employees:");
        for(String employee: employees){
            System.out.printf("%s\n",employee);
        }

    }

}
