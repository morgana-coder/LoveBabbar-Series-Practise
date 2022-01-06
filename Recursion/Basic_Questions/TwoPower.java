package Recursion.Basic_Questions;

import java.util.Scanner;

public class TwoPower {
    public static int power_of_two(int n) {
        // base condition
        if (n == 0)
            return 1;
        // smallerproblem=f(n-1);
        // biggerproblem=2*smallerProblem;
        return 2 * power_of_two(n - 1);
        // 2*->2,3
        // 2*->2,2
        // 2*->2,1
        // 2*->2,0

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int ans = power_of_two(n);
        System.out.println(ans);
    }

}
