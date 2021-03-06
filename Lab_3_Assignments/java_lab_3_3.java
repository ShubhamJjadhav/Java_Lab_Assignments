
//Create a method which accepts an integer array, reverse the numbers in the 
//array and returns the resulting array in sorted order
package Lab_3_Assignments;
import java.util.ArrayList;
import java.util.Collections;

public class java_lab_3_3
{
	public static void main(String[] args) {
		int arr[] = { 12, 10, 102, 31, 15 };
		int n = arr.length;
		
		sortArr(arr, n);
	}
	
	
	static void sortArr(int arr[], int n)
	{
		
		ArrayList<int[]> vp = new ArrayList<>();

		for(int i = 0; i < n; i++)
		{
			vp.add(new int[]{reversDigits(arr[i]),
										arr[i]});
		}

		Collections.sort(vp, (a, b) -> a[0] - b[0]);

		for(int i = 0; i < vp.size(); i++)
			System.out.print(vp.get(i)[1] + " ");
	}
	
	static int reversDigits(int num)
	{
		int rev_num = 0;
		while (num > 0)
		{
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}
	

}
