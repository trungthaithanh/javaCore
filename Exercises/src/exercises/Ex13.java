package exercises;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		System.out.println(String.format("giá trị trung bình: %f", countAverage(array)));
		System.out.println(String.format("phần tử lớn nhất: %d", findMax(array)));
		System.out.println(String.format("phần tử nhỏ nhất: %d", findMin(array)));
		if (findNegativeMin(array) == 0 || findNegativeMax(array) == 0) {
			System.out.println("Không Có số Âm trong mảng");
		} else {
			System.out.println(String.format("phần tử âm nhỏ nhất: %d", findNegativeMin(array)));
			System.out.println(String.format("phần tử âm lớn nhất: %d", findNegativeMax(array)));
		}
		if (findPositiveMin(array) == 0 || findPositiveMin(array) == 0) {
			System.out.println("Không Có số dương trong mảng");
		} else {
			System.out.println(String.format("phần tử dương nhỏ nhất: %d", findPositiveMin(array)));
			System.out.println(String.format("phần tử dương lớn nhất: %d", findPositiveMax(array)));
		}
		printEvenNumbers(array);
		printOddNumbers(array);
		System.out.println("Mang truoc khi Xoa:");
		printArray(array, n);
		System.out.println("Mang sau khi Xoa o vi tri thu 2:");
		n = delete(array, n, 1);
		printArray(array, n);
		System.out.println("--------------------");
		System.out.println("Mang truoc khi Them:");
		printArray(array, n);
		System.out.println("Mang sau khi 4 them o vi tri thu 2:");
		n = insertToPos(array, array.length, n, 4, 1);
		printArray(array, n);
	}

	private static double countAverage(int[] array) {
		int s = 0;
		for (int i = 0; i < array.length; i++) {
			s += array[i];
		}
		return s / array.length;
	}

	private static int findMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private static int findMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	private static int findNegativeNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0)
				return array[i];
		}
		return 0;
	}

	private static int findPositiveNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				return array[i];
		}
		return 0;
	}

	private static int findNegativeMax(int[] array) {
		int nMax = findNegativeNumber(array);
		if (nMax == 0)
			return nMax;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 && nMax < array[i]) {
				nMax = array[i];
			}
		}
		return nMax;
	}

	private static int findNegativeMin(int[] array) {
		int nMin = findNegativeNumber(array);
		if (nMin == 0)
			return nMin;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 && nMin > array[i]) {
				nMin = array[i];
			}
		}
		return nMin;

	}

	private static int findPositiveMin(int[] array) {
		int pMin = findPositiveNumber(array);
		if (pMin == 0)
			return pMin;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && pMin > array[i]) {
				pMin = array[i];
			}
		}
		return pMin;
	}

	private static int findPositiveMax(int[] array) {
		int pMax = findPositiveNumber(array);
		if (pMax == 0)
			return pMax;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && pMax < array[i]) {
				pMax = array[i];
			}
		}
		return pMax;
	}

	private static void printEvenNumbers(int[] array) {
		System.out.println("In Ra Phan Tu Chan:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	private static void printOddNumbers(int[] array) {
		System.out.println("In Ra Phan Tu Le:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	private static int insertToPos(int[] arr, int size, int n, int x, int postision) {
		if (n >= size) {
			return n;
		}
		if (postision < 0 || postision > n) {
			return n;
		}
		for (int i = n; i > postision; i--) {
			arr[i] = arr[i - 1];
		}
		arr[postision] = x;
		return n + 1;
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
