import java.util.*;
public class StudentClass 
{
	public static void main(String[] args) 
	{
		int studentno =  0;
		String studentName = "";
		String qualification = "";
		String studentCourses = "";
		double feeBalance = 0.0;
		double feePaid = 0.0;
		double levy = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your student Number");
		
		studentno = input.nextInt();
		
		if(studentno == 007)
		{
			studentName = "Lungelo Harry Vyand";
			qualification = "Bachelor's Degree in Information Technology";
			studentCourses = "Software Development, and Research Methodology";
			feeBalance = 48000;
			feePaid = 32000;
			levy = 2689.50;	
			
			int softwareDevelopment = 97;
			int computerSystems= 93;
			int researchMethodology= 79;
			int databaseManagement =87;

			double TotalMarks = softwareDevelopment + computerSystems + researchMethodology + databaseManagement;
			double average = TotalMarks/4;
			
			System.out.println(">>>>>>>>>>Student Information<<<<<<<<<<<");
			System.out.println();
			System.out.println("Student Name:"+ " " + studentName + "\n"+
								"Student Qualification:" + " " + qualification + "\n" +
								"Student courses:" + " " + studentCourses);
			System.out.println();
					System.out.println("Fees to be paid"+ " " +"R"+feeBalance + " " + "Fees Paid by student" + " " + "R"+feePaid + " " + "Student Leavies" + " " + "R"+levy); 
					System.out.println();
					System.out.println(">>>>>>>>>>Student Results<<<<<<<<<<<");
					System.out.println();
					System.out.println("Software Development:"+ " "+ softwareDevelopment+ "\n"+
										"Computer Science:"+ ""+ computerSystems+ "\n"+
										"Research Methodology:" + " "+ researchMethodology+ "\n"+
										"Database Management:" + " "+ databaseManagement);
					System.out.println();
					System.out.println("Student Average:" + " " + average);	
		}
		else if(studentno == 375)
		{
			studentName = "Tshepi Vyand";
			qualification = "Bachelor's Degree in Information Technology";
			studentCourses = "Software Development and Research Methodology";
			feeBalance = 78000;
			feePaid = 32000;
			levy = 2689.50;	
			
			int softwareDevelopment = 92;
			int computerSystems= 99;
			int researchMethodology= 85;
			int databaseManagement =71;			

			double TotalMarks = softwareDevelopment + computerSystems + researchMethodology + databaseManagement;
			double average = TotalMarks/4;
			
			System.out.println(">>>>>>>>>>>Student  Information<<<<<<<<<<<");
			System.out.println();
			System.out.println("Student Name:"+ " " + studentName + "\n"+
								"Student Qualification:" + " " + qualification + "\n" +
								"Student courses:" + " " + studentCourses);
			System.out.println();
					System.out.println("Fees to be paid"+ " " + "R"+feeBalance + " " + "Fees Paid by student" + " " + "R"+feePaid + " " + "Student Leavies" + " " + "R"+levy);
					System.out.println();
					System.out.println(">>>>>>>>>>>Student Results<<<<<<<<<<<");
					System.out.println();
					System.out.println("Software Development:"+ " "+ softwareDevelopment+ "\n"+
										"Computer Science:"+ ""+ computerSystems+ "\n"+
										"Research Methodology:" + " "+ researchMethodology+ "\n"+
										"Database Management:" + " "+ databaseManagement);
					System.out.println();
					System.out.println("Student Average:" + " " + average);								
		}
		else {
				System.out.println("Student Number does not exist try another one");
		}	
	}
}
