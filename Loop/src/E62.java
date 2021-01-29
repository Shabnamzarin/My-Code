import java.util.Scanner;

public class E62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentMin = Integer.MAX_VALUE;
		int currentMax = Integer.MIN_VALUE;
		int nomOfEvenInputs = 0;
		int nomOfOddInputs = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a sequnce of integers ending with STOP");
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n < currentMin)
				currentMin = n;
			if (n > currentMax)
				currentMax = n;
			if (n % 2 == 0)
				nomOfEvenInputs++;
			else
				nomOfOddInputs++;
			total = total + n;
			System.out.println(total);

		} // while
		System.out.println("Max number is " + currentMax);
		System.out.println("Min number is " + currentMin);
		System.out.println("Number of Even number is " + nomOfEvenInputs);
		System.out.println("Number of Odd number is " + nomOfOddInputs);
	}// main
}// class E63