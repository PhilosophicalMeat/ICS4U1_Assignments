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
        int packageOfBottles = 12; //# of bottles
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

        //2D-Array

    }
}
