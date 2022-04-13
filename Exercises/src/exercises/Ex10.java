package exercises;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("\nNhập vào số nguyên n: ");
			n = sc.nextInt();
			if (n < 0) {
				System.out.println("\n Số n phai lon hon 0");
			}
		} while (n < 0);

		System.out.println("Tong cac so Nguyen To tu 1 den n la:" + sumOfPrime(n));
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int sumOfPrime(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				s += i;
			}
		}
		return s;
	}
}
