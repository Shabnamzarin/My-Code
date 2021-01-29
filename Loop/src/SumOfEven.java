
public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int count = 0;
		int sum = 0;

		while (n <= 100) {
			if (n % 2 == 0)
				sum = sum + n;
			n++;
			count++;
		} // while
		System.out.println("The sum of all even numbers between 2-100 is " + sum);
		if (count > 0) {
			double average = sum / count;
			System.out.println("The average of all even numbers between 2-100 is " + average);
		} // if

	}// main

}// class
