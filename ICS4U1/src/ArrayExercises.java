public class ArrayExercises {
    public static void main(String[] args) {
        //Exercise 1
        int[] integerArray = {1, 4, 6, 7, 9, 2};
        smallestDifference(integerArray);

        //Exercise 2
        double[][] exTwoArray = new double[10][10];
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
    public static void fill2DArray(double[][]dArray){
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray[i].length; j++) {
                dArray[i][j] = Math.random();
            }
        }
    }
    public static void maxRowSum(double[][] dArray){
        double[] rowSums = new double[dArray.length];
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray[i].length; j++) {
                rowSums[i] += dArray[i][j];
            }
        }
        double max = 0;
        int maxLoc = 0;
        for (int i = 0; i < rowSums.length; i++) {
            for (int j = 0; j < rowSums.length; j++) {
                max = (rowSums[j] > rowSums[i]) ? rowSums[j] : max;
                maxLoc = (rowSums[j] > rowSums[i]) ? j : maxLoc;
            }
        }
        double roundedVal = Math.round(max*(Math.pow(10,2))); //multplies by desired # of decimals
        double resultVal = roundedVal/(Math.pow(10,2));
        System.out.println("Row with max sum: " +maxLoc+ "\n" + "Sum: " +resultVal);
    }
}
