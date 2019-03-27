public class ArrayExercises {
    public static void main(String[] args) {
        //Exercise 1
        int[] integerArray = {1, 4, 6, 7, 9, 2};
        smallestDifference(integerArray);

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
}
