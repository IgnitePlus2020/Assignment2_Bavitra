package com.tgt.igniteplus;
import java.util.*;
public class ConcatString {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 2 strings");
            String s1 = sc.nextLine() ;
            String s2=  sc.nextLine() ;
            String s3=s1.concat(s2);
            System.out.println(s3);
        }
    }

