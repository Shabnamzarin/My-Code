import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pin = "1234";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your password");
		String s = sc.next();
		for (int timeOftry = 1; timeOftry < 3; timeOftry++) {
			if (s.equals(pin)) {
				sc.close();
				System.out.println(" Your password  is correct");
			} // if
			else
				System.out.println(" Enter your password again ");
			s = sc.next();
		} // for

		System.out.println("Your Card is locked");
	}// main

}// class Pin
