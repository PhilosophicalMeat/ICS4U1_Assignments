import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.*;


public class InterestAssignment{
    public static void main(String[] args) throws IOException{
        File dataFile = new File("C:\\Users\\Ethan\\Desktop\\AccountDailyBalances.txt");
        File interestFile = new File("C:\\Users\\Desktop\\MonthlyAccountInterest.txt");
        String[] interestTypes = {"CMI", "SMI", "STF", "CDI", "SDI"};
        double[] interestRates = {0.5, 0.25, 2.25, 2.0, 2.5};   //these values are percentages(ie. 0.5 = 0.5%)
        String[] data = new String[5];
        readNextAccount(data, dataFile);
        String[] idArray = new String[5];
        String[] values = new String[5];
        splitArray(data,idArray,values);
        String[][] depositsArray = new String[5][31];
        for (int i = 0; i < values.length; i++) {
            depositsArray[i] = values[i].split(",");
        }
        System.out.println(depositsArray[0][18]);
    }

    public static void readNextAccount(String[] accArray, File dataFile) throws IOException {
        Scanner fileCheck = new Scanner(dataFile);
        for (int i = 0; fileCheck.hasNext(); i++) {
            accArray[i] = fileCheck.nextLine();
        }
    }
    public static void splitArray(String[] oArray, String[] idArray, String[] values){
        for (int i = 0; i < oArray.length; i++) {
            idArray[i] = oArray[i].substring(0,10);
        }
        for (int i = 0; i < oArray.length; i++) {
            values[i] = oArray[i].substring(11);
        }
    }

    public static double calculateInterest(String[][] depositsArray, String[] idArray) throws NumberFormatException{
        double[][] dValArray = new double[depositsArray.length][depositsArray[0].length];
        for (int i = 0; i < depositsArray.length; i++) {
            for (int j = 0; j < depositsArray[i].length; j++) {
                dValArray[i][j] = Double.parseDouble(depositsArray[i][j]);
            }
        }
        //Finding min deposit for each account
        double min = 0;
        double[] minArray = new double[dValArray.length];
        for (int i = 0; i < dValArray.length; i++) {
            for (int j = 0; j < dValArray[i].length; j++) {
                for (int k = 0; k < dValArray[i].length; k++) {
                    if(dValArray[i][k] < dValArray[i][j]){
                        minArray[i] = dValArray[i][k];
                    }
                }
            }
        }
        //Calculate interest for each account using min and interest rate (find using idArray)
        double dInterest = 0;

        return dInterest;
    }

    public static void writeAccountInterest (){

    }
}
