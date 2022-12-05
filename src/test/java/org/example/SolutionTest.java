package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int result, steps;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void onlyOneStep(){

        steps = 1;
        result = 1;

        assertEquals(result, solution.climbStairs(steps));

    }

    @Test
    public void TwoSteps(){

        steps = 2;
        result = 2;

        assertEquals(result, solution.climbStairs(steps));

    }

    @Test
    public void ThreeSteps(){

        steps = 3;
        result = 3;

        assertEquals(result, solution.climbStairs(steps));

    }

    @Test
    public void TenSteps(){

        steps = 10;
        result = 89;

        assertEquals(result, solution.climbStairs(steps));

    }
}
