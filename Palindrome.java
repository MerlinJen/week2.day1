package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = "madam", rev = "";
		int length = val.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + val.charAt(i);
		}
		if (val.equals(rev))
			System.out.println(val + " is a Palindrome");
		else
			System.out.println(val + " is not a Palindrome");
	}
}
