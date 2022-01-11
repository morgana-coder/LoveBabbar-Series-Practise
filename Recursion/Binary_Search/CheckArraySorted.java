package Recursion.Binary_Search;

import java.util.Scanner;

public class CheckArraySorted {
    public static boolean isSort(int arr[], int n, int i) {
        if (n == 0 || n == 1)
            return true;
        // checking for aescending order
        if (arr[i] > arr[i + 1])
            return false;

        return isSort(arr, n - 1, i + 1);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();

        boolean flag = isSort(arr, n, 0);
        System.out.println(flag);
    }

}
