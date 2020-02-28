package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class List1 
{
	public static void main(String args[])
	{
LinkedList<String> al=new LinkedList<String>();
al.add("apple");
al.add("mango");
al.add("flower");
al.add("apple");
Iterator<String> itr=al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
