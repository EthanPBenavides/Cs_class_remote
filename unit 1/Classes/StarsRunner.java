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
package stars_stripes;

import java.util.Random;

public class StarsRunner
{
   static int random;
   static int x;
   
   public static void main(String args[])
   {
      StarsAndStripes ref=new StarsAndStripes();
      Random rand = new Random();
      random = rand.nextInt(356);
      for(int i=0; i<=random; i++) 
      {
          x=rand.nextInt(7);
          switch (x) 
          {
              case 1:
                  ref.printTwoBlankLines();
              case 2:
                  ref.printTwentyStars();
              case 3:
                  ref.printTwentyDashes();
              case 4:
                  ref.printASmallBox(rand.nextInt(2));
              case 5:
                  ref.printABigBox(rand.nextInt(2));
              case 6:
                  ref.printTwoBlankLines();
              default:
                  ref.printTwoBlankLines();
          }
      }
   }
}