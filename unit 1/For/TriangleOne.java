
public class TriangleOne
{
    /**
     * makes a word pyramid
     * @param word
     */
    public static void print(String word)
    {
        System.out.println(word);
        for ( int i = word.length() - 1; i < word.length() && i != 0; i-- )
        {
            System.out.println(word.substring(0, i));
        }
    }
}

/*
 * You do not have to make a full class for this lab! Just write the code for
 * the print method and that's it. And YES, you can have System.out.println in
 * the print method.
 */