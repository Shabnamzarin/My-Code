import java.util.Scanner;

public class LoopNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please Enter Integers ? ");
		Scanner sc = new Scanner(System.in);
		int n;

		while (sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println("You enter " + n);
			System.out.print("Please Enter Integers ? ");
		} // while
		System.out.print("STOP");
	}// main

}// class
