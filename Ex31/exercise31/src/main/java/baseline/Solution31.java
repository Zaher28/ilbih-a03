package baseline;

import java.util.Scanner;

public class Solution31 {

    /*
     When getting into a fitness program, you may want to figure out your target heart rate
     so you don’t overexert yourself. The Karvonen  heart rate formula is one
     method you can use to determine your rate
     Create a program that prompts for your age and your resting heart rate. Use the Karvonen
     formula to determine the target heart rate based on a range of intensities from 55% to 95%.
     Generate a table with the results as shown in the example output.
     */

    //method that generates a karvonen Heart Rate table
    public void generateKarvonenHeartRateTable(int resting, int age){

        Solution31 sol = new Solution31();

        System.out.printf("Resting Pulse: %d\tAge: %d\n\n", resting, age);
        System.out.println("Intensity\t | Rate");
        System.out.println("-------------|--------");

        for(int i=55;i<=95;i+=5){

            System.out.printf("%d%%\t\t\t | %d bpm\n", i, sol.calculateTargetHeartRate(resting,i,age));

        }

    }

    //method that calculates target heart rate based on resting heart rate, intensity, and age
    public int calculateTargetHeartRate(int resting, int intensity, int age){

        return (int) Math.round((((220-age) - resting)*intensity/100.0) + resting);

    }


    //Scanner object for input
    public static final Scanner scan = new Scanner(System.in);

    //main method
    public static void main(String[] args){

        Solution31 sol = new Solution31();

        String restingHeartRate = "";
        String age="";
        int ages=0;
        int restingRate=0;

        boolean isValid = true;
        //loop to ensure bad inputis trapped
        do{
            System.out.print("What is your resting heart rate? ");
            restingHeartRate = scan.nextLine();

            System.out.print("What is your age? ");
            age = scan.nextLine();
            try{
                ages = Integer.parseInt(age);
                restingRate = Integer.parseInt(restingHeartRate);
                isValid = false;
            }
            catch(Exception e){
                System.out.println("You must input numbers!");
            }

        }while(isValid);

        sol.generateKarvonenHeartRateTable(restingRate,ages);


    }


}
