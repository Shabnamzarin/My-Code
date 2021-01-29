import java.util.Scanner;

public class Sentinel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert your salary end with stop? ");
		double sum = 0;
		int count = 0;
		double salary = 0;

		while (in.hasNextDouble()) {
			salary = in.nextDouble();
			sum = sum + salary;
			count++;
		} // while

		if (count > 0) {
			double average = sum / count;
			System.out.println("Average Salary :" + average);
		} // if

		else
			System.out.println("No Data");

	}// main

}// class