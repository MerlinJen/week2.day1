package week2.day1;

public class Findtypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] val = test.toCharArray();
		System.out.println(val);
		for (int i = 0; i < val.length; i++) {
			if (Character.isLetter(val[i])) {
				System.out.println("letter:" + val[i]);
				letter = letter + 1;
			} else if (Character.isSpaceChar(val[i])) {
				System.out.println("space:" + val[i]);
				space = space + 1;
			} else if (Character.isDigit(val[i])) {
				System.out.println("num:" + val[i]);
				num = num + 1;
			} else {
				System.out.println("specialCharacter: " + val[i]);
				specialChar = specialChar + 1;
			}

		}
	}
}