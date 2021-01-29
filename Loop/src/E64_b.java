import java.util.Scanner;

public class E64_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a String");
		String s = sc.next();
		for(int i=0;i<s.length();i = i+2) {
		
		System.out.println(s.charAt(i));
	
	}//for
		
}//main
}//class