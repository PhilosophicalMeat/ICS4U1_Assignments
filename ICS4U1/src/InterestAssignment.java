import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class InterestAssignment{
    private static ArrayList <String> arrayList = new ArrayList();
    private static void main(String[] args) throws IOException{
        String fileAddress = "C:\\Users\\Ethan\\Desktop\\Project01Data(1)";
        String[] dataArray = new String[5];
        //Creating file
        File dataFile = openFile(fileAddress);
        //storing file in String array (row-by-row)
        fillArray(dataFile,dataArray);
    }
    private static File openFile(String address){
        File tempFile = new File(address);
        return tempFile;
    }
    private static void fillArray(File tempFile, String[] array) throws IOException{
        int i = 0;
        Scanner fileCheck = new Scanner(tempFile);
        while(fileCheck.hasNext()){
            arrayList.add(fileCheck.nextLine());//
            i++;
        }
    }
    private static void parseLine() {
        for (int i = 0; i < arrayList.size(); i++) {
            String[] dataArray;
            dataArray = arrayList.get(i).split(",");
            int dataParse = Integer.parseInt(dataArray[0]);
            String dString = dataArray[1];
            Double[] dArray = new Double[dataArray.length];
            for (int j = 0; j < dataArray.length-2; j++) {
                dArray[i] = Double.parseDouble(dataArray[i+2]);
            }
        }
    }

}
