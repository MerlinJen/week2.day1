package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] val1 = text1.toCharArray();
			char[] val2 = text1.toCharArray();
			Arrays.sort(val1);
			Arrays.sort(val2);
			if (Arrays.equals(val1, val2))
				System.out.println(text1 + " and " + text2 + " are an Anagram");
			else
				System.out.println(text1 + " and " + text2 + " are not an Anagram");
		} else
			System.out.println(text1 + " and " + text2 + " are not an Anagram");
	}
}
