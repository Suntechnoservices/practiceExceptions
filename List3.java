package com.collection;

import java.util.*;

public class List3 
{
	public static void main(String args[])
	{
Stack<String> st=new Stack<String>();
st.push("apple");
st.push("mango");
st.push("flower");
st.push("apple");
st.pop();
Iterator<String> itr=st.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
