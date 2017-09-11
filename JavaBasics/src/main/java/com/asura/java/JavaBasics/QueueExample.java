package com.asura.java.JavaBasics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class QueueExample {
    
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        
        q.offer("12");
        q.offer("13");
        q.offer("1");
        System.out.println("Queue value: "+q);
        System.out.println("Queue remove is: "+q.poll());
        System.out.println("Peek value is: "+q.peek());
        
        Queue<Integer> pq = new PriorityQueue<>(new TestComparator());
        pq.add(1);
        pq.offer(2);
        pq.add(0);
        pq.add(-1);
        
        System.out.println("Priority Queue: "+pq);
//        System.out.println("poll: "+pq.poll());
//        System.out.println("Priority Queue peek: "+pq.peek());
        
        Queue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(1);
        pq1.offer(2);
        pq1.add(0);
        pq1.add(-1);
        
        System.out.println("Priority Queue peek: "+pq1);
        
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(0);
        System.out.println("Deque: "+d);
        System.out.println("deque first: "+d.peekLast());

    }
}

/* Notes:
1. QUEUE
    a) It is a collection for holding elements prior to processing.
    b) It contains special methods to add and remove elements.
    c) It does not allow insertion of null elements since it returns null when the list is full.
    d) It maintains FIFO order which is nothing but first in first out.
    e) The element which is added first gets retreived first.

It also contains some other Queue called Priority Queue, which is a sorted queue.
It maintains the order of elements.
By default priority queue maintains ascending order.

2. DEQUE:
    a) It is a double ended queue.
    b) It supports insertion and removal at both the ends.
    c) It is pronounced as decks.
    d) When it is used as Queue, the insertion happens at one end and removal at other end.
    e) When it is used as stack the push and pop happens at one end.


Methods of Queue and Deque:
a) offer - used to add elements and returns null if the queue is full.
b) add - used to add elements amd returns exception if the queue is full.
c) element - It is used to get element and retuens exception if the element is not present.
d) peek - It is used to retreive element and returns null if element is not present
e) remove - It is used to retreive and remove element and retuens exception if the element is not present.
f) poll - It is used to retreive and remove element and returns null if element is not present.
g) addfirst - used to add elements to start of queue.
h) addlast - used to add elements to last of queue.
i) pollfirst - used to retreive and remove first element
j) polllast - used to retreive and remove last element.

Stacks are deprecated in jdk 1.5
*/