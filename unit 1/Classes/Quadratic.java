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
package quadratic;

import java.lang.Math;

public class Quadratic
{
	public double getRootOne( int a, int b, int c )
	{
	    double radical = -b + Math.sqrt((b*b)-4*a*c);
	    radical = radical/(2*a);
        return radical;
	}
	
	public double getRootTwo( int a, int b, int c )
	{
	    double radical = -b - Math.sqrt((b*b)-4*a*c);
        radical = radical/(2*a);
        return radical;
	}
}