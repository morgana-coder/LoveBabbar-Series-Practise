package Recursion.Basic_Questions;

import java.util.*;

public class Counting {
    public static void countPrint(int n) {
        if (n == 0)
            return;

        // head recursion
        countPrint(n - 1);
        System.out.print(n + " ");
    }

    public static void reversecountPrint(int n) {

        if (n == 0)
            return;
        System.out.print(n + " ");
        // Tail recursion
        reversecountPrint(n - 1);

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        countPrint(n);
        System.out.println();
        reversecountPrint(n);
        System.out.println();

    }

}
