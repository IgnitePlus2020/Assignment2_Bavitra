package com.tgt.igniteplus;
import java.util.*;
public class CylinderVolume{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the cylinder ");
        int height=sc.nextInt();
        System.out.println("Enter the radius of the cylinder ");
        int radius=sc.nextInt();
        double pie=3.14285714286;
        double volume=pie*(radius*radius)*height;
        System.out.println("Volume of the cylinder="+volume);
    }
}