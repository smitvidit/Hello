
public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Question 1: Write a Java Program to reverse a String. */
		String s1 = "123456789";
		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("GIt changes");
		System.out.println(s2);

		/* Write a Java Program to swap two given Strings */

		String s3 = "VIDIT";
		String s4 = "PATEL";

		s3 = s3 + s4;

		// s4 = s3.substring(0, 5);
		s4 = s3.substring(0, s3.length() - s4.length());
		s3 = s3.substring(s4.length());

		System.out.println("First String : " + s3);
		System.out.println("Second String : " + s4);

	}

}
