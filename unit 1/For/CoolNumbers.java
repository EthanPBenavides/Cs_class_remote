/**
 * CoolNumbers.java 11/18/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class CoolNumbers
{
    /**
     * checks if num is a cool number
     * 
     * @param num
     * 
     * @return
     */
    public static boolean isCoolNumber(int num)
    {
        if ( num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1 )
        {
            return true;
        }
        return false;
    }

    /**
     * checks if a range of numbers from 6 to Stop
     * 
     * @param stop
     * 
     * @return number of cool numbers
     */
    public static int countCoolNumbers(int stop)
    {
        int count = 0;
        for ( int i = 6; i <= stop; i++ )
        {
            if ( isCoolNumber(i) )
            {
                count++;
            }
        }
        return count;
    }
}

/*
 * You do not have to make a full class for this lab! Just write the code for
 * the isCoolNumber and countCoolNumbers methods and that's it.
 */