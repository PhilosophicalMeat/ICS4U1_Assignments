import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.*;

public class InterestAssignment{
    public static void main(String[] args) throws IOException{
        String fileAddress = "C:\\Users\\Ethan\\Desktop\\Project01Data(1)";
        String[] dataArray = new String[5];
        //Creating file
        File dataFile = openFile(fileAddress);
        //storing file in String array (row-by-row)
        fillArray(dataFile,dataArray);
    }
    public static File openFile(String address){
        File tempFile = new File(address);
        return tempFile;
    }
    public static void fillArray(File tempFile, String[] array) throws IOException{
        int i = 0;
        Scanner fileCheck = new Scanner(tempFile);
        while(fileCheck.hasNext()){
            array[i] = fileCheck.nextLine();
            i++;
        }
    }

}
