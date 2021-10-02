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
    //calculates months left to pay off credit card
    public int calculateMonthsUntilPaidOff(){

        int monthsLeft;



        return monthsLeft;
    }
}
