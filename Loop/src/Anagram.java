import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first Word to check for anagram ");
		String word1 = sc.next();
		System.out.println("Insert first Word to check for anagram ");
		String word2 = sc.next();
		int len1 = word1.length();
		int len2 = word2.length();
		boolean anagram = true;
		int j = len2 - 1;
	
			for (int i = 0; i < len1; i++) {
				char c1 = word1.charAt(i);
				char c2 = word2.charAt(j);
				if (c1 != c2)
					anagram = false;
				j--;
			} // for
				
		if (anagram)
			System.out.println("the words are anagram");
		else

			System.out.println("the words are not anagram");

	}

}
