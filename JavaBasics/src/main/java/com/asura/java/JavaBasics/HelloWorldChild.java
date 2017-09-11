package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
 public class HelloWorldChild extends FundementalNotes {
    
    private HelloWorldChild(){
        System.out.println("in default constructor");
    }
    private HelloWorldChild(int a,int b){
        super(a,b);
        System.out.println("in child parameterized");
    }
    private HelloWorldChild(float a,int b){
        System.out.println("in child parameterized");
    }
    public static void main(String[] args) {
        FundementalNotes hw = new FundementalNotes();
        HelloWorldChild h = new HelloWorldChild();
        HelloWorldChild helloworld = new HelloWorldChild(2,4);
        
        System.out.println("Value of static parent variable: "+helloworld.a);
        System.out.println("Value of static final parent variable: "+hw.a);
    }
}
/*Notes:
    1. Child class cannot access private variables from parent class.
    2. Child class cannot extend parent class if parent class is final.
    3. Every time you create an object of child class parent class default constructor is called first.
    4. If a constructor in parent class is declared as private, child class object cannot be created as it is against parent access specifier.
*/