import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("how many number you want in the sequence ? ");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.close();
		System.out.print("Fibonacci series " + count + " numbers : ");
		int num1 = 0, num2 = 1;

		for (int i = 1; i <= count; i++) {
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			System.out.print(num1 + " ");
		} // for

	}// main

}// Fibonacci class
