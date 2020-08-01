package com.asura.java.JavaBasics;

import java.util.*;

import static java.util.Comparator.comparing;


/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class CollectionsNotes implements Cloneable {
    
    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Product> products = new ArrayList<>();
        Product p0 = new Product();
        p0.setColor("blue");
        p0.setWeight(1);
        
        Product p1 = new Product();
        p1.setColor("red");
        p1.setWeight(0);
        
        Product p2 = new Product();
        p2.setColor("green");
        p2.setWeight(2);
        
        Product p3 = new Product();
        p3.setColor("red");
        p3.setWeight(0);
        
        Product p4 = (Product)p3.clone();
        products.add(p0);
        products.add(p1);
        products.add(p2);
        products.add(p3);
         products.add(p4);
        
//        products.sort(BY_WEIGHT);
        
        System.out.println("products: "+products);
        
        Set<String> s = new HashSet<>();
        s.add("d");
        System.out.println("hashcode: "+s.hashCode());
        s.add("f");
        System.out.println("hashcode: "+s.hashCode());
        s.add("d");
        System.out.println("hashcode: "+s.hashCode());
        
        System.out.println("s is: "+s);
        
    }
}
/* COLLECTIONS NOTES:
Note: Collection interface extends Iterable. It defines iterator which iterates the collection implementations. ex: List, Set, Maps.

COLLECTION vs COLLECTIONS
Collection: 
a) It is an interface which can be used to represent group of individual objects as single entity.
b) It cannot be implemented directly. It contains more specific sub-interfaces like List,set

Collections: It is a utility class present in java.util that has several utility methods like sorting,searching for collection objects.

Java Collections framework hierarchy consists of two tree interfaces. They are:
1) Collection interface
    i)  It is an interface which can be used to represent group of individual objects as single entity.
    ii) It sub interfaces are list,set,queue.
    iii)It extends iterable class which iterates the collection implementations.
    iv) It contains general methods like add, remove etc,.

LIST Implementations:
Iterable -> Collection(extends iterable interface) -> abstractcollection(implements collection) -> abstractlist(Extends abstractcollection)
All the list implementations extends abstractlist and implements list interface.
a) ArrayList 
b) LinkedList (LinkedList extends abstractSequentiallist class)

SET Implementations:
Iterable -> Collection(extends iterable interface) -> abstractcollection(implements collection) -> abstractlist(Extends abstractcollection)
All the set implementations extends abstractset

The navigableset extends SortedSet
a) HashSet (It implements set interface)
b) TreeSet (Treeset implements this navigable set which extends sortedset which implements set)

2) Map interface






1. What are java collections and why should we use them?
    a) Arrays are not re-sizable.
    b) Adding an element to array is difficult as it is not re-sizable
    c) It also consists of duplicates.
   In order to avoid all the above problems collections framework is developed.
Collections is a framework which provides
    a) Uniqueness
    b) ordering
    c) pairs
It implements data structures for listing, tree sets and hash tables to provide these features.
2. Defining and iterating collections
    a) Types of collections
        i) all the collection interface APIs under collections framework extend parent interface called collection. Ex: List, Set(Sorte set), Queue(Deque), Maps(sortedmap)
    b) Interface vs Implementation (In terms of collections)
        Interface: It has multiple data structures, Functional characteristics, often has popular implementation.
        Implementation : Specific data structures, performance characteristics, easily instantiable.
    c) Collection behaviors
        It contains methods like size(),isEmpty(),add(), addall(),remove(),removeAll(),retainall(),contains(), containsAll().
        Use an iterator if you want to modify collection while iterating.
        Using enhanced for loop in above case gives out an error.

Comparable Interface:
a) It is an interface.
b) It has only one abstract method compareTo
c) It returns -ve if obj1 comes befre obj2, +ve value if obj1 comes after obj 2, 0 if obj1 == obj2.

Comparator interface: It has two methods compare and equals methods.
a) It is an interface when we ned custom sorting.
b) returns -ve if obj1 has to come before obj2.
c) returns +ve if obj1 has to come after obj2.
d) returns 0 if obj1 == obj2.

Difference between comparable and comparator:
Comparable:
a) Default natural sorting order.
b) It is present in java.lang
c) It contains compareTo
d) All wrapper classes and string classes implements comparable.

Comparator:
a) It is used for custom sorting
b) It is present in java.util
c) It contains compare and equals method.

Difference between fail fast iterator and fail safe iterator:
a) Fail fast iterator immediately throws a concurrent modification exception when we modify collection while iterating.
b) Fail safe iterator makes copy of original iterator and modifies that data structure so original remains unchanged.
*/