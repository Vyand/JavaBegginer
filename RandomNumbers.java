//Number Guessing Game in Java Swing
//Also posted at 

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int numberToGuess = rand.nextInt(10);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false;
	
		while(win == false)
		{
			System.out.println("Guess a number between 1 and 10");
			guess = input.nextInt();
			numberOfTries++;
		
				if(guess == numberOfTries)
					{
						win = true;
					}
				else if(guess> numberToGuess)
					{
						System.out.println("Your guess is to high");
					}
				else if(guess< numberToGuess)
					{
						System.out.println("Your guess is to low");
					}
		}
		System.out.println("You win!!");
		System.out.println("The number was " + numberToGuess);
		System.out.println("It took you " + numberOfTries + " tries");
	}
}
/*import java.util.Random;
public class RandomNumbers{
        public static void main(String[] args) {
        	Random objGenerator = new Random();
            for (int iCount = 0; iCount< 7; iCount++){
              int randomNumber = objGenerator.nextInt(49);
              System.out.println("Random No : " + randomNumber); 
             }
     }
}*/
