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