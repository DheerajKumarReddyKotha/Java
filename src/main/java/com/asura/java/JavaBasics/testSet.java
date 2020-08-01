package com.asura.java.JavaBasics;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class testSet {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add(null);
        System.out.println("hashset: "+s);
        TreeSet<Integer> t = new TreeSet<>(new TestComparator());
//        t.add(null);
        t.add(1);
        t.add(11);
        t.add(15);
        t.add(10);
        t.add(-1);
        System.out.println("null is: "+t);
    }
}
/*Notes:
Load factor: It indicates at what level the capacity of set/list/map should be doubled.
There are two types of Set implementations:
1. General purpose implementations - HashSet, TreeSet, LinkedHashSet
2. Special purpose impementation - EnumSet, CopyonwriteAraySet

Features:
1. Set do not maintain any order.
2. It does not contain any duplicates.
3. HashSet is more faster than Treeset.
4. If you need an order for elements use Treeset.

HashSet: (It implements Set interface and extends abstractSet. AbstractSet extends abstract collection. abstract collection implements collection.)
a) It is implemented by hash table with linked list running through it.
b) It allows null value.
c) Its default capacity is 16.
d) It does not allow duplicates, it internally uses hashmap where the value is stored as key and value as some dummy value, when
   a duplicate value gets added the map returns existing key and it will not be added.
e) It does not maintain any order

Methods of HashSet:
   - add,addll,contains,removeif,parallelstream,remove,removeall,retainall etc,.

TreeSet: (It implements navigable set. Navigable set extends sorted set. Sorted set extends set. Set extends collection. collection extends iterable)
(It extends abstractSet, abstractSet extends abstractcollection. abstract collection implements collection.)
a) Underlying data structur is balanced tree.
b) no duplicates.
c) no insertion order.
d) It do not accept null value.
e) Elements will be added with default natural sorting order.
f) we can pass comparator to specify the ordering of elements.
g) Objects need to be homogeneous and comparable.
h) Sorting is done using compareTo method of comparable interface.
i) Comparable interface is meant for natural sorting order and comparator meant for custom sorting.
j) For natural sorting jvm internally calls compareTo method.

Methods of TreeSet:
    - add,addll,contains,removeif,parallelstream,remove,removeall,retainall etc,.

LinkedHashSet:
a) It is hash table and linkedlist implementation of the set interface.
b) It maintains insertion order.
c) It allows null values.
d) It does not allow duplicates.

*/