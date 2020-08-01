package com.asura.java.JavaBasics;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
 public class FundementalNotes {
    int a;
    final int b;
    static int c;
    final static int STATIC_FINAL;
    private int d;
    protected int e;
    volatile int c3c3cc;
    transient int c34rf;
    
    static{
        STATIC_FINAL=1000;
    }
    protected FundementalNotes(){
        this.a = 10;
        this.b = 11;
        this.d = 121;
        System.out.println("Hello world constructor");
        System.out.println("The Value of a is: "+a+"\nThe value of b is: "+b);
    }
    protected FundementalNotes(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("parameterized Hello world constructor");
        System.out.println("The Value of a is: "+a+"\nThe value of b is: "+b);
    }
    
    public static int getValue(){
        c = c + 10;
        return FundementalNotes.c;
    }
    public static void main(String[] args) {
        FundementalNotes helloworld = new FundementalNotes();
        FundementalNotes helloworld1 = new FundementalNotes(01,02);
        System.out.println("Type of class: "+FundementalNotes.class.getModifiers()); // This is used to get the modifier of the class
        System.out.println("initial state in default constructor: "+helloworld.a);
        System.out.println("initial state in parameterized constructor: "+helloworld1.a);
        c = 10;
        System.out.println("Value of c before: "+c);
        System.out.println("call getvalue: "+getValue());
        System.out.println("Value of c after: "+c);
        System.out.println("value of d is: "+helloworld.d);
        int x = helloworld.a;
        System.out.println("postfix/prefix operators: "+ ++x);
        System.out.println("After post fix: "+x);
        x +=x;
        System.out.println("x value is: "+x);
        Double[] local = {1.0,3.3,2.2,4.4,5.1};
        System.out.println("array values: "+local[3]);
        
    }
}
/*Notes:
KEYWORDS:
    public,private,protected,default,Final, Static, abstract,synchronized, volatile, transient, strictfp, native
    Final: 
        a) It is a keyword/access modifier.
        b) If a variable is declared as final its value cannot be changed.
        c) If a class is declared as final it cannot be inherited.
        d) If a method is declared as final it cannot be overriden.
Volatile: When a variable is declared as VOLATILE all the reads and writes will not be cached thread locally, and will directly effect the main memory.
Static: 
    a) Static is a keyword
    b) If a variable is static, then it confirms that there is only one copy of that variable.
    c) It cannot be applied to class
    d) If a method is declared as static, it can be called even without creation of object.
Transient:It is used in serialization. If you declare a variable as transient, then it will not be serialized.
Ex: If you delare a variable as transient and try to deserialize it, it returns default value since it is not serialized.

Synchronized: This keyword is used on methods specifying that, the method can be accessed by one thread at a time.

Native: Native keyword is used for methods which will be implemented in platform dependent language like C or C++. It should not have any implementation.
	The Java Native Interface (JNI)specification governs rules and guidelines for implementing native methods, such as data type conversion between Java and the native application.

Strictfp: This keyword is used to get the same foating point result on all the platforms. The precission might differ from platform to platform that is why strictfp keyword is introduced.
    
Here is the link for all keywords in java: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
CLASS:
   1. Class is a template to create an object. Here HelloWorld is a class.
   2. It should always start with a Uppercase letter and should be a noun.
   3. A class name can start with Letter,_,$ and it cannot start with a digit.
   4. A class can have only Letters, digits, underscore and dollar signs in it.
   5. A class can have access modifiers like public,default, public final,default final, public abstract,default abstract.

PRIMITIVE DATA TYPES:
   Data Types are divided into 4 categories:
        a) Integer - byte,short,int,long | Default value is: 0
        b) Floating Point - float, double | Default value is: 0.0
        c) Character - char | Default value is: '\u0000'
        d) Boolean - true,false | Default value is false
VARIABLES:
    1. Variable is an entity which holds the data of particular data type.
    2. It can have any of the above data types.
    3. Variable can use default,public,private,protected,static,final,volatile, transient
    4. If a variable is declared as final, it should be initialized right there itself or else in the constructor or in an empty block.
    5. If a variable is declared as static, there is only copy of that variable, it can be accessed directly even without creating object.
    6. If a variable is declared as static final/final static it should be initialized there itself or else in a static block.
    7. If a variable is declared as private, it cannot be accessed in its child class.
    8. If a variable is declared as protected, it can be accessed only in its package and in its subclass from other package.
    9. If a variable is declared as public, it can be accessed anywhere.
    10. If a variable is declared as default, it can be accessed only in its package.
    11. Variable name must follow camelcase format. Ex: camelCase
    12. Variable name should start with lower case letter/underscore/dollar sign and it cannot start with digit.
    13. Variable name can contain letters,digits,underscores and dollar sign.
    14. If a variable is declared as volatile, its value is directly read/write to the memory and will not be cached locally by threads.
    15. If a variable is declared as transient, then it will not be serialized during serialization.
    16. A variable cannot be strictfp,abstract,native etc,.
    17. Variables are of two types: a) Global/Instance variables - These can be accessed anywhere inside class. 
                                    b) Local variables: The scope/ visibility of these are variables are permitted to that block only.
    18. Accessors: getters; Mutators: setters

OBJECT:
   1. Object is an instance of a class which gives access to state and the behavior of class. Here helloworld is an object.
   2. Object is created using new keyword in java. 

CONSTRUCTOR:
    1. Constructor is an executable code during object creation to set the initial state of object.
    2. Constructors are of two types a) No arg constructor b) Parameterized constructor.
    3. Constructors can have access modifiers public,private, protected and default.
    4. If a Constructor is declared as private in a class, its object cannot be created from outside class.
    5. In the above case we can take help of static factory methods. Here factory method is a method having capability to return an object of some other class.
    6. To achieve singleton design pattern we mark constructor as private.
    7. We cannot override constructors.
    8. We can overload constructors.
    9. this keyword is used to call current class constructors.
    10. super key word is used to call parent class constructors from child class.
    11. Constructors cannot have static, final, abstract keywords.
    12. Private constructors are used when we require that there should be only one instance of class to be created Ex: Database connections

FACTORY METHODS:
    Factory method is a method having capability to return an object of some other class.
    There are two types of factory methods:
    a) Static factory methods
    b) Non static factory methods/instance factory methods

ARITHMETIC OPERATORS:
    a) Basic operators (+,-,*,/,%
    b) prefix/postfix operators (++i,--i,i++,i__)
    c) assignment operators (+=,-=,*=,/=)
These operators follow BODMAS priority.
Operators with same precendence level follows from left to right rule.

CONDITIONAL LOGIC:
1. RELATIONAL OPERATORS:
    It is used to compare the variables. Ex: >,<,>=,<=,==

2. LOGICAL OPERATORS:
    &,|,^(exclusive OR),!(negation)
The conditions on both left and right side of the operator gets executed.

3. LOGICAL ASSIGNMENT OPERATORS:
    && -> right side condition of this operator gets executed only if left side condition is true
    || -> right side condition of this operator gets executed only if the left condition side is false.

4. CONDITIONAL OPERATORS:
    These are also known as ternary operators. Ex: var i = (condition == true)?true:false

5. IF - ELSE
Syntax: if(condition){

}else{

}
Inside if-else you also have nested if else.
If there is only one statement inside if, no need to put a braces.

LOOPS: It is process where a block of code repeatedly gets executed when the condition is true.
There three types of Loops in java:
a) While : It executes the statements inside the while only when condition is true.
    Syntax: while(condition){

            }
b) Do-while: It executes the statements in do and then checks the condition in while. Here the block gets executed atleast once.
    do{

    }while(condition);
c) For: In for initialization,condition and increment happens at one place. The block gets executed only when condition is true.
    Syntax: for(initialization;condition;i++){

            }

ARRAYS: It is a collection of related data type. Ex: int[] a = {1,2,3,4}
    a) It has fixed length
    b) Length of array is established while creation.
    c) Length of array cannot be increased dynamically.
    d) Each item in array is known as element.
    e) Each elemnt is accesed by its index value. It starts from index 0;
    f) It can be initialised using new keyword and directly.
        i) int[] a = new int[10];
    g) It also consists of multi-dimensional arrays declared as int[][], first bracket indicates rows and second brackets indicate columns.
    c) It can be used with all primitive data types and wrapper classes.

METHOD:
    a) A method is an executable code which changes the behavior of the class.
    b) It contains a return type.
    c) It contains return types as void, primitive data types and its wrapper class.
    d) A method can contain access modifiers like public,private,protected and default.
    e) A method can contain keywords like static,final,static final,abstract,synchronized,native,
    f) A method also contains parameters. The calling method passes those parameters.
    g) A method declared as static can be called directly using the classname i.e classname.methodname.
    h) A method which takes any number of parameters is known as var-arg method.
    i) Method name should start with a lower case letter and should follow camel case, should be a verb.
    j) A method name can contain _,$,letters, digits but it should never start with a digit.
There are two important concepts in methods:
a) Method overloading: A method with same name and different number of parameters or same number of parameters with different data types is known as Method Overloading.
                        This is also known as compile time polymorphism.
                        It is also known as static binding as the binding with method happens at compile time.
                        A method declared as private can be overloaded.
                        Overloaded method need not have same method return type.
b) Method overriding: A method overriding is a phenomenon where a child class method overrides the parent class method during execution. 
                        It is also known as Run time polymorphism.
                        A method declared as static or final cannot be overridden in child class.
                        We use @Override annotation to indicate that method is overridden
                        It is also known as dynamic binding as binding of method is decided at runtime.
                        A method declared as private cannot be overridden
                        
Clone(): This method creates the copy of existing object and assign it to another object. By doing this there is no need to copy values again to this object.

INHERITANCE:
    a) It is a process in which child class acquires parent class qualities.
    b) One class extends other class using extends keyword.
    c) A class declared as final cannot be extended.
    d) A class cannot extend multiple classes.
    e) In order to call parent class constructors we use super keyword and this should be the first statement. It is also used to call parent class methods and variables.
    f) Child class hides the parent class variables with same name, in order to avoid that create a base class object referring to child. Parent p = new child();
    g) Object class is the super class of all the classes.
Parent p = new Child();
a) If we dont known exact runtime type of object we use it.
b) By using parent reference we can call methods available in parent class only.
c) By By using parent reference we can hold any child class object.

Child c = new Child();
a) If we know about runtime type of object we use it.
b) By using child reference we can access any method in child class as well as parent class
c) We use child reference to hold only particular type of child object

STRING,STRING BUFFER, STRING BUILDER:
String: 
    a) String is a sequence of characters which is immutable.
    b) Immutable is the character of not changing the content it holds. Ex: String s = "asura"; s.concat("reddy") -> a new object will be created for this so this is immutable.
StringBuffer:
    a) This is immutable.
    b) the value associated with it can be changed.
    c) It is thread safe i.e only single thread can access it at a time.
    d) It gives poor performance.
    e) This changeable nature is called mutability.
    f) Every method present in String Buffer is synchronized
StringBuilder:
    a) This is mutable.
    b) Its value can be changed.
    c) This is not thread saf.
    d) It can be accessed by any number of threads at a time.
    e) This changeable nature is known as mutability
    f) Every method present in String Builder is not synchronized.

Difference between == and .equals method?
== is compares the reference of the object.
.equals compares the content of an object.

ENUM: It is a special data type that holds the data of specific category ex: EAST,WEST,NORTH,SOUTH.

PRIMITIVE WRAPPER CLASS:
Here all the primitive data types acts as an object.
So a primitive wrapper class is a wrapper class that encapsulates, hides or wraps data types from the eight primitive data types,[1] so that these can be used to create instantiated 
objects with methods in another class or in other classes. The primitive wrapper classes are found in the Java API.

EXCEPTIONS:
    Object class -> Throwable class -> i) Exception b) Error
    Throwable class is the parent class of Exceptions and Error.
Exception: These are caused by our program.These are recoverable.
Error: These are caused due to lack of system resources. These are not recoverable.
Errors are of two types:
    a) VM error
    b) Linkage error
Exceptions are of two types:
    a) Checked exceptions - these are also known as compile time exceptions. The compiler checks whether programmer handled this exception. Ex: File not found exception
    b) Unchecked exceptions - these are also known as run time exceptions. These exceptions are not checked by compiler. Ex: Arithmetic Exceptions
whether an exception is checked or unchecked it occurs at runtime only.
FULLY CHECKED EXCEPTIONS: The exception is said to be fully checked if and only if all its child classes are checked. Ex: IOException,Interrupted Exception
PARTIALLY CHECKED EXCEPTIONSl The exception is said to be partially checked if all its child classes are not checked. Ex: Exception
Note: The only possible partially checked exceptions are a) Exception b) Throwable

TRY-CATCH-FINALLY:
The exceptions are handled using try and catch blocks.
syntax:
try{

}catch(Exception e){

}finally{

}
a) Try block consists of the statements that might cause an exception
b) Catch block consists of the statements that handles the exception caused by statements in try block.
c) Finally block consists of statements which closes the resources opened in try block. Ex: Database connections, closing filestream,inputstream
c) Catch block must always follow try block.
d) Catch block gets executed only when an exception occurs
e) Finally block execute all the time even in case of exceptions or not.
f) We can have a try-catch inside try block and catch block and finally block.
g) If there is a chance of multiple exceptions to occur, all the catch blocks must be in the order of occurance.

FINAL,FINALLY,FINALIZE:
final: It is a keyword. 
a) If a variable is declared as final its value cannot be changed.
b) If a method is declared as final it cannot be overriden.
c) If a class is declared as final it cannot be extended.
Finally: It is a block which consists of statements that are used to close the connections opened in try block.
Finalize: It is a method called by garbage collector just before deleting object to close all the network or database connections associated with that object.

PACKAGE: It is names[ace given to a group of classes of same type. Importis the keyword used to import class present in different package.
There are two types of imports:
a) single import
b) import on demand

ABSTRACT vs INTERFACE:
Interface
a) If we dont know anything about implementation then we go with interface.
b) Inside interface all the methods are purely abstract and public.
c) We cant define interface methods with following modifiers private,default,static,final,synchronized,native and strictfp.
d) Every variable present in interface is public, static and final by default.
e) We cannot declare interface variables with private, protected, transient and volatile keywords.
f) Variables must be initialized at the time of creation.
g) Inside interface instance block static block are not possible.
h) Constructor not applicable for interface.

Abstract:
a) If we know only the partial implementation but not complete implementation then we go with abstract
b) Every method present in abstract class need not be public and abstract there can be concrete classes also.
c) There are no restrictions on abstract class method modifiers.
d) Every variable present in abstract class need not be public static and final, it can be anything.
e) There are no restrictions on abstract class variable modifiers.
f) There are no such rules for abstract.
g) We can create instance block and static block.
h) We can create constructor in abstract class which will be used by child class during object creation.

JDK vs JRE vs JVM

JDK = JRE + Development tools (Eg javac,java)
JRE = JVM + Library classes

JVM: It is an interpreter which runs the code line by line.
JDK: It provides environment to both develop and run the application.
JRE: It provides only run time environment to run the code. Its the responsible of JVM inside JRE to run the applications.

19. What is JVM architecture?
a) Javac is used to compile .java file into byte code 
b) byte code is nothing but .class files. This .class file is input to classloader sub system.
Class Loader subsystem:
a) Loading (Bootstrap class loader - Load classes from bootstrap class path.All core java API classes will be loaded ex: rt.jar,
            extension class loader - load classes from ext folder like jdk,jre,lib ext, 
            application class loader - load classes from application level class path example environment level class path) 
These follow delegation hierarchy.
b) Linking (verify - verifies byte code, 
            prepare - allocates memory for static variables wih default values, 
            resolve - all symbolic references are replaced with original method area ex static variables original values are assigned and static blocks gets executed)
c) Initialization

While loading and executing .class files memory is required

Various memory areas of JVM are:
a) Method area (it has class data and static variables)
b) Heap area (It has object and instance variables data)
c) Stack area (All local variables are stored. Each entry in this is called stack frame)
It has information of threads.
Each frame has:
local variable array
frame data
operand stack
d) PC Register (to hold address of next executing instruction)
Each thread has pc register
e) Native method area

Execution engine is required to execute the .class file
Execution engine:
a) Intrepreter
b) git compiler (intermediate code generator, code optimizer, target code generator, profiler) It avoids repetetive interpreting of code if same code gets repeatedly. Profiler identifies the repeated requitrement method.
c) garbage collector
d) security

To provide native method libraries we have java native interface in JVM.
*/