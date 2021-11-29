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

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
       for(int i=0; i<=20; i++) {
           System.out.print("*");
       }
       System.out.println();
   }

   public void printTwentyDashes()
   {
       for(int i=0; i<=20; i++) {
           System.out.print("-");
       }
       System.out.println();
   }

   public void printTwoBlankLines()
   {
       System.out.println();
       System.out.println();
   }
   
   public void printASmallBox(int x)
   {
       switch (x) {
       case 1:
           for(int i=0; i<=10; i++) 
           {
           printTwentyDashes();
           }
       case 2:
           for(int i=0; i<=10; i++) 
           {
               printTwentyStars();
           }
       }
   }
 
   public void printABigBox(int x)
   { 	
       switch (x) {
       case 1:
           for(int i=0; i<=10; i++) 
           {
           printTwentyDashes();
           }
       case 2:
           for(int i=0; i<=10; i++) 
           {
               printTwentyStars();
           }
       }
   }   
}