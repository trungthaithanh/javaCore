package exercises;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.format("reversed of %s is %s", "Cybersoft", reverseString("Cybersoft")));
	}

	public static String reverseString(String str) {
		if (str.length() <= 1)
			return str;
		StringBuilder result = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			result.append(str.charAt(i));
		}
		return result.toString();
	}
}
