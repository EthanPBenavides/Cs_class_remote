
public class CharSum
{
   private String word;
   private int sum;
   private char letter;

	public CharSum()
	{
	}

	public CharSum(String w, char let)
	{
	}


	public void setWord(String w,char let)
	{
	    word = w;
	    letter = let;
	}

	public void locateAndAdd()
	{
	    int letPos;
	    byte[] Word;
	    Word = word.getBytes(US_ASCII);
	}

	public String toString()
	{
		return "The letters surrounding the "+letter+"s in " + word + " have a total of " + sum + "\n";
	}
}