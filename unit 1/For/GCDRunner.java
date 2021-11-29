/**
 * GCDRunner.java 11/18/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class GCDRunner
{
    /**
     * gets GCD of 7 different sets of numbers
     * 
     * @param args
     */
    public static void main(String[] args)
    {

        System.out.println("the greastest common denominator of 5 and 25 is "  + GCD.getGCD(5, 25));
        System.out.println("the greastest common denominator of 4 and 400 is " + GCD.getGCD(4, 400));
        System.out.println("the greastest common denominator of 8 and 80 is "  + GCD.getGCD(8, 80));
        System.out.println("the greastest common denominator of 15 and 45 is " + GCD.getGCD(15, 45));
        System.out.println("the greastest common denominator of 6 and 66 is "  + GCD.getGCD(6, 66));
        System.out.println("the greastest common denominator of 9 and 9 is "   + GCD.getGCD(9, 9));
        System.out.println("the greastest common denominator of 9 and 543 is " + GCD.getGCD(9, 543));
        System.out.println("the greastest common denominator of 15 and 40 is " + GCD.getGCD(15, 40));
        System.out.println("the greastest common denominator of 6 and 51 is "  + GCD.getGCD(6, 51));
    }
}