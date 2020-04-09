package com.tgt.igniteplus;
import java.util.*;
public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum=0;
        int avg=0;

        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        avg = sum/n;
        System.out.print("The average value = "+avg);
    }
}
