/**
 * test.java  09/27/21
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 *
 * @author - I received help from ...
 *
*/
package mph;

public class MilesPerHour
{
	public static double getMPH( int dist, int hrs, int mins )
	{
	    double time = mins / (double) 60;
	    double y= hrs+time;
	    double x = dist/(y);
		return (int) x;
	}
}

