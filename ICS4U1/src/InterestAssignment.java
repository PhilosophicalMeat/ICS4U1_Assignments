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
        String[][] balanceArray = new String[5][31];
        double[] interestArray = new double[5];
        for (int i = 0; i < values.length; i++) {
            balanceArray[i] = values[i].split(",");
        }
        calculateInterest(balanceArray,idArray,interestArray);
        
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

    public static void calculateInterest(String[][] balanceArray, String[] idArray, double[] interestArray) throws NumberFormatException{
        double[][] dValArray = new double[balanceArray.length][balanceArray[0].length];
        for (int i = 0; i < balanceArray.length; i++) {
            for (int j = 0; j < balanceArray[i].length; j++) {
                dValArray[i][j] = Double.parseDouble(balanceArray[i][j]);
            }
        }
        //Finding min balance for each account
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
        String[] accType = new String[idArray.length];
        //formula: A = P(1+r/n)^nt
        double dailyInterest = 0;
        for (int i = 0; i < minArray.length; i++) {
            accType[i] = idArray[i].substring(8,10);
            if (accType[i] == "CMI") interestArray[i] = minArray[i]*(1.005);
            else if(accType[i] == "SMI") interestArray[i] = minArray[i]*(1.0225);
            else if(accType[i] == "CDI"){
                for (int j = 0; j < dValArray[i].length; j++) {
                    dailyInterest = dValArray[i][j]*(1.0025);
                    interestArray[i] += dailyInterest;
                }
            }
            else if(accType[i] == "SDI"){
                for (int j = 0; j < dValArray[i].length; j++) {
                    dailyInterest = dValArray[i][j]*(1.02);
                    interestArray[i] += dailyInterest;
                }
            }
            else if(accType[i] == "STF"){
                for (int j = 0; j < dValArray[i].length; j++) {
                    dailyInterest = dValArray[i][j]*(1.025);
                    interestArray[i] += dailyInterest;
                }
            }
        }
    }

    public static void writeAccountInterest (){

    }
}
