
public class Main {
	public static void main(String[] args) {
		String String1 = "You and Me";
		String String2 = " you and me ";

		System.out.println(String1.equals(String2));
		System.out.println(String1.contains("and"));
		System.out.println(String1.length());
		System.out.println(String1.substring(0, 1) + String1.substring(5));
		System.out.println(String2.trim());
		System.out.println(String1.toUpperCase());
		System.out.println(String2.toUpperCase().trim());
	}
}
