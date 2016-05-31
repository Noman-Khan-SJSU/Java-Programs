package DataStructures.Queue;

import java.util.*;

class QueueBasics
{
    public static void main(String[] args)
    {
        PriorityQueue<String> q = new PriorityQueue<>();

        q.offer("first");                           // puts the element into the queue like enqueue or add.
        q.offer("second");
        q.offer("third");

        System.out.println(q);                      // printing the entire queue

        System.out.println(q.peek());               // peek methods returns the highest priority element

        System.out.println(q);

        System.out.println(q.poll());               // returns and removes the highest priority element

        System.out.println(q);
    }

}

// Adding (offering) and removing (polling) of elements in a Queue.