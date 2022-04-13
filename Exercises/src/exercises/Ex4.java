package exercises;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("\nNhập vào số nguyên n lớn hơn 0: ");
			number = sc.nextInt();
			if (number < 0) {
				System.out.println("\n Số n phải lớn hoặc bang 0, vui lòng nhập lại !");
			}
		} while (number < 0);
		System.out.println(tinhTongSoTuNhien(number));
	}

	private static int tinhTongSoTuNhien(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}
