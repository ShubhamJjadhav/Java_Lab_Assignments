//Exercise 2: Create a class with a method to find the difference between the sum of the 
//squares and the square of the sum of the first n natural numbers.

package LabAssignment;


//SumOfsquare = addition of individual square number 
//sumSquareNo = addition of natural number  
//sumSquare = summation of squares of the first natural number

public class Java_lab_2 {
	

	public static void main(String[] args) 
	{
		int i ;	
		double SumOfsquare = 0  ;
		double sumOfsquareNo = 0;
		int sum = 0 ;
		double difference = 0;
		
		for(i=1 ; i<=5 ;i++)
		{
			
			SumOfsquare = (i*i)+ SumOfsquare;   //1^1 + 2^2 + 3^3 +4^4 + 5^5 = 55
			sum = sum + i ;						// 1 + 2 + 3 + 4 + 5 =15
			sumOfsquareNo = sum*sum ;			// 15 * 15 =225
			
			difference = SumOfsquare - sumOfsquareNo ;
			
		}
	
			System.out.println("Addition of square of each number : ");
			System.out.println(SumOfsquare);
			System.out.println("");
			System.out.println("Addition of first natural no. and its square : ");
			System.out.println(sumOfsquareNo);
			System.out.println("");
			System.out.println("difference between the sum of the \r\n"+ "squares of the first n natural numbers and \r\n"+ "the square of their sum");
			System.out.println(difference);
			
			
			
	}


}




















//
//public static double Square_Addition_individual(int a)
//{	
//	int i ;	
//	double SumOfsquare = 0  ;	//SumOfsquare = addition of individual square number 
//	for(i=1 ; i<=a ;i++)
//	{
//		SumOfsquare = (i*i)+ SumOfsquare;          //1^2 + 2^2 + 3^2 +4^2 + 5^2 = 55
//	}
//	return (SumOfsquare) ;
//	
//}
//
//public static double natural_addition_square(int b)
//{	
//	double sumSquare = 0 ;		//sumSquareNo = addition of natural number 
//	double sumSquareNo = 0 ;	//sumSquareNo = summation of first natural number and then its square 
//	double difference = 0 ;
//	for (int i =1 ;i<= b ;i++)
//	{
//		sumSquareNo = i + sumSquareNo ;           	  //1+2+3+4+5 = 15
//		sumSquare = sumSquareNo * sumSquareNo;		  //(1+2+3+4+5)^2 =225
//		difference = sumSquare
//	}
//	return sumSquare;
//
//}
//


