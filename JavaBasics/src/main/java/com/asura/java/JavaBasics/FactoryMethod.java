package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class FactoryMethod {
    private FactoryMethod(){
        System.out.println("In private constructor");
    }
    public static FactoryMethod getFactoryMethodInstance() {
        return new FactoryMethod();
    }
}
