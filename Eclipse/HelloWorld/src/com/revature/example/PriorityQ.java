package com.revature.example;

import java.util.*; 
public class PriorityQ 
{ 
	/*
	 * General description:
	 * unbound queue based on a priority heap from the smallest element of a specified order by natural order (unicode or 
	 * value for numbers) or Constructor we have used. The head is the first element in the queue.
	 * 
	 * Are they ordered/indexed:
	 * not indexed but ordered
	 * 
	 * Is it sychronized/threadsafe:
	 * It is not synchronized/threadsafe
	 * 
	 * do they allow duplicates/nulls:
	 * no null pointers/duplicates
	 */
	
	public static void main(String[] args) 
	{ 
		// Creating a Priority Queue : 
		PriorityQueue <Integer> geek = new PriorityQueue <Integer> (); 

		for(int i=2; i<=20; i=i+2) 
		{ 
			// Use of add() : 
			geek.add(new Integer (i)); 
		} 

		geek.add(5);
		geek.add(420);
		System.out.println("geek PriorityQueue : " + geek); 

		// Use of comparator() 
		// No ordering is required here as it is naturally ordered. 
		Comparator geek_comp = geek.comparator(); 
		System.out.println("geek PriorityQueue : " + geek_comp); 

		// use of size() 
		System.out.println("\nSize of PriorityQueue : " + geek.size()); 

		// Use of toArray() 
		Object[] g = geek.toArray(); 
		System.out.print ( "Array from PriorityQueue : "); 

		for ( int i = 0; i<g.length; i++ ) 
		{ 
			System.out.print (g[i].toString() + " ") ; 
		} 
	} 
} 
