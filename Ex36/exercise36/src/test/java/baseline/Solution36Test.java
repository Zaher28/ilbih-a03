/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zaher Ilbih
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    Solution36 sol = new Solution36();




    @Test
    void average() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(400.00,sol.average(numbers));
    }

    @Test
    void max() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(1000,sol.max(numbers));
    }

    @Test
    void min() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(100,sol.min(numbers));
    }

    @Test
    void std() {
        List<Integer> numbers = new ArrayList<>();
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals(353.55,Double.parseDouble(nf.format(sol.std(numbers))));
    }
}