
public class java_lab_5_4 
{
	
	

	public static void main(String[] args) throws Exception
	{
		
		employeeDetails(null , null);
		
	}
		
	public static  void employeeDetails(String firstName , String lastName)
	{	
		try 
		{
			
			
			if((firstName != null && !firstName.isEmpty()) && (lastName != null) && !lastName.isEmpty() ) {
				System.out.println("Employee full name :");
				System.out.println(firstName + " " + lastName);
			}
			else
			{
				throw new Exception();
			}
				
		}
		
		catch(Exception e) 
		{
			System.out.println("Firstname and LastName is blank");
		}		
		
	
	}

}
