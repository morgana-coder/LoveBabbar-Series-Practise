package Recursion.Binary_Search;

import java.util.*;

public class BinarySearch {
    public static boolean search_number(int arr[], int n, int i, int num) {
        int s = 0;
        int end = n - 1;
        int mid = s + (end - s) / 2;
        boolean flag = false;
        while (s <= end) {
            if (arr[mid] == num)
                return true;
            else if (arr[mid] > num)
                end = mid - 1;
            else if (arr[mid] < num)
                s = mid + 1;
            mid = s + (end - s) / 2;
        }
        return flag;
    }

    public static boolean search_number_by_rec(int arr[], int end, int start, int num) {

        if (end < start)
            return false;
        int mid = start + (end - start) / 2;
        if (arr[mid] == num)
            return true;
        else if (arr[mid] > num)
            return search_number_by_rec(arr, mid - 1, start, num);
        else if (arr[mid] < num)
            return search_number_by_rec(arr, end, mid + 1, num);
        return false;

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        int num = 6;
        boolean flag = search_number_by_rec(arr, n, 0, num);
        if (flag == true)
            System.out.println("Number is present");
        else
            System.out.println("Number is not present");
    }

}
