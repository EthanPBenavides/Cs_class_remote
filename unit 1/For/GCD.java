/**
 * GCD.java 11/18/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class GCD
{
    /**
     * Gets the greatest common denominator of 2 numbers
     * 
     * @param numOne
     * @param numTwo
     * 
     * @return GCD
     */
    public static long getGCD(int numOne, int numTwo)
    {
        long gcd = 0;
        for ( int i = 1; i > 0; i++ )
        {
            if ( numOne % i == 0 && numTwo % i == 0 )
            {
                gcd = i;
            }
        }
        return gcd;
    }
}

/*
 * You do not have to make a full class for this lab! Just write the code for
 * the getGCD method and that's it.
 */