/**
 * 
 * Monster.java  11/10/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 *
 * @author - I received help from ...
 *
 */

public class Monster
{
	private String name;
	private int howBig;	
	
	/**
	 * Creates Monster object with name n and size size.
	 * @param n
	 * 		The name of the monster
	 * @param size
	 * 		The size of the monster
	 */
	public Monster(String n, int size)
	{
		name = n;
		howBig = size;
	}

	/**
	 * Returns the name of the monster
	 * @return
	 * 		monster name
	 */
	public String getName()
	{
		//return name
		return name;
	}
	
	/**
	 * Returns the size of the monster
	 * @return
	 * 		Monster size
	 */
	public int getHowBig()
	{
		return howBig;
	}
	/**
	 * Checks if the current monster is larger than another monster
	 * @param other
	 * 		The other monster
	 * @return
	 * 		returns true if larger than the other monster
	 */
	public boolean isBigger(Monster other)
	{
		if (howBig < other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Handles full size check routine
	 * @param other
	 * 		The other monster
	 * @return
	 * 		returns true if smaller than the other monster
	 */
	public boolean isSmaller(Monster other)
	{
		if (!isBigger(other)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the monsters have the same name
	 * @param other
	 * 		The other monster
	 * @return
	 * 		Returns True if  both monsters have the same name
	 */
	public boolean namesTheSame(Monster other)
	{
		if (name.equals(other.getName())) {
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return name+" "+howBig;
	}
}