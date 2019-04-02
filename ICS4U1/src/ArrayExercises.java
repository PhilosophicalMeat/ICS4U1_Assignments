import java.util.Scanner;
import java.util.Random;
public class ArrayExercises {
    public static void main(String[] args) {
        //Exercise 1
        /*System.out.println("Exercise 1");
        int[] integerArray = {1, 4, 6, 7, 9, 2};
        smallestDifference(integerArray);*/

        //Exercise 2
        /*System.out.println("Exercise 2");
        int[][] exTwoArray = new int[10][10];
        int exTwoBound = 100;
        fill2DArray(exTwoArray, exTwoBound);
        maxRowSum(exTwoArray);
        maxColSum(exTwoArray);*/

        //Exercise 3
        /*System.out.println("Exercise 3");
        int[] exThreeArray = new int[10];
        int exThreeBound = 50;
        fillArray(exThreeArray, exThreeBound);
        searchArray(exThreeArray);*/

        //Exercise 4
        /*System.out.println("Exercise 4");
        String[] exFourArray = new String[25];
        Scanner inputTemp = new Scanner(System.in);
        //Declaring the first 10 words in the array
        for (int i = 0; i < exFourArray.length; i++) {
            if(i<=9) {
                System.out.println("Enter the word at location " + i);
                exFourArray[i] = inputTemp.nextLine();
                System.out.println("Word " + i + ": " + exFourArray[i]);
            }
            else{
                exFourArray[i] = "";
            }
        }
        searchStringArray(exFourArray);*/

        //Exercise 5
        System.out.println("Exercise 5");



    }
    public static void smallestDifference(int[] intArray){
        //Find smallest value in array
        int minLoc = 0;
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                min = (intArray[j] < intArray[i]) ? intArray[j] : min;
                minLoc = (intArray[j] < intArray[i]) ? j : minLoc;
            }
        }
        System.out.println("Smallest Value: " +min);
        //Find second smallest value
        int minTwo = intArray[1];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                minTwo = (intArray[j] < intArray[i] && intArray[j] > min) ? intArray[j] : minTwo;
            }
        }
        System.out.println("Second smallest value: " +minTwo);
        //finding the distance between the smallest and second smallest values
        int difference = minTwo - min;
        System.out.println("Distance between the values: " +difference);
    }
    public static void fillArray(int[] iArray, int bound){
        Random rand = new Random();
        int val = rand.nextInt(bound);
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = val;
            val = rand.nextInt(bound);
            System.out.println("Array Value #" +(i+1)+ ": " +val);
        }
    }
    public static void fill2DArray(int[][]iArray, int bound){
        Random rand = new Random();
        int val = rand.nextInt(bound);
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) {
                iArray[i][j] = val;
                val = rand.nextInt(bound);
            }
        }
    }
    public static void maxRowSum(int[][] iArray){
        int[] rowSums = new int[iArray.length];
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) {
                rowSums[i] += iArray[i][j];
            }
        }
        int max = 0;
        int maxLoc = 0;
        for (int i = 0; i < rowSums.length; i++) {
            for (int j = 0; j < rowSums.length; j++) {
                max = (rowSums[j] > rowSums[i]) ? rowSums[j] : max;
                maxLoc = (rowSums[j] > rowSums[i]) ? j : maxLoc;
            }
        }

        System.out.println("Row with max sum: " +maxLoc+ "\n" + "Sum: " +max);
    }
    public static void maxColSum(int[][] iArray){
        int[] colSums = new int[iArray.length];
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) {
                colSums[i] += iArray[j][i];
            }
        }
        int max = 0;
        int maxLoc = 0;
        for (int i = 0; i < colSums.length; i++) {
            for (int j = 0; j < colSums.length; j++) {
                max = (colSums[j] > colSums[i]) ? colSums[j] : max;
                maxLoc = (colSums[j] > colSums[i]) ? j : maxLoc;
            }
        }

        System.out.println("Column with max sum: " +maxLoc+ "\n" + "Sum: " +max);
    }
    public static void searchArray(int[] iArray){
        Scanner input = new Scanner(System.in);
        int target;
        boolean targetFound = false;
        System.out.println("Enter the value you wish to find");
        target = input.nextInt();
        for (int i = 0; i < iArray.length; i++) {
            if(iArray[i] == target){
                targetFound = true;
            }
        }
        if(targetFound){
            System.out.println("Target found at location(s): ");
            for (int i = 0; i < iArray.length; i++) {
                if(iArray[i] == target)
                System.out.println(i);
            }
        }
        else{
            System.out.println("Target not found in data");
        }
    }

    //Code isn't working for some reason
    public static void searchStringArray (String[] sArray){
        Scanner input = new Scanner(System.in);
        String target;
        boolean targetFound = false;
        System.out.println("Enter the word you wish to find");
        target = input.nextLine();
        for (int i = 0; i < sArray.length; i++) {
            if(sArray[i].equals(target)){
                targetFound = true;
            }
        }
        if(targetFound){
            System.out.println("Target found at location(s): ");
            for (int i = 0; i < sArray.length; i++) {
                if(sArray[i].equals(target))
                    System.out.println(i);
            }
        }
        else{
            System.out.println("Target not found in data");
        }
    }

    }
