
// TODO comment everything
/**
 * CharacterAnalyzer.java 11/10/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class CharacterAnalyzer
{
    private char theChar;

    /**
     * Creates a CharacterAnalyzer <br>
     * Default Character = A
     */
    public CharacterAnalyzer()
    {
        theChar = 'A';
    }

    /**
     * creates a CharacterAnalyzer
     * 
     * @param Character the first character that can be used
     */
    public CharacterAnalyzer(char c)
    {
        theChar = c;
    }

    /**
     * Sets the CharacterAnalyzer's active character
     * 
     * @param c character to set to
     */
    public void setChar(char c)
    {
        theChar = c;
    }

    /**
     * gets currently set character
     * 
     * @return currently set character
     */
    public char getChar()
    {
        return theChar;
    }

    /**
     * Checks if set character is uppercase
     * 
     * @return true if ASCII value is greater than 65 but less than 90
     */
    public boolean isUpper()
    {
        if ( theChar <= 90 && theChar >= 65 )
        {
            return true;
        }
        return false;
    }

    /**
     * Checks if set character is lowercase
     * 
     * @return <Strong>True</Strong> if ASCII is less than 122 but greater than 97
     */
    public boolean isLower()
    {
        if ( theChar <= 122 && 97 <= theChar )
        {
            return true;
        }
        return false;
    }

    /**
     * Checks if set character is a number
     * 
     * @return <Strong>True</Strong> if ASCII value is less than 57 but greater than
     *         48
     */
    public boolean isNumber()
    {
        if ( theChar >= 48 && theChar <= 57 )
        {
            return true;
        }
        return false;
    }

    /**
     * Gets the ASCII value
     * 
     * @return the ASCII value
     */
    public int getASCII()
    {
        return (int) theChar;
    }

    /**
     * Checks if the set character is uppercase, lowercase, or a number
     * 
     * @return Character case or number
     */
    public String getCase()
    {
        if ( isLower() )
        {
            return "lowercase character";
        } else if ( isUpper() )
        {
            return "uppercase character";
        } else if ( isNumber() )
        {
            return "number";
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return getChar() + " is a " + getCase() + " ASCII == " + getASCII() + "\n";
    }
}