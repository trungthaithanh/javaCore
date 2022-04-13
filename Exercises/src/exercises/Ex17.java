package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		int soCuaMay, soNguoiChoiDoan;
		boolean isWinner = false;
		String ketQua = "";
		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();
		soCuaMay = 1 + rd.nextInt(1001);
//		System.out.print(soCuaMay);
		while (!isWinner) {
			System.out.print("Mời bạn đoán số: ");
			soNguoiChoiDoan = scanner.nextInt();

			if (soNguoiChoiDoan > soCuaMay) {
				ketQua = "==> Bạn đoán lon hon so cua may!";
				System.out.println(ketQua);
			} else if (soNguoiChoiDoan < soCuaMay) {
				ketQua = "==> Bạn đoán nho hon so cua may!";
				System.out.println(ketQua);
			} else {
				ketQua = "==> Bạn đoán đúng!";
				System.out.println(ketQua);
				isWinner = true;
			}
		}
	}
}
