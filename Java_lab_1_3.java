//Exercise 3: Create a method to check if a number is an increasing number

package LabAssignment;
import java.util.Scanner;



public class Java_lab_3 {

	
	    public static void main(String args[]) {

	   
	       int inteGer_value;
	       boolean examp = false;

	       System.out.println("Enter a number : ");
		
	       @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in) ;
			inteGer_value = scanner.nextInt();
			
		
		   int modulus = inteGer_value % 10;
	       inteGer_value = inteGer_value/10;

	 
	       while(inteGer_value>0){
	              if(modulus <= inteGer_value % 10)
	              {
	               examp = true;
	               break;
	              }

	           modulus = inteGer_value % 10;
	           inteGer_value = inteGer_value/10;
	       }

	    
	       if(examp){
	           System.out.println("Not in increasing order.");
	       }else{
	           System.out.println("In increasing order.");
	       }
	    }
	

}
