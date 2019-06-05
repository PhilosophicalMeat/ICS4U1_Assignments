import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListAssignment03 {
    public static void main(String[] args) {
//first method demonstration
        ArrayList<Integer> intArrayList1 = new ArrayList<Integer>(), intCountArrayList1 = new ArrayList<Integer>();
        promptForUniqueNumbersAndSort(intArrayList1, intCountArrayList1);
    }
    //method for part one
    public static void promptForUniqueNumbersAndSort(ArrayList<Integer> arrayList, ArrayList<Integer> numCountArrayList){
        Scanner scanner = new Scanner(System.in);
        boolean proceed = true;
        //process for sorting the unique values
        while(proceed){
            System.out.println("Enter the new value in the array list");
            int listVal = scanner.nextInt();
            if(listVal == 0){
                proceed = false;
                //printing array list with all inputted values
                System.out.println("All Values");
                for (int i = 0; i < numCountArrayList.size(); i++) {
                    System.out.print(numCountArrayList.get(i) + " ");
                }
                //printing array list with only unique values
                System.out.println();
                System.out.println("Unique Values");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.print(arrayList.get(i) + " ");
                }
            }
            else{
                boolean addVal = true;
                for (int i = 0; i < arrayList.size(); i++) {
                    if(arrayList.get(i) == listVal){
                        addVal = false;
                    }
                }
                if(addVal){
                    arrayList.add(listVal);
                    Collections.sort(arrayList);
                    numCountArrayList.add(listVal);
                    Collections.sort(numCountArrayList);
                }
                else{
                    numCountArrayList.add(listVal);
                    Collections.sort(numCountArrayList);
                }
            }
        }
    }
}
