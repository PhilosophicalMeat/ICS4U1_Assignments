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
        String[] sPrev = {""};
        for (int i = 0; i < sDataOrigin.length; i++) {
            destLength += (sDataOrigin[i][0].equals("101")) ? 1:0;
        }
        String[][] sDataDestination = new String[destLength][destCol];
        String[] destYear = new String[destLength], destMonth = new String[destLength], destDay = new String[destLength];
        String[] destProduct = new String[destLength];
        int sDataPos = 0;
        for (int i = 0; i < sDataOrigin.length; i++) {
            /*System.out.print(sDataOrigin[i][0]);
            if(sDataOrigin[i][0].equals("101")){
                System.out.println(" Location Tagged");
            }
            else{
                System.out.println();
            }*/
            if(sDataOrigin[i][0].equals("101") && sDataOrigin[i] != sPrev){
                for (int j = 0; j < sDataOrigin[i].length; j++) {
                    //Adding the value to its array
                    sDataDestination[sDataPos][j] = sDataOrigin[i][j];
                    //dividing the dates into years, months, and days
                    destYear[sDataPos] = sDataOrigin[i][1].substring(0,4);
                    destMonth[sDataPos] = sDataOrigin[i][1].substring(4,6);
                    destDay[sDataPos] = sDataOrigin[i][1].substring(6,8);
                    //determining the product sold at the specified store


                    System.out.print(sDataDestination[sDataPos][j]+ "   ");
                }
                System.out.println();
                sDataPos+=1;
            }
        }
    }
}
