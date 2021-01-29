import java.util.Scanner;

public class Sentinel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert your salary ? ");
		double sum = 0;
		int count = 0;
		double salary = 0;
		while (salary != -1) {
			salary = in.nextDouble();
			if (salary != -1) {
				sum = sum + salary;
				count++;
			} // if
		} // while

		if (count > 0) {
			double average = sum / count;
			System.out.println("Average Salary :" + average);
		} // if

		else
			System.out.println("No Data");
	}// main

}// class
