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

public class LineRunner
{
   public static void main( String[] args )
   {
		System.out.println( "Slope is :: " + String.format("%.2f" , Line.getSlope( 1,9,14,2 )) );
		//add more test cases
		System.out.println( "Slope is :: " + String.format("%.2f" , Line.getSlope( 1,7,18,3 )) );
		System.out.println( "Slope is :: " + String.format("%.2f" , Line.getSlope( 6,4,2,2 )) );
		System.out.println( "Slope is :: " + String.format("%.2f" , Line.getSlope( 4,4,5,3 )) );
		System.out.println( "Slope is :: " + String.format("%.2f" , Line.getSlope( 1,1,2,9 )) );
		System.out.println( "Slope is :: " + String.format("%.2f" , Line.getSlope( 1,7,2,9 )) );
	}
}