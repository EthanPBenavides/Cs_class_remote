/**
 * MultTableRunner.java 11/15/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class MultTableRunner
{
    public static void main(String[] args)
    {
        MultTable mult = new MultTable(5, 5);
        System.out.println("\n"+"multiplication table for " + mult.getNumber());
        mult.printTable();
        //tests 3 upto 7
        mult.setAll(3, 7);
        System.out.println("\n"+"multiplication table for " + mult.getNumber());
        mult.printTable();
        //tests 1 upto 6
        mult.setAll(1, 6);
        System.out.println("\n"+"multiplication table for " + mult.getNumber());
        mult.printTable();
        //tests 9 upto 9
        mult.setAll(9, 9);
        System.out.println("\n"+"multiplication table for " + mult.getNumber());
        mult.printTable();
        //tests 7 upto 8
        mult.setAll(7, 8);
        System.out.println("\n"+"multiplication table for " + mult.getNumber());
        mult.printTable();
    }
}