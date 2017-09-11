package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public abstract class AbstractExample {
    
    public AbstractExample(){
        System.out.println("In constructor of abstract class");
    }
    public abstract int getInt();
    public double getDouble(){
        return 1.0;
    }
}
