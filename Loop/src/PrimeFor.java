import java.util.Scanner;

public class PrimeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Interdouce an integer X and " 
		+ "I will compute if X is prime number?");
		int x = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < x; i++)
			if (x % i == 0)
				isPrime = false;
		if (isPrime)
			System.out.print(x + " Is prime number");
		else
			System.out.print(x + " Is not prime number");

	}// main

}// class
