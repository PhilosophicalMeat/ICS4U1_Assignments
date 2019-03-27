import java.util.Random;
public class ArrayExercises {
    public static void main(String[] args) {
        //Exercise 1
        int[] integerArray = {1, 4, 6, 7, 9, 2};
        smallestDifference(integerArray);

        //Exercise 2
        int[][] exTwoArray = new int[10][10];
        fill2DArray(exTwoArray);
        maxRowSum(exTwoArray);


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
    public static void fill2DArray(int[][]dArray){
        Random rand = new Random();
        int val = rand.nextInt(100);
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray[i].length; j++) {
                dArray[i][j] = val;
                val = rand.nextInt(100);
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
}
