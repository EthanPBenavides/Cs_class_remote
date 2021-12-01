import java.util.Scanner;

/* It should go without saying that you need keyboard input to do this lab */

public class GuessRunner
{
	public static void main(String args[])
	{
		boolean cont = true;
		int nums = 0;
		Scanner keyboard = new Scanner(System.in);
		GuessingGame g=new GuessingGame(nums);
		do 
		{
			System.out.println("Guessing game - how many numbers? ");
			nums = keyboard.nextInt();
			g.playGame();
		}
		while (cont);
	}
}