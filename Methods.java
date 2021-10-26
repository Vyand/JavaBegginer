import java.util.Scanner;

public class Methods {
	
	public static double account_balance()
	{
		Scanner sc = new Scanner(System.in);
		double input_salary = sc.nextDouble();
		
		System.out.println("Enter your salary");
		System.out.println(input_salary);
		return input_salary;
	}
	public static double tax()
	{
		double balance = account_balance();
		double tax = 0.2*balance;
		double uif = 0.1*balance;
		
		System.out.println("Your TAX is " + tax);
		System.out.println("Your UIF is " + uif);
		System.out.println("Your net salary is " + (balance-(tax+uif)));
		System.out.println("Your yearly tax is " + tax * 12);
		System.out.println("Your annual net salary is " + ((balance*12)-(uif+tax)));
		
		return 0;
	}
	

	public static void main(String[] args) 
	{
		tax();
	}

}
