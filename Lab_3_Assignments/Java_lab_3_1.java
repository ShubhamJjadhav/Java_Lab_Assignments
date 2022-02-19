
//Create a method which accepts an array of integer elements and return the 
//second smallest element in the array
package Lab_3_Assignments;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Java_lab_3_1 {

		
		public static void main(String args[])
		{ 
			// TODO Auto-generated method stub
			
			Integer x[]={23,56,7,3,2,43};  
			Integer y[]={63,5,83,1,45,74,56,98,566};

			System.out.println("Second Smallest: "+getSecondSmallest(x,5));  
			System.out.println("Second Smallest: "+getSecondSmallest(y,7));  
			} 
		
		
		
		public static int getSecondSmallest(Integer[] a, int total){  
			List<Integer> list=Arrays.asList(a);  
			Collections.sort(list);  
			int element=list.get(1); 

			return element;  
			} 

	

}
