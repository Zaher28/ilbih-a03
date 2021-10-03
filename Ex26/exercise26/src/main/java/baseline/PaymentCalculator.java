/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

public class PaymentCalculator {
    //private fields for the PaymentCalculator class
    private double balance;
    private double monthPayment;
    private double dailyRate;
    //public constructor for the class object to take in the private fields
    public PaymentCalculator(double apr, double balance, double monthPayment){

        this.balance = balance;
        this.monthPayment = monthPayment;
        dailyRate = (apr/100.0)/365.0;
    }
    //calculates months left to pay off credit card based on formula
    public int calculateMonthsUntilPaidOff(){

        int monthsLeft;

        //calculates months left
        monthsLeft =(int) Math.ceil((-1.0/30.0)* (Math.log(1 + (balance/monthPayment)*(1-Math.pow(1+dailyRate,30))))/(Math.log(1+dailyRate)));

        return monthsLeft;
    }
}
