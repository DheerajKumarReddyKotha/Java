package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class ChildAbstract extends AbstractExample {
    
    public static void main(String[] args) {
        ChildAbstract c = new ChildAbstract();
        c.getDouble();
    }

    @Override
    public int getInt() {
        return 1;
    }
}
