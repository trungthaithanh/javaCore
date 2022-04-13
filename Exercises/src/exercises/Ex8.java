package exercises;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text:");
		String text = sc.nextLine();
		System.out.println(String.format("Capitalize String of %s is %s", text, capitalizeString(text)));
	}

	public static String capitalizeString(String str) {
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; ++i) {
			if (i == 0) {
				if (charArr[i] >= 97 && charArr[i] <= 122)
					charArr[i] -= 32;
			}
			if (i > 0 && charArr[i - 1] == 32) {
				if (charArr[i] >= 97 && charArr[i] <= 122)
					charArr[i] -= 32;
			}
		}
		return String.valueOf(charArr);
	}
}
