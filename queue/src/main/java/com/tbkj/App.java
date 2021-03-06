package com.tbkj;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Queue<Integer> queue = new Queue<Integer>();
        
        queue.enqueue(2);
        queue.enqueue(7);
        
        System.out.println("Length = " + queue.length());
        System.out.println("First item = " + queue.peek());

        queue.dequeue();
    
        System.out.println("Length = " + queue.length());
        System.out.println("First item = " + queue.peek());
    }
}
