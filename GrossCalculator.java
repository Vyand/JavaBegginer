import java.util.*;

public class GrossCalculator {
	
	public static double GrossProfit() 
	{
		//Gross profit = Revenue – COGS
		//double revenue =0;
		//double cost_of_good_sold = 7000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter revuenue: ");
		double revenue = sc.nextDouble();
		System.out.println("Enter cost of goods sold: ");
		double cost_of_good_sold = sc.nextDouble(); 
				
		double gross_profit =  revenue - cost_of_good_sold;
		System.out.println("Your gross profit is: " +  gross_profit );
		return gross_profit;
	}
	public static double NetProfit() 
	{
		/*int Rent = 9000;
		int Salary = 120000;
		int Utilities = 3500;
		int tax = 5000;*/
		
		double grossP = GrossProfit();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your expenses for this month: ");
		double total_expenses  =  sc.nextDouble();
		
		
		double net_profit = grossP - total_expenses;
		System.out.println("Your net profit is: " + net_profit);
		return net_profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GrossProfit();
		NetProfit();

	}

}