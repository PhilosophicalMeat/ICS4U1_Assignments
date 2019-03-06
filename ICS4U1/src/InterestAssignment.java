import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class InterestAssignment {
    public static void main(String[] args) {
        String fileAddress = "Desktop\\Project01Data(1)";
        String[] dataArray = new String[5];

    }
    public static File openFile(String address){
        File tempFile = new File(address);
        return tempFile;

    }
    public static void fillArray(Scanner fileCheck, String[] array){
        int i = 0;
        while(fileCheck.hasNext()){
            array[i] = fileCheck.nextLine();
            i++;
        }
    }

}
