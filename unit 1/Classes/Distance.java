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
package distance;

import java.lang.Math;

public class Distance
{
	public double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
	    double x;
	    double tmp1 = (xTwo-xOne)^2;
	    double tmp2 = (yTwo-yOne)^2;
	    double tmp3 = tmp1+tmp2;
	    x = Math.sqrt(tmp3);
		
	    return x;	
	}
}