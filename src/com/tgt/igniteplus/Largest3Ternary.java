package com.tgt.igniteplus;
 import java.util.Scanner;
    public class Largest3Ternary
        {
        public static void main(String[] args)
        {
            int num1, num2, num3, result, temp;
            /* Scanner is used for getting user input.
             * The nextInt() method of scanner reads the
             * integer entered by user.
             */
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Number:");
            num1 = scanner.nextInt();
            System.out.println("Enter Second Number:");
            num2 = scanner.nextInt();
            System.out.println("Enter Third Number:");
            num3 = scanner.nextInt();
            scanner.close();
            temp = num1>num2 ? num1:num2;
            result = num3>temp ? num3:temp;
            System.out.println("Largest Number is:"+result);
        }
    }
