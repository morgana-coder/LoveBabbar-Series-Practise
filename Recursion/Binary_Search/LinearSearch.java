package Recursion.Binary_Search;

import java.util.*;

public class LinearSearch {
    public static boolean search_number(int arr[], int n, int i, int num) {
        if (n == 0)
            return false;
        if (arr[i] == num)
            return true;
        return search_number(arr, n - 1, i + 1, num);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        int num = 6;
        boolean flag = search_number(arr, n, 0, num);
        if (flag == true)
            System.out.println("Number is present");
        else
            System.out.println("Number is not present");

    }

}
