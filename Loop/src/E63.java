import java.util.Scanner;

public class E63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int prevNumber = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a sequnce of integers ending with STOP");
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			count++;
			if (count >= 1 && n == prevNumber)
				System.out.println(n);
			prevNumber = n;

		}//while 

	}// main

}// class
