package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List 
{
	public static void main(String args[])
	{
ArrayList<String> al=new ArrayList<String>();
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
