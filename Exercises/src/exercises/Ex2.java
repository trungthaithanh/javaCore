package exercises;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println(String.format("Binary of %d is: %s", 999, covertToBinary(999)));
		System.out.println(String.format("Decimal of %d is: %s", 1111100111, convertToDecimal(1111100111)));
	}

	public static String covertToBinary(int number) {
		StringBuilder binary = new StringBuilder();
		while (number != 0) {
			binary.append((number % 2));
			number /= 2;
		}
		return binary.reverse().toString();
	}

	public static int convertToDecimal(int binaryNumber) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, n);
				binaryNumber = binaryNumber / 10;
				n++;
			}
		}
		return decimal;
	}
}
