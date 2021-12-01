import java.util.Scanner;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void setUpper(int upper)
	{
		upperBound = upper;
	}

	public int getUpper()
	{
		return upperBound;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		/*Yes, you can have System.out.println in this method */
		int guess  = 0;
		int count  = 0;
		int secret = (int) (Math.random()*(upperBound + 1));
		do 
		{
			System.out.println("What is the number? ");
			guess = keyboard.nextInt();
			count++;
			keyboard.next();
		} 
		while ( guess != secret);
		keyboard.close();
		System.out.println("It took "+count+"guesses to guess "+secret+".");
		

	}
}