import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a sequnce of words ending with STOP");
	String s =" ";
		int count = 0;
		boolean stop = false;
		do {
			 s = sc.next();
			if (s.equals("stop"))
				stop = true;
			else
				count++;
		} while (stop == false);
		System.out.println("Number of words in input " + count);
	}// main

}// while
