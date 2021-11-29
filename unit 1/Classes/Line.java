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
package slope;

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
	    double tmp1 = (y2-y1);
	    double tmp2 = (x2-x1);
	    double x = tmp1/tmp2; 
		return x;
	}

}