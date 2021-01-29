import java.util.Scanner;

public class E64_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numOfVowels =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a String");
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(c=='a' || c=='e' ||c=='o' || c=='u') {
		s=s.replace(c,'*');
		numOfVowels++;
		System.out.println("Vowel " + c + " In position " + i);
		}//if
	}//for
		System.out.println(s);
}//main
}//class