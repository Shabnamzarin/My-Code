import java.util.Scanner;

public class Nfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Interduce an integer n and I will compute n!");
		int n = sc.nextInt();

		int result = 1;
		int currentNumber = 1;
		while (currentNumber <= n) {
			result = result * currentNumber;
			currentNumber++;

		} // while

		System.out.println("n!= " + result);

	}// main

}// class Factorial
