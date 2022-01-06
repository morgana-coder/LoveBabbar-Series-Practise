package Recursion.Basic_Questions;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci_series(int n) {
        // smallerProblem=0,1,a+b
        // biggerProblem=
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        return fibonacci_series(n - 1) + fibonacci_series(n - 2);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int k = fibonacci_series(i);
            System.out.println(k);
        }
    }

}
