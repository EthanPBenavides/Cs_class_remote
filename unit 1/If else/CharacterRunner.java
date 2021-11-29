//TODO comment
/**
 * 
 * CharacterRunner.java  11/11/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 *
 * @author - I received help from ...
 *
 */

import java.util.Scanner;

public class CharacterRunner
{
    /**
     * Creates scanner object and uses it to check several characters
     * @param args
     */
    public static void main(String[] args)
    {
        char              letter;
        
        // created scanner
        Scanner           in   = new Scanner(System.in);
        CharacterAnalyzer test = new CharacterAnalyzer();

        System.out.print("Enter a letter :: ");
        letter = in.next().charAt(0);

        test.setChar(letter);
        System.out.println(test);
        in.nextLine();

        System.out.print("Enter a letter :: ");
        letter = in.next().charAt(0);

        test.setChar(letter);
        System.out.println(test);
        in.nextLine();

        System.out.print("Enter a letter :: ");
        letter = in.next().charAt(0);

        test.setChar(letter);
        System.out.println(test);
        in.nextLine();

        System.out.print("Enter a letter :: ");
        letter = in.next().charAt(0);

        test.setChar(letter);
        System.out.println(test);
        in.nextLine();

        System.out.print("Enter a letter :: ");
        letter = in.next().charAt(0);

        test.setChar(letter);
        System.out.println(test);
        in.nextLine();

        System.out.print("Enter a letter :: ");
        letter = in.next().charAt(0);

        test.setChar(letter);
        System.out.println(test);
        in.nextLine();

        System.out.print("Enter a letter :: ");
        letter = in.next().charAt(0);

        test.setChar(letter);
        System.out.println(test);

        in.close();
    }
}