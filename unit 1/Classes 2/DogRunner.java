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
package Dog;

public class DogRunner
{
	public static void main( String[] args )
	{
		//does what the lab tells it to do
		//makes dog with name rover
		Dog d = new Dog( "rover" );
		//gets age in human years
		System.out.println( d.getPeopleAge( 7 ) );
		//increases age by 2
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		//gets age in human years
		System.out.println( d.getPeopleAge( 11 ) );
		//outputs name
		System.out.println( d.getName() );
		//increases age by 4 years
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		//gets age in human years
		System.out.println( d.getPeopleAge( 8 ) );
		//makes new dog by the name of bob and an age of 3
		Dog g = new Dog( "bob", 3 );
		//outputs name
		System.out.println( g.getName() );
		//gets age in human years
		System.out.println( g.getPeopleAge( 5 ) );
	}
}