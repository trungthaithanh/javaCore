package exercises;

public class Ex5 {
	public static void main(String[] args) {
		System.out.println(
				String.format("Length 2 points A(%d,%d) and B(%d,%d) is %f", 1, 3, 2, -2, measureLength(1, 3, 2, -2)));
	}

	public static double measureLength(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
