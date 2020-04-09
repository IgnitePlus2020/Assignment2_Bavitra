package com.tgt.igniteplus;
import java.util.*;
public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String in = sc.nextLine();
        String conversion = in.toUpperCase();
        System.out.println("After conversion ");
        System.out.println(conversion);
    }
}
