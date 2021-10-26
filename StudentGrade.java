
import java.util.Scanner;
public class StudentGrade {
	Scanner myinput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		String[] studentname = getName();
		int[] studentnumber = getStudentNo();
		double[][] scores = getScores();
		double[] total = getTotal(scores);
		double[] averageScores = getAverage(total);
		char[] grade = getGrades(averageScores);
		
		for (int i=0; i<studentnumber.length; i++)
		{
			System.out.println("STUDENT NUMBER" + " "+ studentnumber[i]+ " " + "WITH THE NAME" +" "+ studentname[i] + " " + "HAS AN AVERAGE OF"+" "+ averageScores[i] +" "+ "AND THEIR GRADE IS" +" "+ grade[i] );
		}
	  
	}
	public static int[] getStudentNo()
	{
		Scanner myinput = new Scanner(System.in);
		int[] number = new int[5];
		System.out.println("Enter student number");
		
		for (int i=0; i<number.length; i++)
		{
			number[i] = myinput.nextInt();
		}
		return number;
	}
	public static String[] getName()
	{
		Scanner myinput = new Scanner(System.in);
		String[] name = new String[5];
		System.out.println("Enter student Names");
		
		for (int i=0; i<name.length; i++)
		{
			name[i] = myinput.nextLine();
		}
		return name;
	}
	public static double[][] getScores()
	{
		Scanner myinput = new Scanner(System.in);
		double[][] scores = new double[5][4];
		int r,c;
		System.out.println("Enter scores for the" + scores[0].length +" "+ "tests");
		outerloop:
			for (r=0; r<scores.length; r++)
			{
				//LOOP PER STUDENT IN CLASS
				r = r + 0;
				System.out.println("Student"+ " "+ (r+1) +" "+ "modules:");
				for(c=0; c<scores[r].length; c++)
				{
					//STUDENT SCORE ENTERY LOOP
					c = c + 0;
					System.out.println("Module" +" " +(c+1) +" "+ "score is");
					scores[r][c] = myinput.nextDouble();
					if(scores[r][c]<0||scores[r][c]>100)
					{
						System.out.println("Invalid Scores");
						break outerloop;
					}
				}
			}
		return scores;
	}
	public static double[] getTotal(double[][]scores)
	{
		double[] total = new double[scores.length];
		for (int r=0; r<scores.length; r++)
		{
			for(int c=0; c<scores[c].length; c++)
			{
				total[r] +=scores[r][c];				
			}
		}
		return total;
	}
	public static double[] getAverage(double[]total)
	{
		double[] average = new double[total.length];
		for (int i=0; i<total.length; i++)
		{
			average[i] = total[i]/4; 
		}
		return average;
	}
	public static char[] getGrades(double[]average)
	{
		char [] grade = new char[average.length];
		for(int i=0; i<average.length; i++)
		{
			if(average[i]<50.0)
			{
				grade[i] ='F';
			}
			else if(average[i]<69.0)
			{
				grade[i] ='D';
			}
			else if(average[i]<79.0)
			{
				grade[i] ='C';
			}
			else if(average[i]<89.0)
			{
				grade[i] ='B';
			}
			else
			{
				grade[i] ='A';
			}
		}		
		return grade;
	}
}
