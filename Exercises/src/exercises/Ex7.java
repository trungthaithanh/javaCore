package exercises;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("\nNhập vào số nguyên n lớn hơn 0: ");
			number = sc.nextInt();
			if (number <= 0) {
				System.out.println("\n Số n phải lớn hơn 0, vui lòng nhập lại !");
			}
		} while (number <= 0);
		inUocSoCua(number);
	}

	public static void inUocSoCua(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(String.format("%4d", i));
			}
		}

	}
}
