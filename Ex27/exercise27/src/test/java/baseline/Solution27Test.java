package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    Solution27 sol = new Solution27();

    @Test
    void validateFirstName() {
        assertEquals("The first name must be at least 2 characters long.", sol.validateFirstName("J") );
    }

    @Test
    void validateLastName() {
        assertEquals("The last name must be filled in.", sol.validateLastName(""));
    }

    @Test
    void validateZIP() {
        assertEquals("The zipcode must be a 5 digit number.", sol.validateZIP("ABCDE"));
    }

    @Test
    void validateID() {
        assertEquals("The employee ID must be in the formal of AA-1234.",sol.validateID("A12-1234"));
    }

    @Test
    void validateInput() {
        assertEquals("There were no errors found.", sol.validateInput("John", "Johnson", "55555", "TK-4321"));
    }
}