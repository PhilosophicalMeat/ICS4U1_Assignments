import java.util.Scanner;
import java.io.File;
import java.io.*;


public class InterestAssignment{
    public static void main(String[] args) throws IOException{
        String accFileOrigin = "C:\\Users\\Ethan\\Desktop\\AccountDailyBalances.txt";
        File dataFile = new File(accFileOrigin);
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
        roundDouble(interestArray);
        writeAccountInterest(interestArray,idArray);

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
        double[] minArray = new double[idArray.length];
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
            accType[i] = idArray[i].substring(7, 10);
            System.out.println(accType[i]);
        }

        for (int i = 0; i < accType.length; i++) {
            switch(accType[i]){
                case "CMI": interestArray[i] = minArray[i] * 1.005;
                case "CDI":
                    for (int j = 0; j < dValArray[i].length; j++) {
                        interestArray[i] += dValArray[i][j] * 1.0025;
                    }
                case "SMI": interestArray[i] = minArray[i] * 1.0225;
                case "SDI":
                    for (int j = 0; j < dValArray[i].length; j++) {
                        interestArray[i] += dValArray[i][j] * 1.02;
                    }
                case "STF":
                    for (int j = 0; j < dValArray[i].length; j++) {
                        interestArray[i] += dValArray[i][j] * 1.025;
                    }
            }
        }
    }
    public static void roundDouble(double[] interestArray){
        for (int i = 0; i < interestArray.length; i++) {
            interestArray[i] = (Math.round(interestArray[i]*(Math.pow(10,2))))/(Math.pow(10,2));
        }
    }

    public static void writeAccountInterest (double[] interestArray, String[] idArray) throws IOException{
        //creates the file and buffered writer for said file all at once
        PrintWriter fileWriter = new PrintWriter(new FileWriter("C:\\Users\\Ethan\\Desktop\\MonthlyAccountInterest.txt"));
        //creating and filling an array with all of the sorted information & making a string that will fill the text file
        String data = "";
        String[] sortedDataArray = new String[interestArray.length];
        for (int i = 0; i < sortedDataArray.length; i++) {
            sortedDataArray[i] = "Account #: " +idArray[i]+ "      Interest: $" +(interestArray[i]);
            fileWriter.println(sortedDataArray[i]);
        }
        fileWriter.close();
    }
}
