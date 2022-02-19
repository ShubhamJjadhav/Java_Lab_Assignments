import java.util.Scanner;

public class java_lab_5_5 {
	
	
	public static void checkAge (int age) throws java_lab_class_belowAge_5_5{
		
		if (age > 15 ) {
			System.out.println("Your age " + age + " is above 15");
		}
		
		else {
			throw new java_lab_class_belowAge_5_5("Your age is below 15");
		}
		
				
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter you age : ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		try {
			java_lab_5_5.checkAge(age);
		}
		catch(java_lab_class_belowAge_5_5 ba){
			System.out.println(ba.getMessage());	
		}
		finally {
			System.out.println("Thank you !!");
		}
	}



	

}
