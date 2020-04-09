package com.tgt.igniteplus;
import java.util.*;
public class ReplaceChar {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String s =  sc.nextLine();
            System.out.println("Enter the character to be replaced");
            char old = sc.next().charAt(0);
            System.out.println("Enter the character that would be replacing");
            char newp = sc.next().charAt(0);

            String s1 = s.replace(old,newp);
            System.out.println(s1);

        }
    }
