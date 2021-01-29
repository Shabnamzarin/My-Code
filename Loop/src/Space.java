import java.util.Scanner;

public class Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("please insert the word ? ");
		String s=sc.nextLine();
		
		int space=0;
		for(int i=0 ;i<s.length();i++ ) {
		char ch = s.charAt(i);
		if(ch == ' ' )
		{
		space++;
		}//if
		}//for
		System.out.print("The number of space is  " + space);
	}//main

}//class
