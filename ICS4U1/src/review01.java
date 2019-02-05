import java.lang.String;
import java.util.Scanner;
public class review01{
    public static void main (String [] args){

        //Question #2: Primitive Data Types
        boolean Boolean;
        byte num;
        char character;
        short Short;
        int integer;
        long Long;
        float Float;
        double Double;

        //Question #3: Other Data Types
        String string = "This is a string. Basically text. Can be editted with commands and such";

        //Question #4: Declaring Variables
        int packageOfBottles = 12;
        double packageCost = 3.50;
        String brand = "Pure Life";

        //Question #5: Changing Values
        packageOfBottles = 24;
        packageCost = 4.50;
        brand = "Selection Natural Spring Water";

        //Question #6: Calculating cost of a single bottle
        double costSingle = packageCost/packageOfBottles;

        //Question #7: Displaying Cost of Bottles from 1-# of bottles per package
        for (int i = 0; i <= packageOfBottles; i++) {
            double cost = costSingle*i;
            System.out.println("Cost of " +i+ " bottles: $" +cost);
        }

        //Question #8: Array of costs for 1-100 bottles
        double[] costArray = new double[100];
        for (int i = 0; i < 100 ; i++) {
            costArray[i] = costSingle*i;
        }

        //Question #9: Other methods of filling an array
        int count = 0;
        while(count < 100){
            costArray[count] = costSingle*count;
            count++;
        }

        //Question #10: 2D-Array
        int[][] testArray = new int[10][];
        //Stating the 2D-Array "testArray". The range of this data is 0-9 rows, and 0-2 columns

        int data = 1;//The value of row 0, column 0 (the starting point)
        for (int i = 0; i < 10; i++) {
            testArray[i] = new int [3]; //This basically means "Row 'i' has 3 columns", so the 2D array is auto-generated
            for (int j = 0; j < 3; j++) {
                testArray[i][j] = data;
                System.out.println("Row " +i+ ", Column " +j+ ": " +testArray[i][j]); //Printing the value of testArray row 'i', column 'j'
                data++; //data increases by 1 for every column value (until it reaches the end of the array)
            }
        }

    }
}
