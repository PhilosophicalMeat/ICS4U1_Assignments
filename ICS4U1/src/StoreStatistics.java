import java.io.*;
import java.util.Scanner;
import java.lang.String;
public class StoreStatistics {
    public static void main(String[] args) throws IOException{
        File storeData = new File("C:\\Users\\Ethan\\Desktop\\Project02Data (1).txt");
        Scanner fileChecker = new Scanner(storeData);
        String[][] sDataArraySorted = new String[17095][4];
        //Store each line of data into a 2D array
        FillString2DArray(fileChecker, sDataArraySorted);
        //Create an array to identify store locations based on their three-digit ID
        String[][] StoreList = {
                {"101", "St.John's, Newfoundland"},
                {"102", "Halifax, Nova Scotia"},
                {"103", "Fredericton, New Brunswick"},
                {"201", "Quebec City, Quebec"},
                {"202", "Montreal, Quebec"},
                {"301", "Ottawa, Ontario"},
                {"302", "Toronto, Ontario"},
                {"303", "Mississauga, Ontario"},
                {"304", "Hamilton, Ontario"},
                {"305", "Kitchener, Ontario"},
                {"401", "Winnipeg, Manitoba"},
                {"402", "Regina, Saskatchewan"},
                {"403", "Calgary, Alberta"},
                {"404", "Edmonton, Alberta"},
                {"405", "Vancouver, British Columbia"}
        };
        String[][] ProductList = {
                {"PR121", "Metal Pipe"},
                {"PR122", "SWS Pipe"},
                {"PR123", "Corr. Metal Pipe"},
                {"PR231", "Tunnel Liner Plate"},
                {"PR331", "Conc. Arch Systems"},
                {"PR441", "Gates"},
                {"PR511", "Poly. Pipe"},
                {"PR512", "Poly. Chloride Pipe"},
                {"PR513", "R.C.P."},
                {"PR661", "Beaver Control"},
                {"PR701", "End Treatments"},
                {"PR811", "Culvert Liner"}
        };
        String[] MonthList = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec","Total","%"};
        //Sorted store locations

        PrintStoreDataSorted(sDataArraySorted, ProductList, MonthList, "101");

        //Sorting the dates into seperate arrays by day, month, and year. Also sorting based on store loc
        /*String[] year = new String[17095], month = new String[17095], day = new String[17095];
        for (int i = 0; i < 17095; i++) {
            year[i] = sDataArraySorted[i][1].substring(0,4);
            month[i] = sDataArraySorted[i][1].substring(4,6);
            day[i] = sDataArraySorted[i][1].substring(6,8);*/
/*
            System.out.println("Year #" +i+ ": " +year[i]+ "     Month #" +i+ ": " +month[i]+ "     Day #" +i+ ": " +day[i]);
*/
    }

    public static void FillString2DArray(Scanner fileChecker, String[][] sDataArray){
        for (int i = 0; fileChecker.hasNext(); i++) {
            sDataArray[i] = fileChecker.nextLine().split(",");
        }
    }

    public static void PrintStoreDataSorted(String[][]sDataOrigin, String[][] sProductList, String[] sMonthList, String storeID){
        int destLength = 0;
        int destCol = sDataOrigin[0].length;
        for (int i = 0; i < sDataOrigin.length; i++) {
            destLength += (sDataOrigin[i][0].equals(storeID)) ? 1:0;
        }
        String[][] sDataDestination = new String[destLength][destCol];
        double[][] sDataPrintDestination = new double[12][12]; //12 types of products, 12 months in a year
        String[] destProduct = new String[destLength];
        int[] destMonth = new int[destLength];
        double[] destPrice = new double[destLength];
        int sDataPos = 0;
        for (int i = 0; i < sDataOrigin.length; i++) {
            if(sDataOrigin[i][0].equals(storeID)){
                System.out.println("Value #" +i);
                destMonth[sDataPos] = Integer.parseInt(sDataOrigin[i][1].substring(4,6)); //the only necessary value in the date
                destProduct[sDataPos] = sDataOrigin[i][2];
                destPrice[sDataPos] = Double.parseDouble(sDataOrigin[i][3]);
                for (int j = 0; j < destCol; j++) {
                    sDataDestination[sDataPos][j] = sDataOrigin[i][j];
                }
                System.out.println(destMonth[sDataPos]+ "   " +destProduct[sDataPos]+ "     " +destPrice[sDataPos]);

                sDataPos+=1;
            }
        }
        //sending the necessary data into an array that will be sorted usings the previously created values & arrays, then print it in a table format
        for (int i = 0; i < destLength; i++) {
            switch(destProduct[i]){
                //values for each month need to be added together and printed
                case "PR121" : sDataPrintDestination[0][destMonth[i]-1] += destPrice[i];
                case "PR122" : sDataPrintDestination[1][destMonth[i]-1] += destPrice[i];
                case "PR123" : sDataPrintDestination[2][destMonth[i]-1] += destPrice[i];
                case "PR231" : sDataPrintDestination[3][destMonth[i]-1] += destPrice[i];
                case "PR331" : sDataPrintDestination[4][destMonth[i]-1] += destPrice[i];
                case "PR441" : sDataPrintDestination[5][destMonth[i]-1] += destPrice[i];
                case "PR511" : sDataPrintDestination[6][destMonth[i]-1] += destPrice[i];
                case "PR512" : sDataPrintDestination[7][destMonth[i]-1] += destPrice[i];
                case "PR513" : sDataPrintDestination[8][destMonth[i]-1] += destPrice[i];
                case "PR661" : sDataPrintDestination[9][destMonth[i]-1] += destPrice[i];
                case "PR701" : sDataPrintDestination[10][destMonth[i]-1] += destPrice[i];
                case "PR811" : sDataPrintDestination[11][destMonth[i]-1] += destPrice[i];
            }
        }
        //I'm getting close, I just need to figure out how to control the spacing based on the size of the values. Maybe I could have a set number
        //of character permitted for each row, and then fill the rest of the space with blanks? The way I see it, I'd have to convert the doubles
        //back into Strings... I can make it work
        System.out.print("------------------- ");
        for (int i = 0; i < sMonthList.length; i++) {
            while (sMonthList[i].length() < 10) {
                sMonthList[i] += " ";
            }
            System.out.print(sMonthList[i]);
        }
        double[] sumArray = new double[sProductList.length];
        String[] sSumArray = new String[sProductList.length];
        for (int i = 0; i < 12; i++) {
            while(sProductList[i][1].length() < 20){ //These have to more than a little longer
                sProductList[i][1] += " ";
            }
            System.out.print(sProductList[i][1]);
            for (int j = 0; j < 12; j++) {
                sumArray[i] += sDataPrintDestination[j][i];
                sumArray[i] *= 100;
                sumArray[i] = Math.round(sumArray[i]);
                sumArray[i] /= 100;
                sSumArray[i] = Double.toString(sumArray[i]);
                sDataPrintDestination[j][i] *= 100;
                sDataPrintDestination[j][i] = Math.round(sDataPrintDestination[j][i]);
                sDataPrintDestination[j][i] /= 100;
                String sPrint = Double.toString(sDataPrintDestination[j][i]);
                while (sPrint.length() < 10) {
                    sPrint += " ";
                }
                System.out.print(sPrint);
            }
            while(sSumArray[i].length() < 12){
                sSumArray[i] += " ";
            }
            System.out.print(sSumArray);
            System.out.println();
        }
    }
}
