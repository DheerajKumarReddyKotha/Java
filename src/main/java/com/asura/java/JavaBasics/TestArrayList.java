package com.asura.java.JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class TestArrayList {
    
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));//Arrays.asList("1","2","3")
//        s.add("1");
        ArrayList<String> s1 = (ArrayList)s.clone();
        System.out.println("size is: "+s);
    s.forEach(item -> 
    {
        if(item > 2){
            System.out.println("item is: "+item);
        }
        
    }
    );
    
    Iterator<Integer> iter = s.iterator();
    while(iter.hasNext()){
        System.out.println("value is: "+iter.next());
    }
    s.removeIf(item -> item <= 2);
        System.out.println("remove if: "+s);

        LinkedList<Integer> linkedlist = new LinkedList<>();

    }
}

/* Notes:
There are two types of list implementations:
1) General purpose - ArrayList, LinkedList
2) Special purpose - CopyonWriteArrayList

Features:
a) List contains duplicate elements.
b) It contains null elements.
c) They do not maintain any order.
d) If order is considered use Queues.

ARRAYLIST:
a) It is an array backed by a list.
b) Since the size of array is fixed and cannot be resized it is backed by list to re-size when it reached end of list.
c) Each element consists of an index associated with it.
d) Default size of arrayList is 10.

Methods of ArrayList:
a) forEach(Consumer<? super E> action) - Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
b) parallelStream() - Returns a possibly parallel Stream with this collection as its source. It is allowable for this method to return a sequential stream.
c) removeIf(Predicate<? super E> filter) - Removes all of the elements of this collection that satisfy the given predicate.
d) sort(Comparator<? super E> c) - Sorts this list according to the order induced by the specified Comparator.
e) Spliterator<E> spliterator() - Creates a late-binding and fail-fast Spliterator over the elements in this list.
f) Stream<E> stream() - Returns a sequential Stream with this collection as its source.
g) trimToSize() - Trims the capacity of this ArrayList instance to be the list's current size.

LINKEDLIST:
a) It is an implementation of List interface.
b) It is a doubly linked list which consist of a head and a tail.
c) Each elemnet has value associated with it and also the node which points to its previous elements and next element.
d) It is memory ineffecient.

Methods of LinkedList:
a) descendingIterator() - Returns an iterator over the elements in this deque in reverse sequential order. The elements will be returned in order from last (tail) to first (head).
b) element() - Retrieves, but does not remove, the head (first element) of this list.
c) offer(E e) - Adds the specified element as the tail (last element) of this list.
d) offerFirst(E e) - Inserts the specified element at the front of this list.
e) offerLast(E e) - Inserts the specified element at the end of this list.
f) poll() - Retrieves and removes the head (first element) of this list.


Difference between ArrayList and LinkedList:
a) ArrayList is fast in retreiving elements as it is associated with an index.
b) LinkedList is slow in retreival of elements because it has to traverse all the list to find an element.
c) ArrayList is slow in adding elements since it has to jump all the elements one index ahead while adding an element.
d) LinkedList is fast in adding elements as it just changes the pointer pointing.
e) Linked list is recomended to use when we repeatedly add large number of elements at the starting of list and removal of the elements.


*/