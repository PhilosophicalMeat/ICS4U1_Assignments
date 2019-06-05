import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAssignment01 {
    public static void main(String[] args) {
        //first method demonstration
        ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();
        promptForNumbersAndSort(intArrayList1);

        //second method demonstration
        ArrayList<Integer> intArrayList2 = new ArrayList<Integer>();
        promptForTextAndSort(intArrayList2);
    }
    //method for part one
    public static void promptForNumbersAndSort(ArrayList<Integer> arrayList){
        Scanner scanner = new Scanner(System.in);
        boolean proceed = true;
        while(proceed){
            System.out.println("Enter the new value in the array list");
            int listVal = scanner.nextInt();
            if(listVal == 0){
                proceed = false;
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println(arrayList.get(i));
                }
            }
            else{
                arrayList.add(listVal);
                Collections.sort(arrayList);
            }
        }
    }
    //method for part two
    public static void promptForTextAndSort(ArrayList<Integer> arrayList){
        Scanner scanner = new Scanner(System.in);
        boolean proceed = true;
        while(proceed){
            System.out.println("Enter the new value");
            String input = scanner.nextLine();
            if(input == "" || input == "STOP" || input == "stop"){
                proceed = false;
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println(arrayList.get(i));
                }
            }
            else{
                int tempVal = Integer.parseInt(input);
                arrayList.add(tempVal);
                Collections.sort(arrayList);
            }
        }
    }
}
