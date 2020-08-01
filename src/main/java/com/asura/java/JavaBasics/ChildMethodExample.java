package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class ChildMethodExample extends MethodExample{
    int a = 11;
    
    @Override
    public boolean getBoolean(){
        return false;
    }
    
    public int getI9n(){
        int a1 = super.a;
        System.out.println("val: "+a1);
        super.getBoolean();
        return 0;
    }
    
    public static void main(String[] args) {
        MethodExample m = new ChildMethodExample();
        ChildMethodExample ch = new ChildMethodExample();
        System.out.println("a val: "+m.getBoolean());
        
        System.out.println("method: "+ch.getI9n());
    }
}
