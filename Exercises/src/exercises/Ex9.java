package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		do {
			System.out.println("\nNhập vào số nguyên a: ");
			a = sc.nextInt();
			if (a < 10 || a > 99) {
				System.out.println("\n Số a phải thuộc [10,99]!");
			}
		} while (a < 10 || a > 99);
		do {
			System.out.println("\nNhập vào số nguyên b: ");
			b = sc.nextInt();
			if (b < 10 || b > 99) {
				System.out.println("\n Số b phải thuộc [10,99]!");
			}
		} while (b < 10 || b > 99);
		System.out.println("Số a và số b co cùng một hoặc hai chữ số là " + isHavingSameDigits(a, b));
	}

	public static boolean isHavingSameDigits(int a, int b) {
		List<Integer> aDigits = new ArrayList<Integer>();
		while (a != 0) {
			aDigits.add(a % 10);
			a /= 10;
		}
		while (b != 0) {
			int bDigit = b % 10;
			if (aDigits.contains(bDigit)) {
				return true;
			}
			b /= 10;
		}
		return false;
	}

}
