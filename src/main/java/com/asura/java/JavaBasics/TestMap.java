package com.asura.java.JavaBasics;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        
    }
}
/*  Notes:
    a) Map is an interface.
    b) Map do not extend collection interface
    c) Map contains Key and a value pair.
    d) All the keys are unique in map.
    e) Map can contain duplicate values.

Different implementations of map are:
a) HashMap
b) Linked HashMap
c) TreeMap
d) Weak HashMap
e) identity hashmap
f) Dictionary -> hashtable -> properties

How do values get stored in a map?
a) Hashmap is an array of objects that contains key and value.
b) The array has some amount of buckets.
c) The hashing algorithm considers the object hash number.
d) we calculate the bucket it has to be saved using hashcode % array.length = bucket
e) Every time you put an object or get an object this hashing takes place, so it ends up at same location.
f) Returning same bucket location for two different keys is known as hashmap collision.
g) In this case linked list come into picture and the value gets added at next node.
h) SO while retreiving data equals method comes into place where it also checks the key present along with hashcode.

Difference between hashtable and hashmap:
Hashtable:
a) It is synchronized.
b) It do not accept null values.
c) It is used in single threaded environments
d) It is traversed by enumerator
e) It extends dictionary class

HashMap:
a) It is not synchronized
b) It accepts one null key and multiple null values.
c) It can be used in multi threaded environment.
d) It is traversed by iterator
e) It extends abstract map.
f) Its default capacity is 16 with load factot 0.75

Difference between enumerator and iterator?
a) Enumerator is readonly interface where it can read the elements.
b) Iterator is a read/write mechanism where we can add and remove elements.
c) Iterator is fail fast it throws concurrentmodification exception while modifying collection in iteration.

There are two categories of map implementations:
a) General purpose - Hashmap, Treemap, LinkedHashmap
b) Special purpose - enummap, weakhashmap

Map: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.

HashMap: 
a) It is a hash table based implementation of map interface.
b) It is almost equal to hash table except that it is not synchronized wheras hashmap is synchronized.
c) It does not maintain any order.
d) Hashmap can be synchronized by Map m = Collections.synchronizedMap(new HashMap(...));
e) Its default capacity is 16 with load factot 0.75

TreeMap:
a) A Red-Black tree based NavigableMap implementation. 
b) The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, 
   depending on which constructor is used.
c) TreeMpa can be synchronized by SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));
d) It maintains ascending order.
e) Its default capacity is 16 with load factot 0.75

LinkedHashMap:
a) Hash table and linked list implementation of the Map interface, with predictable iteration order. 
b) This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries. 
c) It maintains iteration order.
d) Linkedhashmap can be synchronized using Map m = Collections.synchronizedMap(new LinkedHashMap(...));
e) Its default capacity is 16 with load factot 0.75

*/