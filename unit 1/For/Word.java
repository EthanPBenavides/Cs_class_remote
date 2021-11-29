/**
 * Word.java 11/17/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class Word
{
    private String word;

    /**
     * sets first case
     * 
     * @param String
     */
    public Word(String s)
    {
        word = s;
    }

    /**
     * @return the first character
     */
    public char getFirstChar()
    {
        return word.charAt(0);
    }

    /**
     * @return the last character
     */
    public char getLastChar()
    {
        return word.charAt(word.length() - 1);
    }

    /**
     * Inverts a string
     * 
     * @return String
     */
    public String getBackWards()
    {
        String back = "";
        for ( int i = word.length() - 1; i < word.length() && i > -1; i-- )
        {
            back = back + word.charAt(i);
        }
        return back;
    }

    public String toString()
    {
        return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word;
    }

    /**
     * @return the word
     */
    public String getWord()
    {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String w)
    {
        word = w;
    }
}