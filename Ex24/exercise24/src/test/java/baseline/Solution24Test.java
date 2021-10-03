/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    Solution24 sol = new Solution24();

    @Test
    void isAnagram(){
        assertEquals(true, sol.isAnagram("learnt", "antler"));
    }


}