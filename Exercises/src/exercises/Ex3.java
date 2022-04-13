package exercises;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println(String.format("Java version: %s", System.getProperty("java.version")));
		System.out.println(String.format("Java Runtime Version: %s", System.getProperty("java.runtime.version")));
		System.out.println(String.format("Java home: %s", System.getProperty("java.home")));
		System.out.println(String.format("Java Vendor: %s", System.getProperty("java.vendor")));
		System.out.println(String.format("Java Vendor URL: %s", System.getProperty("java.vendor.url")));
		System.out.println(String.format("Java Class Path: %s", System.getProperty("java.class.path")));
	}
}
