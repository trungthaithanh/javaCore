package exercises;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = scanner.nextInt();
		} while (n <= 0);

		int array[] = new int[n];
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			array[i] = scanner.nextInt();
		}
		n = removeDuplicated(array, n);
		printArray(array, n);

	}

	private static int removeDuplicated(int[] array, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					n = delete(array, n, i);
					i--;
					break;
				}
			}
		}
		return n;
	}

	private static int delete(int[] arr, int n, int pos) {
		if (pos == -1) {
			System.out.println("Khong tim thay phan tu can xoa");
		}
		for (int i = pos; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return n - 1;
	}

	private static void printArray(int[] array, int n) {
		System.out.println("In phan Tu trong Mang:");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
