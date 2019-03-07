import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.*;
public class InterestAssignmentTEST {
    public static void main(String[] args) throws IOException{
        File dataFile = new File("C:\\Users\\Ethan\\Desktop\\Project01Data (1)");
        Scanner fileCheck = new Scanner(dataFile);


    }
    public static ArrayList<String> sArray = new ArrayList();

    public static void fillArray(Scanner fileCheck){
        while(fileCheck.hasNext()){
            sArray.add(fileCheck.nextLine());
        }
    }

    public static void parse() {
        for (int i = 0; i < sArray.size(); i++) {
            String[] dataArray;
            dataArray = sArray.get(i).split(",");
            int dataParse = Integer.parseInt(dataArray[0]);
            String dString = dataArray[1];
            Double[] dArray = new Double[dataArray.length];
            for (int j = 0; j < dataArray.length - 2; j++) {
                dArray[i] = Double.parseDouble(dataArray[i + 2]);
                System.out.println(dArray[j]);
            }
        }
    }

}
