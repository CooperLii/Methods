/**
 * The MultiplicationTable class uses a 2-dimensional 
 * array of characters to hold the contents of the
 * row and column multiplied together.
 * 
 * @author Erica Eddy
 * @version November 2009
 */
import java.util.*;

public class MultiplicationTable
{
    // Fill the table with the row and column entries
    // multiplied together.
    // Note that the position numbers are adjusted so
    // that the multiplication is easier.
    public static void fillTable(int [] [] tbl)
    {
        for (int r = 1; r <=tbl.length; r++)
        {
            for (int c = 1; c <= tbl[r-1].length; c++)
            {
                tbl[r-1][c-1] = r * c;
            }
        }
    }

    // print the table contents
    public static void printTable(int [] [] tbl)
    {
        for (int r = 0; r <tbl.length; r++)
        {
            for (int c = 0; c < tbl[r].length; c++)
            {
                System.out.printf("%4d ",tbl[r][c]);
            }
            System.out.println();
        }
        int [] list = new int[5];
        list = new int[6];
    }    

    public static void main(String[] args)
    {
        int [][] table; // will hold multiplied values

        // set up Scanner and ask user for sizes
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter # of rows: ");
        int rows = keyboard.nextInt();
        System.out.print("Enter # of columns: ");
        int cols = keyboard.nextInt();

        // create (instantiate) the array
        table = new int [rows][cols];
        fillTable(table);
        printTable(table);
        
        
    }
}