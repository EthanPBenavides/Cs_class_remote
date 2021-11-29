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

import java.util.Scanner;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner in=new Scanner(System.in);
	    System.out.println("Distance == ");
	    int dist = in.nextInt();
	    System.out.println("Minutes  == ");
        int mins = in.nextInt();
        System.out.println("Hours    == ");
        int hrs = in.nextInt();
        in.close();
        System.out.printf(dist+" "+hrs+" "+mins+" :: "+ MilesPerHour.getMPH(dist, hrs, mins)+" MPH" );
	}
}

/*
 
45 0 32 = 84 MPH
96 1 43 = 56 MPH
100 2 25 = 41 MPH
50 2 25 = 21 MPH
10 10 19 = 1 MPH
100 50 77 = 2 MPH

*/