package baseline;

//import scanner
import java.util.Scanner;

public class Solution27 {

    /*
    Write a program that prompts for a first name, last name,
    employee ID, and ZIP code.
     Ensure that the input is valid according to these rules:

        The first name must be filled in.
        The last name must be filled in.
        The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.

Display appropriate error messages on incorrect data.
     */

    //method that checks if the first name is at least 2 letters long and is filled in
    public String validateFirstName(String fName){

        int len = fName.length();
        String response="";
        if(len<2)
            response += "The first name must be at least 2 characters long.\n";
        if(len == 0)
            response += "The first name must be filled in.\n";

        return response;
    }

    //method that checks if the last name is at least 2 letters long and is filled in
    public String validateLastName(String lName){

        int len = lName.length();
        String response="";
        if(len<2)
            response += "The last name must be at least 2 characters long.\n";
        if(len == 0)
            response += "The last name must be filled in.\n";

        return response;
    }

    //method that ensures that the zip code is a 5 digit number
    public String validateZIP(String zip){

        int len = zip.length();
        String response = "";
        if(len !=5)
            response="The zipcode must be a 5 digit number.\n";
        for(int i = 0 ;i<len;i++){
            //checking if the characters are digits
            if(!Character.isDigit(zip.charAt(i))){
                response = "The zipcode must be a 5 digit number.\n";
                break;
            }

        }
        return response;
    }

    //method that ensures the employee ID follows a particular format
    //format: 2 letters, hyphen, four numbers
    public String validateID(String id){

        String response= "";
        String cond = "The employee ID must be in the format of AA-1234.\n";
        //check first two characters are letters

        if(id.length()!=7)
            response = cond;

        for(int i = 0 ;i<2;i++){

            if(!Character.isLetter(id.charAt(i)))
                response = cond;

        }
        //check that there is a hyphen
        if(id.charAt(2) != '-')
            response = cond;
        //check that the rest are numbers
        for(int i=3;i<id.length();i++){

            if(!Character.isDigit(id.charAt(i)))
                response = cond;
        }

        return response;


    }

    //method that takes in all input and validates it using the other methods
    public void validateInput(String fName, String lName, String zip, String id){
        Solution27 sol = new Solution27();

        String response = "";

        response+=sol.validateFirstName(fName);
        response+=sol.validateLastName(lName);
        response+=sol.validateID(id);
        response+=sol.validateZIP(zip);

        System.out.println(response);



    }

    //Scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){
        Solution27 sol = new Solution27();

        //ask for and take in first name
        System.out.print("Enter the first name: ");
        String firstName = scan.nextLine();

        //ask for and take in last name
        System.out.print("Enter the last name: ");
        String lastName = scan.nextLine();

        //ask for and take in ZIP code
        System.out.print("Enter the ZIP code: ");
        String zip = scan.nextLine();

        //ask for and take in employee ID
        System.out.print("Enter the employee ID: ");
        String id = scan.nextLine();

        sol.validateInput(firstName,lastName,zip,id);


    }
}
