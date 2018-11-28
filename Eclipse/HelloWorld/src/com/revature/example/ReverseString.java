package com.revature.example;
import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //it tells me to close it but i don't know how
		System.out.print("Enter in a phrase: ");
		String s = scan.nextLine();
		System.out.println(reverse(s));
	}

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 *
	 * @param string
	 * @return
	 */
	public static String reverse(String string) {
		String str = string;
		String rev = "";
		for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
		return rev;
	}
}
