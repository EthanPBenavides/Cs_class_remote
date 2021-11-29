/**
 * MonsterRunner.java 11/10/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 *
 * @author - I received help from ...
 *
*/
import java.util.Scanner;

public class MonsterRunner
{
	/**
	 * Main function: creates 2 monsters based on user input
	 * @param args
	 */
	public static void main( String args[] )
	{
		//variables
		String name1, name2;
		int size1, size2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st Monsters name : ");
		name1 = in.nextLine();
		
		System.out.println("Enter 1st Monsters size : ");
		size1 = in.nextInt();
		
		in.nextLine();
		
		System.out.println("Enter 2st Monsters Name : ");
		name2 = in.nextLine();
		
		System.out.println("Enter 1st Monsters size : ");
		size2 = in.nextInt();
		
		in.close();
		
		//make Monsters
		Monster one = new Monster(name1, size1);
		Monster two = new Monster(name2, size2);
		
		//output monster info 
		System.out.printf("\n"+one+"\n"+two+"\n");
		if (one.isSmaller(two)) 
		{
			System.out.println("Monster one is smaller than Monster two.");
		} 
		else 
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		if (one.namesTheSame(two)) 
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
	}
}