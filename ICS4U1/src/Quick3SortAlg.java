public class Quick3SortAlg {
    public static void main(String[] args) {
        int[] valArray = {3, 7, 4, 6, 9, 0, 1, 8, 4, 5};
        //calling the quick3Sort method
        quick3Sort(valArray);
    }
    //quick3Sort method
    public static void quick3Sort(int[] iArray){
        //selecting the 2 pivot points
        int tempVal = 0, lowBoundLoc = 0, upBoundLoc = iArray.length-1,
        lowBound = iArray[lowBoundLoc], upBound = iArray[upBoundLoc] ;
        for (int i = 0; i < iArray.length; i++) {
            if(iArray[i] < lowBound && i!= lowBoundLoc){
                tempVal = iArray[i];
                iArray[i] = lowBound;
                iArray[lowBoundLoc] = tempVal;
                lowBoundLoc = i;
            }
            else if(iArray[i] > upBound && i!= upBoundLoc){
                tempVal = iArray[i];
                iArray[i] = upBound;
                iArray[upBoundLoc] = tempVal;
                upBoundLoc = i;
            }
            System.out.println(iArray[i]);
        }
    }
}
