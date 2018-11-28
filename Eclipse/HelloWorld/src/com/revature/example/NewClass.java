package com.revature.example;

import java.util.*; 
public class NewClass 
{ 
	public static void main(String[] args) 
	{ 
		// Creating a Priority Queue : 
		PriorityQueue <Integer> geek = new PriorityQueue <Integer> (); 

		for(int i=2; i<=20; i=i+2) 
		{ 
			// Use of add() : 
			geek.add(new Integer (i)); 
		} 

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
