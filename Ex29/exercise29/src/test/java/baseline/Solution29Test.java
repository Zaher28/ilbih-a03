/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    Solution29 sol = new Solution29();

    @Test
    void yearsToDoubleInvestment() {
        assertEquals(18,sol.yearsToDoubleInvestment(4));
    }
}