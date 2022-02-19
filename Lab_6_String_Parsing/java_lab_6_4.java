package Lab_6_String_Parsing;
import java.time.LocalDate;
import java.time.Month;


//Write a Java program that reads on file name from the user, then displays information
//about whether the file exists, whether the file is readable, whether the file is writable, the type of
//file and the length of the file in bytes?

public class java_lab_6_4 {

	public static void
	getDayMonthYear(String date)
	{

		LocalDate currentDate = LocalDate.parse(date);

		int day = currentDate.getDayOfMonth();

		Month month = currentDate.getMonth();

		int year = currentDate.getYear();

		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}

	public static void main(String args[])
	{
		
		String date = "2022-02-19";

		getDayMonthYear(date);
	}

}