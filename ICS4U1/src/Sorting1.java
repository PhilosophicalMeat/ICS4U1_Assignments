public class Sorting1 {
    public static void main(String[] args) {
        int[] iArray = {45, 22, 2, 33, 13, 48, 7, 19, 20, 39};
        //after creating the method, I removed the work done initially to reduce the clutter (both in the code and in the prompt)
        //calling tenIntegerSwap method
        tenIntegerSwap(iArray);
        //calling tenIntegerSwap2 method
        tenIntegerSwap2(iArray);
        //calling tenIntegerShiftUpOne method
        tenIntegerShiftUpOne(iArray);
        //calling tenIntegerShiftDownOne method
        tenIntegerShiftDownOne(iArray);
    }
    //tenIntegerSwap method
    public static void tenIntegerSwap(int[] iArray){
        int[] tempArray = {iArray[0], iArray[1], iArray[2], iArray[3], iArray[4], iArray[5], iArray[6], iArray[7], iArray[8],
                iArray[9]};
        //the part that matters
        iArray[0] = tempArray[1];
        iArray[1] = tempArray[0];
        iArray[2] = tempArray[3];
        iArray[3] = tempArray[2];
        iArray[4] = tempArray[5];
        iArray[5] = tempArray[4];
        iArray[6] = tempArray[7];
        iArray[7] = tempArray[6];
        iArray[8] = tempArray[9];
        iArray[9] = tempArray[8];
        //printing it the way I was asked too
        System.out.print("Elements: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(i+ "    ");
        }
        System.out.println();
        System.out.print("Original: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(tempArray[i]+ "   ");
        }
        System.out.println();
        System.out.print("Changed:  ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i]+ "   ");
        }
        System.out.println();
    }
    //tenIntegerSwap2 method
    public static void tenIntegerSwap2(int[] iArray){
        //switching the values using the original method
        tenIntegerSwap(iArray);
        int[] tempArray = {iArray[0], iArray[1], iArray[2], iArray[3], iArray[4], iArray[5], iArray[6], iArray[7], iArray[8],
                iArray[9]};
        iArray[0] = tempArray[9];
        iArray[1] = tempArray[8];
        iArray[2] = tempArray[7];
        iArray[3] = tempArray[6];
        iArray[4] = tempArray[5];
        iArray[5] = tempArray[4];
        iArray[6] = tempArray[3];
        iArray[7] = tempArray[2];
        iArray[8] = tempArray[1];
        iArray[9] = tempArray[0];
        System.out.print("Elements: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(i+ "    ");
        }
        System.out.println();
        System.out.print("Original: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(tempArray[i]+ "   ");
        }
        System.out.println();
        System.out.print("Changed:  ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i]+ "   ");
        }
        System.out.println();
    }
    //tenIntegerShiftUpOne method
    public static void tenIntegerShiftUpOne(int[] iArray){
        int[] tempArray = {iArray[0], iArray[1], iArray[2], iArray[3], iArray[4], iArray[5], iArray[6], iArray[7], iArray[8],
                iArray[9]};
        //the part that matters
        iArray[0] = tempArray[1];
        iArray[1] = tempArray[2];
        iArray[2] = tempArray[3];
        iArray[3] = tempArray[4];
        iArray[4] = tempArray[5];
        iArray[5] = tempArray[6];
        iArray[6] = tempArray[7];
        iArray[7] = tempArray[8];
        iArray[8] = tempArray[9];
        iArray[9] = tempArray[0];

        //printing it the way I was asked too
        System.out.print("Elements: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(i+ "    ");
        }
        System.out.println();
        System.out.print("Original: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(tempArray[i]+ "   ");
        }
        System.out.println();
        System.out.print("Changed:  ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i]+ "   ");
        }
        System.out.println();
    }
    //tenIntegerShiftDownOne method
    public static void tenIntegerShiftDownOne(int[] iArray){
        int[] tempArray = {iArray[0], iArray[1], iArray[2], iArray[3], iArray[4], iArray[5], iArray[6], iArray[7], iArray[8],
                iArray[9]};
        //the part that matters
        iArray[0] = tempArray[9];
        iArray[1] = tempArray[0];
        iArray[2] = tempArray[1];
        iArray[3] = tempArray[2];
        iArray[4] = tempArray[3];
        iArray[5] = tempArray[4];
        iArray[6] = tempArray[5];
        iArray[7] = tempArray[6];
        iArray[8] = tempArray[7];
        iArray[9] = tempArray[8];

        //printing it the way I was asked too
        System.out.print("Elements: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(i+ "    ");
        }
        System.out.println();
        System.out.print("Original: ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(tempArray[i]+ "   ");
        }
        System.out.println();
        System.out.print("Changed:  ");
        for (int i = 0; i < iArray.length; i++) {
            System.out.print(iArray[i]+ "   ");
        }
        System.out.println();
    }
}
