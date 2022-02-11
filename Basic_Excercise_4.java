//Exercise 4: Create a method to check if a number is a power of two or not

package LabAssignment;
import java.util.Scanner;

public class Basic_Excercise_4 {
	

public static boolean checkNumber(int n )
{
	 while(n!=1)
	    {
	        if(n%2!=0)
	            return false;
	        n=n/2;
	    }
	 return true ;
	}
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("Enter number : ");
		try (Scanner scanner = new Scanner(System.in)) 
		{
			int num = scanner.nextInt();
			
			
			if(checkNumber(num))
			{
				System.out.println("is power of 2");
			}
			else 
			{
				System.out.println("not power of 2");
			}
		}
	
	
		
	}

}
