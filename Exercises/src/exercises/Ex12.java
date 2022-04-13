package exercises;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("\nNhập vào số nguyên n từ 1 đến 9: ");
			n = sc.nextInt();
			if (n < 1 || n > 9) {
				System.out.println("\n Số n phai từ 1 đến 9");
			}
		} while (n < 1 || n > 9);
		printTriangle(n);
	}

	public static void printTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
		}
	}
}
