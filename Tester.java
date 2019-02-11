// I affirm that this program is entirely my own work and none of it is the work of any other person.
//	Leonardo Pantaleon

package pascaltriangle;


import java.util.Scanner;

/**
 * Tester class for the testing of the pascal triangle.
 * @author leo
 */
public class Tester {

    public static void main(String[] args) {

        int keepPlaying = 1;    //starts a variable used to keep playing

        while (keepPlaying == 1) {     //the loop to do another another game
            Scanner scnr = new Scanner(System.in);     //declaring a scanner object

            System.out.println("How many rows in your triangle?");
            int numRows = scnr.nextInt();
            while (numRows > 13 || numRows < 1) {       //thrown when the user enters an invalid range
                System.out.println("Invalid selection.");
                System.out.println("Please enter a number between 1 and 13");
                numRows = scnr.nextInt();
            }

            PascalsTriangle firstTriangle = new PascalsTriangle(numRows);       //creates an object of pascal triangle
            firstTriangle.printPascal();

            System.out.println("Do you wish to create another wonderful triangle?");
            System.out.println("Type 1 to keep going or 2 to stop playing");
            keepPlaying = scnr.nextInt();       //statement to keep playing takes the value and runs it with the first loop
        }
    }

}
