package Recursion.Basic_Questions;

import java.util.*;

public class SayDigit {
    public static String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void say_digit(int n) {
        if (n == 0)
            return;
        int digit = n % 10;
        say_digit(n / 10);
        System.out.print(arr[digit] + " ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        say_digit(n);
    }
}
