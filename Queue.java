package com.collection;


import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue
{
	public static void main(String args[])
	{
PriorityQueue<String> queue=new PriorityQueue<String>();
queue.add("apple");
queue.add("mango");
queue.add("flower");
queue.add("apple");
Iterator<String> itr=queue.iterator();
System.out.println("head:"+queue.element());
while(itr.hasNext())
{
	System.out.println(itr.next());
}
queue.remove();
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext())
{  
System.out.println(itr2.next());  

}
}
}
