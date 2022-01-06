package Recursion.Basic_Questions;

import java.util.*;

public class Factorial {
    public static int func_factorial(int n) {
        // base condition
        if (n == 0)
            return 1;
        // smallerproblem=fact(n-1);
        // biggerproblem=n*smallerproblem;
        // return biggerproblem;
        return n * func_factorial(n - 1); // this can be written as bigger=smaller*n
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int f = func_factorial(n);
        System.out.println(f);

    }
}
