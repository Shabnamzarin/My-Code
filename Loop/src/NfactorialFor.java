import java.util.Scanner;

public class NfactorialFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Interduce an integer n and I will compute n!");
		int n = sc.nextInt();

		int result = 1;
		for (int currentNumber=1; currentNumber <= n; currentNumber++)
			result = result * currentNumber;
			
			System.out.println("n!= " + result);

	}// main

}// class Factorial
