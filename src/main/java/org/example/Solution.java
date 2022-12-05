package org.example;

public class Solution {
    public Solution(){

    }

    public int climbStairs(int n) {

        if(n == 1 ){

            return 1;
        }
        if ( n == 2) {

            return 2;
        }

        n = climbStairs(n - 1) + climbStairs(n - 2);

        return n;
    }
}