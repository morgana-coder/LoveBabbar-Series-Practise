package Recursion.Binary_Search;

import java.util.*;

public class SumOfArray {
    public static int sum_array(int arr[], int n, int i) {
        if (n == 0)
            return 0;
        if (n == 1)
            return arr[i];

        return arr[i] + sum_array(arr, n - 1, i + 1);

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();

        int ans = sum_array(arr, n, 0);
        System.out.println(ans);
    }

}
