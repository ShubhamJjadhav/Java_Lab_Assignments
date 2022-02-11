//Exercise 1: Create a class with a method which can calculate the sum of first n natural 
//numbers which are divisible by 3 or 5.

package LabAssignment;
import java.util.Scanner;

public class Basic_Exercise_1 
{		
		
	
		public static void main(String []args)
		{int sum = 0 ;
			System.out.println("enter number : ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			
			System.out.println("number which are divisible by 3 and 5 are : ");
			for(int i=1 ;i<=num ;i++)
			{
			
				if(i%3==0 && i%5==0)
				{
					
					System.out.println(i);
					sum = i+sum ;
					
				}
				
		
		}System.out.println("addtion of numbers which are divisible by 3 and 5 : " + sum);
		}
				
}


