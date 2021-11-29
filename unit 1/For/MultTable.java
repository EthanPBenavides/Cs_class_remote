/**
 * MultTable.java 11/15/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class MultTable
{
    private int number;
    private int stop;
    /**
     * sets inital variables
     * @param number
     * @param stop point
     */
    public MultTable(int n, int s)
    {
        number = n;
        stop   = s;
    }
    /**
     * Prints table 
     */
    public void printTable()
    {
        for ( int i = 1; i <= stop; i++ )
        {
            if ((number*i) < 10 ) {
                System.out.printf(i + "       " + (number * i)+"\n");
            } else {
                System.out.printf(i + "      " + (number * i)+"\n");
            }
        }
    }

    /**
     * @return the number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * @return the stop
     */
    public int getStop()
    {
        return stop;
    }

    /**
     * 
     * @param n
     * @param s
     */
    public void setAll(int n, int s)
    {
        number = n;
        stop = s;
    }

}