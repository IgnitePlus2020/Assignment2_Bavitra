package com.tgt.igniteplus;
import java.util.*;
public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        float old = sc.nextFloat();
        System.out.println("Enter the discount");
        float dis = sc.nextFloat();
        float newp = old-(old*dis)/100;
        System.out.println("The new price is="+newp);
    }
}
