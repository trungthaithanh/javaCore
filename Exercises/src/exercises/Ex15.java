package exercises;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào chuoi: ");
		String text = scanner.nextLine();
		System.out.println("Do dai cua chuoi la:" + text.length());
		int index;
		do {
			System.out.println("Nhập vào vi tri index: ");
			index = scanner.nextInt();
		} while (index < 0 || index >= text.length());
		System.out.println(String.format("Ky tu tai vi tri %d la %c", index, text.charAt(index)));

		if (text.contains("abcdef")) {
			System.out.println("Chuoi co chua chuoi phu abcdef");
		} else {
			System.out.println("Chuoi khong co chua chuoi phu abcdef");
		}

	}

}
