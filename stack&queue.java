import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // Stack ArrayDeque Class

        Deque < Integer > a = new ArrayDeque < > ();

        a.push(20);
        a.push(30);
        a.push(40);

        System.out.println(a);
        a.pop();
        System.out.println(a);
        a.pop();
        System.out.println(a);


        // Queue PriorityQueue

        Queue < Integer > pq = new PriorityQueue < > ();

        pq.add(3);
        pq.add(2);
        pq.add(4);
        pq.add(1);
        System.out.println(pq);

        pq.remove();
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        
        // linkedlist queue
        
        Queue <String> names = new LinkedList<>();
        names.add("Naveen");
        names.add("Yatheesh");
        names.add("Rahul");
        names.add("Deepak");
        names.add("Kavin");
        names.add("Cristo");
        
        System.out.println(names);
        System.out.println(names.peek());
        System.out.println(names.poll());
    }
}