package work;

import java.util.Arrays;

public class Problems {

	public static void main(String[] args) {
		System.out.println(acronym("Portal Network Graphics"));
	}

	public static String acronym(String phrase) {
		char[] acro = new char[phrase.length()];
		for (int i = 0; i <= acro.length-1; i++) {
			if (phrase.charAt(i) == ' ' || phrase.charAt(i) == '-') {
				acro[i]=phrase.charAt(i+1);
			}
		}
		String ans = Arrays.toString(acro);
		ans = ans.toUpperCase();
		return ans;
	}

}
