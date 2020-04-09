package com.tgt.igniteplus;
import java.util.*;
public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");

        Character c = sc.next().charAt(0);
        int value = c;

        //1: Typecasting
        System.out.println("Ascii : "+(int)c);
    }

}
