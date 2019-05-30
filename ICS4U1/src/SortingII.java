import com.sun.org.apache.bcel.internal.generic.IADD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class SortingII {
    public static void main(String[] args) throws IOException{
        //exercise 1
        int[] iArray = new int[10];
/*
        sortPromptedNumList(iArray);
*/
        //exercise 2
        File fileExc2 = new File("C:\\Users\\Ethan\\Desktop\\ICS4U documents\\Unit 7 - Sorting\\IntegerCollection1.txt");
        int[] iArrayTwo = {0,0,0,0,0,0,0,0,0,0};
        sortFileNumList(fileExc2, iArrayTwo);
        System.out.println();
        //exercise 3
        File fileExc3 = new File("C:\\Users\\Ethan\\Desktop\\ICS4U documents\\Unit 7 - Sorting\\IntegerCollection2.txt");
        int[] iArrayThree = new int[100];
        //filling the array with placeholder values
        for (int i = 0; i <iArrayThree.length ; i++) {
            iArrayThree[i] = 0;
        }
        sortFileNumList(fileExc3, iArrayThree);
        System.out.println();
        //exercise 4
        File fileExc4 = new File("C:\\Users\\Ethan\\Desktop\\ICS4U documents\\Unit 7 - Sorting\\IntegerCollection3.txt");
        Scanner tempScannerExc4 = new Scanner(fileExc4);
        int i;
        for (i = 0; tempScannerExc4.hasNext(); i++) {
            tempScannerExc4.nextLine();
        }
        int[] iArrayFour = new int[i];
        for (int j = 0; j < iArrayFour.length; j++) {
            iArrayFour[j] = 0;
        }
        sortFileNumList(fileExc4, iArrayFour);
    }
    //method for exercise 1
    public static void sortPromptedNumList(int[] iArray) throws IOException{
        //declaring scanner
        Scanner scanner = new Scanner(System.in);
        //putting values into array
        for (int i = 0; i < iArray.length; i++) {
            System.out.println("Enter value " +i);
            iArray[i] = scanner.nextInt();
        }
        //sorting the array
        int tempVal = 0;
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray.length; j++) {
                if (iArray[i] < iArray[j] && i != j) {
                    tempVal = iArray[j];
                    iArray[j] = iArray[i];
                    iArray[i] = tempVal;
                }
            }
        }
        //printing the values
        for (int i = 0; i < iArray.length; i++) {
            System.out.println(iArray[i]);
        }
    }
    //method for exercise 2 & 3
    public static void sortFileNumList(File file, int[] iArray) throws IOException {
        Scanner scanner = new Scanner(file);
        //filling the unsorted array
        for (int i = 0; scanner.hasNext(); i++) {
            iArray[i] = scanner.nextInt();
        }
        //sorting the unsorted array
        int tempVal = 0;
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray.length; j++) {
                if (iArray[i] < iArray[j] && i != j) {
                    tempVal = iArray[j];
                    iArray[j] = iArray[i];
                    iArray[i] = tempVal;
                }
            }
        }
        //printing the values
        for (int i = 0; i < iArray.length; i++) {
            System.out.println(iArray[i]);
        }
    }
}
