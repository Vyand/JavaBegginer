import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class NetSalary {

	public static void main(String[] args) 
	{
		
		//Declaring scanner 
		Scanner input = new Scanner(System.in);
		//Declaring and initializing the values
		int employeeNumber;
		double rateperhour = 150.0, tax = 0.15, uif= 0.01, salary = 0.0, netSalary=0.0, hours = 0.0f;
		String name, surname;
		String title;
		double taxed = salary * tax, uif_amount = salary * uif;
		
		//Declaring time and date
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		
		 //Prompting the user to enter information
		System.out.println("Enter employer name: ");
		name = input.nextLine();
		System.out.println("Enter employers surname:");
		surname = input.nextLine();
		System.out.println("Enter job title");
		title = input.nextLine();
		System.out.println("Enter employer number: ");
		employeeNumber = input.nextInt();
		System.out.println("Enter hours worked");
		hours = input.nextDouble();
		
		// Validating the rate per hour as per title
		if(title.toLowerCase().contains("tester")) {
			rateperhour = 350.00;
			
		}else if(title.toLowerCase().contains("developer")) {
			rateperhour = 309.50;
		}
		//Calculating salary and net salary
		salary = rateperhour * hours;
		taxed = salary * tax;
		uif_amount = salary * uif;
		netSalary = salary - taxed - uif_amount;
		
		System.out.println("Hellow "+ name +" "+surname);
		System.out.println("Employee number: "+ employeeNumber);
		System.out.println("Job title: "+title);
		System.out.println("You have worked "+ hours +" this month");
		System.out.println("Salary before deductions: "+ salary);
		System.out.println("Taxed amount: "+ taxed);
		System.out.println("UIF contribution: "+ uif_amount);
		System.out.println("Net Salary: "+ netSalary);
		
		System.out.println("Page 1 of 1 \t\t\t  Date Printed " + datetime.format(now));
		

	}

}
