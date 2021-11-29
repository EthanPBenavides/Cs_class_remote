/**
 * test.java  09/28/21
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 *
 * @author - I received help from ...
 *
*/
package Triangle; 

import java.lang.Math;

public class Triangle
{
	private int a, b, c;
	private double perimeter;
	private double area;

	public Triangle(int a, int b, int c)
	{
		//set variables
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void calcPerimeter( )
	{
		//calculate perimeter
		perimeter = a+b+c;
	}
	public void calcArea() {
		//calculate area
		double s = perimeter/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	public double getArea( )
	{
		//return area
		return area;
	}
}