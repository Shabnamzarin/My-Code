import java.util.Scanner;

public class Sentinel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert your salary ? ");
		double sum = 0;
		int count = 0;
		double salary = 0;
		boolean done=false;
		while (!done) {
			salary = in.nextDouble();
			if (salary == -1) {
				done=true;
			}//if
				else {
				sum = sum + salary;
				count++;
			} // else
		} // while

		if (count > 0) {
			double average = sum / count;
			System.out.println("Average Salary :" + average);
		} // if

		else
			System.out.println("No Data");

	}//main

}//class 
