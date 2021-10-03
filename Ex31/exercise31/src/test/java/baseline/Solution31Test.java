/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    Solution31 sol = new Solution31();

    @Test
    void calculateTargetHeartRate() {
        assertEquals(138, sol.calculateTargetHeartRate(65,55,22));
    }
}