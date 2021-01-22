 
/**
 * Name: MingFang Li (lim)
 * Course: CSCI 241 - Computer Science I
 * Section: 001
 * Assignment: 6
 *
 * Project/Class Description:
 *         This program uses several separate methods to print a table
 *         of integers and the digits contained within them.
 *
 * Known bugs: none
 */

// importing scanner library
import java.util.Scanner;

// class NumberChart
public class NumberChart
{
    // this method drives other methods to work
    public static void main(String [] args){
    
        // call the method printHeading
        printHeading();
        
        // call the method getValue twice to get 2 values from user
        int A = getValue(1000,1250);
        int B = getValue(1251,1499);
        
        // call the method printChartHeading to print the heading of the chart
        printChartHeading(A,B);
        
        // call the method printChart to print the chart
        printChart(A,B);
    }

    // use this method to print the heading
    public static void printHeading()
    {
        System.out.println("This program will work with a range of 4-digit integers.");
        System.out.println("It will report the digits contained in each integer in the range.");
        System.out.println("-----------------------------------------------------------------");
    }

    /*
     this method takes two integer parameters and returns an integer
     the first parameter is the lowest acceptale value
     the second parameter is the hightest acceptale value
     use this method to get 2 input numbers from user
     and use a do-while loop to print the error message if the number user enters is out of range
     and if the number user enters is out of range, run again until the right number is entered
     */
    public static int getValue(int loestNum,int highestNum)
    {
        // set up a Scanner
        Scanner keyboard = new Scanner(System.in);

        // declare and initialize num
        int num = 0;

        // if the number is lower than the lowest number or bigger than the highest number
        // continue the loop
        do{
            // print the instruction
            System.out.print("Enter a number between " + loestNum +"  and  " + highestNum);
            System.out.print(" (inclusive): ");

            // ask user for the input
            num = keyboard.nextInt();

            // if the number is lower than the lowest number or bigger than the highest number, 
            //print the error message 
            // and run again
            if (num < loestNum || num > highestNum)
            {
                System.out.println("Error : number out of range.");
            }
        }
        while(num < loestNum || num > highestNum);
        return num;
    }

    // use this method to print the heading of the chart
    // and put in the lowest number and the highest number that user entered
    public static void printChartHeading(int A,int B)
    {   System.out.println();
        System.out.println("*************************************");
        System.out.println("* * *  N u m b e r   C h a r t  * * *");
        System.out.println("*************************************");
        System.out.println("  # # # # #  " + A + " - " + B + "  # # # # #  ");
        System.out.println("=====================================");
        System.out.println("        0  1  2  3  4  5  6  7  8  9 ");
        System.out.println("=====================================");
    }

    /*
     this method print the body of the chart 
     this method takes 2 integers and doesn't return anything
     the first parameter is the lowest number which user entered to print in the chart
     the second parameter is the highest number which user entered to print in the chart
    */
    public static void printChart(int A,int B)
    {
        // checking the range of numbers and applying method 
        for(int a=A ; a<=B; a++)
        {
            // if a contains 0 then print the line
            if (contains(a%10,0)) 
            System.out.println("-----|-------------------------------");

            // print the output
            System.out.printf("%5d%s",a,"|");

            // checking head values for numbers
            for(int head=0; head<=9; head++){

                // if the 4 digit numbers contain any number from the head 
                // which are numbers from 1 to 9, print a "x" under that number
                // otherwise print 3 spaces
                if(contains(a,head))
                    System.out.printf("%3s","x");
                else
                    System.out.print("   ");
            }
            
            // linebreak
            System.out.print("\n");
        }
    }

    
    // this method takes two integer parameters and return a boolean
    // to check if the second integer is one of the digits in the first parameter
    public static boolean contains (int A,int B){
        
        // converting both integers A and B to strings
        // set strings d and e respectively, represent string A and B
        String d = (((Integer)A).toString());
        String e = (((Integer)B).toString());

        // if d contains e return true 
        // otherwise return false
        if(d.contains(e))
            return true;
        else 
            return false;
    }
}