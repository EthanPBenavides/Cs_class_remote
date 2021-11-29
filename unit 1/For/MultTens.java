
public class MultTens
{
    /**
     * Outputs multiples of 10 up to x
     * @param x
     * @return multiples of ten
     * <br> aplus if 0 or less
     */
    public static String go(int x)
    {
        if ( x>0 )
        {
            String out = "";
            for ( int i = 1; i <= x; i++ )
            {
                out = out + i * 10;
            }
            return out;
        } 
        else 
        {
        return "aplus";
        }
    }
}

/*
 * You do not have to make a full class for this lab! Just write the code for
 * the go method and that's it.
 */