/**
 * WordRunner.java 11/17/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class WordRunner
{
    /**
     * reverses word spelling and prints first and last characters
     * 
     * @see Word.java
     */
    public static void main(String[] args)
    {
        // tests case hello
        Word w = new Word("Hello");
        System.out.println(w + "\n\n");
        // tests case World
        w.setWord("World");
        System.out.println(w + "\n\n");
        // tests case Jukebox
        w.setWord("Jukebox");
        System.out.println(w + "\n\n");
        // tests case TCEA
        w.setWord("TCEA");
        System.out.println(w + "\n\n");
        // tests case UIL
        w.setWord("UIL");
        System.out.println(w + "\n");
    }
}