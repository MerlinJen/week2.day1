package week2.day1;

public class ChangeToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] chArr = test.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (i % 2 != 0) {
				char uppercase = Character.toUpperCase(chArr[i]);
				System.out.print(uppercase);
			} else
				System.out.print(chArr[i]);
		}
	}
}
