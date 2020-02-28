package com.collection;

import java.util.*;

public class List2
{
	public static void main(String args[])
	{
Vector<String> vl=new Vector<String>();
vl.add("apple");
vl.add("mango");
vl.add("flower");
vl.add("apple");
Iterator<String> itr=vl.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
