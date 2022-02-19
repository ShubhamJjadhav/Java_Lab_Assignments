
//Create a method that can accept an array of String objects and sort in 
//alphabetical order. The elements in the left half should be completely in uppercase and 
//the elements in the right half should be completely in lower case. Return the resulting 
//array.
package Lab_3_Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class java_lab_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      @SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);

	      int n;   
	      System.out.println("Enter the number : ");
	      n=sc.nextInt();     

	      String str[]=new String[n];   
	      System.out.println("Enter the  range of String :");
	      for(int i=0; i<n ;i++)    
	      {
	          str[i]=sc1.nextLine();
	      }

	      Arrays.sort(str);    

	      System.out.println(Arrays.toString(str));  

	}

}
