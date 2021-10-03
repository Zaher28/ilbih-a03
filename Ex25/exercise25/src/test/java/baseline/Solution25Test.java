/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    Solution25 sol = new Solution25();

    @Test
    void passwordValidator() {
        assertEquals(2, sol.passwordValidator("abc123xyz"));
    }
}