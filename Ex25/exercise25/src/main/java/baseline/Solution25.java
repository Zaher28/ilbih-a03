package baseline;

public class Solution25 {

    /*
    Create a program that determines the complexity of a given password based on these rules:
        A very weak password contains only numbers and is fewer than eight characters.
        A weak password contains only letters and is fewer than eight characters.
        A strong password contains letters and at least one number and is at least eight characters.
        A very strong password contains letters, numbers, and special characters and is at least eight characters
     */


    //function that takes in a password and returns a number based on its strength
        //0 is very weak, 1 is weak, 2 is strong, 3 is very strong
        //-1 is unknown strength
    public int passwordValidator(String pass){

        //array that contains true/false values for each condition
        //indexes: 0 - # of characters > 8, 1 - letters, 2 - numbers, 3 - special characters
        boolean[] passStrength = new boolean[4];

        if (pass.length()>=8)
            passStrength[0]=true;

        //go through each character
        for(int i = 0;i<pass.length();i++){

            //check if the character is digit, letter, or special
            //and then set needed booleans to true in the passStrength array
            char temp = pass.charAt(i);

            if(Character.isLetter(temp))
                passStrength[1]=true;
            else if(Character.isDigit(temp))
                passStrength[2]=true;
            else
                passStrength[3]=true;

        }

        if(!passStrength[0] && !passStrength[1] && passStrength[2] && !passStrength[3])
            return 0;
        else if(!passStrength[0] && passStrength[1] && !passStrength[2] && !passStrength[3])
            return 1;
        else if(passStrength[0] && passStrength[1] && passStrength[2] && !passStrength[3])
            return 2;
        else if(passStrength[0] && passStrength[1] && passStrength[2] && passStrength[3])
            return 3;
        else
            return -1;

    }

    //main method
    public static void main(String[] args){

        Solution25 sol = new Solution25();

        //print out 4 instances of passwords of varying strengths

        //hold passwords and their strengths
        String[] passwords = new String[4];
        int[] strengths = new int[4];

        //holds password strengths in written form
        String[] strs = new String[4];
        strs[0] = " is a very weak password.";
        strs[1] = " is a weak password.";
        strs[2] = " is a strong password.";
        strs[3] = " is a very strong password.";

        //filling passwords and strengths arrays
        passwords[0] = "12345";
        strengths[0] = sol.passwordValidator(passwords[0]);

        passwords[1] = "abcdef";
        strengths[1] = sol.passwordValidator(passwords[1]);

        passwords[2] = "abc123xyz";
        strengths[2] = sol.passwordValidator(passwords[2]);

        passwords[3] = "1337h@xor!";
        strengths[3] = sol.passwordValidator(passwords[3]);

        String response1= "The password '" + passwords[0] + "'" + strs[strengths[0]];
        String response2= "The password '" + passwords[1] + "'" + strs[strengths[1]];
        String response3= "The password '" + passwords[2] + "'" + strs[strengths[2]];
        String response4= "The password '" + passwords[3] + "'" + strs[strengths[3]];

        System.out.println(response1 + "\n" + response2 + "\n" + response3 + "\n" + response4);
    }

}
