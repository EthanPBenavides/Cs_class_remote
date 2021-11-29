public class CoolChicken 
{
    // instance variables
    private int wingCount;
    private double speed;
    private String name;
    
    public CoolChicken( double s, int wc, String n )
    {
    	speed = s;
    	wingCount = wc;
    	name = n;
    }
    
    public double maxSpeed()
    {
      return wingCount*speed;  //add code
    }
    
    public boolean isCool()
    {
      if (maxSpeed() > 1000 && name.contains("cool")) {
    	  return true;
      }
      return false;
    }
}