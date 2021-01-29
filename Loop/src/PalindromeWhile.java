import java.util.Scanner;

public class PalindromeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("please insert the word ? ");
		String s = sc.nextLine();
		boolean isPalindrome = true;
		int i = 0;
		while (i <= s.length() - 1) {
			char c1 = s.charAt(i);
			int j = s.length() - 1 - i;
			char c2 = s.charAt(j);
			if (c1 != c2)
				isPalindrome = false;
			i++;
		} // while
		if (isPalindrome == true)
			System.out.println("The String is palindrome");

		else

			System.out.println("The String is not palindrome");		

	}

}
