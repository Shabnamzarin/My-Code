import java.util.Scanner;

public class Mahdi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter any number: ");
			float num = in.nextFloat();
			if (num == (int) num) {
				continue;
			}
			break;
		}
		System.out.print("STOP ");
	}//main
}//class
