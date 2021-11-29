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

public class Dog
{
  //variables
  private int age;
  private String name;
	
  public Dog( String n )  
  {
	//sets the dog name variable and an age of 1
    age = 1;
    name = n;
  }
  
  public Dog( String n, int a )  
  {
	//sets both dog variables
	age  = a;
	name = n;
  }
  
  public void increaseAgeByOne()
  {
	//increase age by 1
  	age++;
  }
  
  public int getPeopleAge( int val )
  {
	//converts from dog years to human years
   int x=age*7;
   return x;
  }
	
  public int getAge()    {
   return age;
  }
	
  public String getName()    {
   return name;
  }
}
