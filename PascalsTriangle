package pascaltriangle;

import java.util.Arrays;

/**
 * Class that creates a pascal triangle that knows the number of rows it has. 
 */
public class PascalsTriangle {

    private int numRows;
    private int numColumns;
    private int[][] pascalTriangle;
    
    /**
     * Creates a pascal triangle object that knows its number of rows.
     */ 
    public PascalsTriangle(int numRows) {
        this.numRows = numRows;     //initializes number of rows and number of columns 
        this.numColumns = numRows;     //both initialized to number of rows because they are equal 
        pascalTriangle = new int[numRows][numColumns];    //initializes the pascal triangle as a 2D array
        populatePascal(pascalTriangle, numRows);    //runs the method to populate it
    }
    
    /**
     * Method to fill the triangle based on the number of rows.
     * @param pascalTriangle the triangle to be filled
     * @param numRows how many rows the triangle is going to have
     */
    
    public void populatePascal(int[][] pascalTriangle, int numRows) {
        if (numRows >= 1) {     //fills the first row of the triangle
            pascalTriangle[0][0] = 1;
        }
        if (numRows >= 2) {     //fills the second row of the triangle
            pascalTriangle[1][0] = 1;
            pascalTriangle[1][1] = 1;
        }
        if (numRows > 2) {     //after the number of rows is two they are filled with an algorithmn 
            for (int i = 2; i < numRows; i++) {     //loops through the rows to be filled
                for (int j = 0; j <= i; j++) {     //loops through the column in that row
                    if (j == 0) {     //fills the first column 
                        pascalTriangle[i][j] = 1;
                    } else if (j == i) {    //fills the last column
                        pascalTriangle[i][j] = 1;
                    } else {    //fills the middle middle columns with the addition of the two upper adjacent numbers
                        pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1]
                                + pascalTriangle[i - 1][j];
                    }
                }
            }

        }
    }

    /**
     * Prints the triangle that was just created.
     */
    public void printPascal() {
        for (int i = 0; i < numRows; i++) {     //loops through the number of rows in the triangle
            for (int k = 0; k < numRows - i; k++) {     //loops through the number of rows again
                System.out.print("   ");    //adds 4 whitespaces everytime it loops through
            }
            for (int j = 0; j < i + 1; j++) {     //goes through every column in that row 
                if (j < i) {     //the column number is less than the row number meaning that it is not the last number of the row
                    int numOfDigits = String.valueOf(pascalTriangle[i][j]).length();
                    switch (numOfDigits) {     //switch case for number of digits and it is only up to three
                        case 1:
                            System.out.print(pascalTriangle[i][j] + "     ");
                            break;
                        case 2:
                            System.out.print(pascalTriangle[i][j] + "    ");
                            break;
                        case 3:
                            System.out.print(pascalTriangle[i][j] + "   ");
                            break;
                        default:
                            break;
                    }

                } else {
                    System.out.print(pascalTriangle[i][j]);     //else meaning that it is the last number in the row
                }
            }
            System.out.println("");    //seperate the rows
        }
    }

}
