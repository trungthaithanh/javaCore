package exercises;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập vào số nguyên n: ");
		int n = sc.nextInt();
		System.out.println(String.format("Số tự nhiên lớn nhất nhỏ hơn log2(%d) is %d", n, findNumber(n)));
	}

	public static int findNumber(int n) {
		double log2Ofn = log(n, 2);
		if (log2Ofn % ((int) log2Ofn) == 0.0) {
			return ((int) log2Ofn) - 1;
		}
		return ((int) log2Ofn);
	}

	public static double log(int x, int base) {
		return (double) (Math.log(x) / Math.log(base));
	}
}
