package com.revature.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> exampleList = new ArrayList<Integer>();
		exampleList.add(6);
		exampleList.add(15);
		exampleList.add(49);
		exampleList.add(61);
		exampleList.add(72);
		exampleList.add(90);
		System.out.println(exampleList);
		
		//get iterator
		
		Iterator<Integer> iterator1 =exampleList.iterator();
		
		//move through the list using .hasNext()
		
		/*
		while (i.hasNext()) { //checks to see if there is another value next
			//System.out.println(i.next());
			if(i.next()%2 != 0) { //moves to next value
				i.remove(); //remove odd numbers in-place, only after .next() is called
			}
		}
		System.out.println(iterator1);
		*/
		
		//step through two collections at once
		
		Vector <String> v = new Vector<String>(3,2);
		
		v.addElement("red");
		v.addElement("green");
		v.addElement("blue");
		v.addElement("orange");
		
		// get Vector's iterator
		Iterator<String> iterator2 = v.iterator();
		
		while(iterator1.hasNext() && iterator2.hasNext()) {
			System.out.println("next value in ArrayList i: "+iterator1.next());
			System.out.println("next value in ArrayList i: "+iterator2.next());
		}
		
		/*
		 * side note: && vs &, || vs |
		 * doubles are short-circuit operator - second operand is not checked
		 * if...
		 * for &&, if first oprand is false
		 * for ||, if first operand is true
		 * singles are 'bitwise' operators
		 * preference is short-circuit (&&, ||)
		 */
		
		
	}

}
