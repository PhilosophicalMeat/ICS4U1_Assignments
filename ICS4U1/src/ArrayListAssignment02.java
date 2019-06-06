import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAssignment02 {
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
                //printing array list with only unique values
                System.out.println("Unqiue Values");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.print(arrayList.get(i) + " ");
                }
                //printing array list with all inputted values
                System.out.println();
                System.out.println("All Values");
                for (int i = 0; i < numCountArrayList.size(); i++) {
                    System.out.print(numCountArrayList.get(i) + " ");
                }
                System.out.println();
                //counting and printing the number of copies of each unique value in the array with all inputted values
                System.out.println("Number Of Copies");
                for (int i = 0; i < arrayList.size(); i++) {
                    int x = 0;
                    for (int j = 0; j < numCountArrayList.size(); j++) {
                        if(arrayList.get(i).equals(numCountArrayList.get(j))){
                            x += 1;
                        }
                    }
                    System.out.println(x + " copie(s) of " +arrayList.get(i));
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
                    System.out.println("Notice: Value already in use. Adding to second array.");
                    numCountArrayList.add(listVal);
                    Collections.sort(numCountArrayList);
                }
            }
        }
    }
}
