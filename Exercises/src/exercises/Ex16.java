package exercises;

public class Ex16 {
	public static void main(String[] args) {
		int year = 2000;

		if (checkYear(year) == true) {
			System.out.println("%d la nam nhuan!" + year);
		} else {
			System.out.println("%d khong phai nam nhuan!" + year);
		}
	}

	static Boolean checkYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		return false;
	}
}
