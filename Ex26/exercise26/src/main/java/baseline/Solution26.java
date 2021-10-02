package baseline;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution26 {

    /*
    Write a program that will help you determine how many months
    it will take to pay off a credit card balance.
    The program should ask the user to enter the
    balance of a credit card, the APR of the card, and their monthly payment.
    The program should then return the number of months needed (rounded up to the next integer value).
     */

    //scanner for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        //ask for and take in balance
        System.out.print("What is your balance? ");
        double bal = scan.nextDouble();

        //ask for and take in APR as a percent
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = scan.nextDouble();

        //ask for and take in monthly payment
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = scan.nextDouble();

        //create PaymentCalculator object to use PaymentCalculator methods
        PaymentCalculator pay = new PaymentCalculator(apr,bal,monthlyPayment);

        System.out.printf("It will take you %d months to pay off this card.", pay.calculateMonthsUntilPaidOff());



    }


}
