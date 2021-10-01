package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    Solution25 sol = new Solution25();

    @Test
    void passwordValidator() {
        assertEquals(3, sol.passwordValidator("abc123xyz"));
    }
}