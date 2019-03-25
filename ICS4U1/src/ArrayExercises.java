public class ArrayExercises {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 6, 7, 9, 2};
        smallestDifference(intArray);

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
        System.out.println(min);
        //Find second smallest value
        int minTwo = intArray[1];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                minTwo = (intArray[j] < intArray[i] && intArray[j] > min) ? intArray[j] : minTwo;
            }
        }
        System.out.println(minTwo);
    }
}
