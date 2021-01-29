import java.util.Scanner;

public class PrimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Interdouce an integer X and " + "I will compute if X is prime number?");
		int x = sc.nextInt();
		boolean isPrime = true;
		int currentNumber = 2;

		while (currentNumber < x) {
			if (x % currentNumber == 0)
				isPrime = false;
			currentNumber++;
		} // while
		if (isPrime == true)
			System.out.println(x + " Is Prime");
		else
			System.out.println(x + " Is Not Prime");

	}// main
}// Class
