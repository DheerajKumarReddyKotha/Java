package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class MethodExample {
   int a = 10;
    public static int getInt(){
        return 0;
    }
    
    public final Short getShort(){
        return 0;
    }
    
    public static final byte getByte(){
        return 0;
    }
    
    public synchronized long getLong(){
        return 0L;
    }
    
    public native Integer getInteger();
    
    public strictfp Double getDouble(){
        return 0.0;
    }
    
    public char getChar(){
        return 'C';
    }
    
    public strictfp boolean getBoolean(){
        return true;
    }
    
    public final Boolean getbool(int a,int b){
        return false;
    }
    
    public final Boolean getbool(float a,int b){
        return false;
    }
    public static void main(String[] args) {
        
    }
}
