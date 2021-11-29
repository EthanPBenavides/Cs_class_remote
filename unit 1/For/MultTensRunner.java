

public class MultTensRunner
{
    /**
     * prints multiples of then upto: <br>
     * 1, 2, 13, 4, 10, -5, 0, 6
     */
	public static void main( String[] args )
	{
		System.out.println( MultTens.go( 1 ) );
		System.out.println( MultTens.go( 2 ) );
		System.out.println( MultTens.go( 13 ) );
		System.out.println( MultTens.go( 4 ) );
		System.out.println( MultTens.go( 10 ) );
		System.out.println( MultTens.go( -5 ) );
		System.out.println( MultTens.go( 0 ) );
		System.out.println( MultTens.go( 6 ) );
	}
}