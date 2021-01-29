
public class SumOfEvenFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int even = 0;
		int sum = 0;

		for (int n = 2; n <= 100; n++) {
			if (n % 2 == 0) {
				sumEven = sumEven + n;
				even++;
			} else
				sumOdd = sumOdd + n;
			odd++;

		} // For
		sum = sumOdd + sumEven;
		System.out.println("The sum of all  numbers between 2-100 is " + sum);
		System.out.println("The sum of all Even  numbers between 2-100 is " + sumEven);
		System.out.println("The sum of all Odd numbers between 2-100 is " + sumOdd);
		if (odd > 0 || even > 0) {
			double averageOdd = sumOdd / odd;
			double averageEven = sumEven / even;
			System.out.println("The average of all even numbers between 2-100 is " + averageEven);
			System.out.println("The average of all odd numbers between 2-100 is " + averageOdd);
		} // if

	}// main

}// class
