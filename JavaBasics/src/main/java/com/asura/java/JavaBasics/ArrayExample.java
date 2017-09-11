package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class ArrayExample {
    static int a[][];
    
    public static void main(String[] args) {
        a = new int[3][2];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 0;
        a[1][1] = 1;
        
        System.out.println("Array value are: "+a[0][1]);
        
    }
}
