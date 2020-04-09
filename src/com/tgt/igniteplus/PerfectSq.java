package com.tgt.igniteplus;
import java.util.*;
import java.math.*;
public class PerfectSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        double sq = sc.nextDouble();
        double root = Math.sqrt(sq);
        System.out.println(+root);
        double x = sq-root;
        if(x == root)
        {
            System.out.println("The number "+sq+ " is a perfect square");
        }
        else{
            System.out.println("The number "+sq+" is not a perfect square");
        }
    }
}
