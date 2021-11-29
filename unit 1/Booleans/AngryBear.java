public class AngryBear{
	private int teeth;
	private int days;
    
	public AngryBear() 
	{
		teeth = 10;
		days = 3;
	}
	
    public AngryBear( int one, int two )
    {
    	teeth = two;
    	days = one;
    }
    
    public boolean isAngry()
    {
    	if (days > 3 &&  teeth < 10)
    	{
    		return true;
    	}
    	if (teeth == 0) 
    	{
    		return true;
    	}
    	if (days > 5)
    	{
    		return true;
    	}
    	return false;
    }
}