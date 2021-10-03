/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    Solution27 sol = new Solution27();

    @Test
    void validateFirstName() {
        assertEquals("The first name must be at least 2 characters long.\n", sol.validateFirstName("J"));
    }

    @Test
    void validateLastName() {
        assertEquals("The last name must be at least 2 characters long.\n" + "The last name must be filled in.\n", sol.validateLastName(""));
    }

    @Test
    void validateZIP() {
        assertEquals("The zipcode must be a 5 digit number.\n", sol.validateZIP("ABCDE"));
    }

    @Test
    void validateID() {
        assertEquals("The employee ID must be in the format of AA-1234.\n", sol.validateID("A12-1234"));
    }

}