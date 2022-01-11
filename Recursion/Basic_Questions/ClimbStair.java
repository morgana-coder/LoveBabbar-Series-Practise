package Recursion.Basic_Questions;

import java.util.Scanner;

public class ClimbStair {
    public static int number_of_ways(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        return number_of_ways(n - 1) + number_of_ways(n - 2);
    }

    public static void main(String[] args) {
        // dp based and recursion
        // You have been given a number of stairs. Initially, you are at the 0th stair,
        // and you need to reach the Nth stair.
        // Each time you can either climb one step or two steps.
        // You are supposed to return the number of distinct ways in which you can climb
        // from the 0th step to Nth step.
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int ans = number_of_ways(n);
        System.out.println(ans);
    }

}
