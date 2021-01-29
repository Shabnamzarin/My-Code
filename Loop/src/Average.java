import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Insert some integer and end with stop");
		
		double total=0;
		int count=0;
		while (in.hasNextDouble())
		{
			double input=in.nextDouble();
			total=total+input;
			count++;
					}//while
	
		if(count>0)
		{
			double average = total/count;
			System.out.println("Average is "+average);
		}//if
		
	
	}//main

}//class
