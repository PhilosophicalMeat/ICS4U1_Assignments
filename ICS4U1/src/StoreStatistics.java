import java.io.*;
import java.util.Scanner;
public class StoreStatistics {
    public static void main(String[] args) throws IOException{
        File storeData = new File("C:\\Users\\Ethan\\Desktop\\Project02Data (1).txt");
        Scanner fileChecker = new Scanner(storeData);
        String[][] sDataArraySorted = new String[17095][4];
        //Store each line of data into a 2D array
        fillString2DArray(fileChecker, sDataArraySorted);
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
        //Sorting the dates into seperate arrays by day, month, and year. Also sorting based on store loc
        String[] year = new String[17095], month = new String[17095], day = new String[17095];
        for (int i = 0; i < 17095; i++) {
            year[i] = sDataArraySorted[i][1].substring(0,4);
            month[i] = sDataArraySorted[i][1].substring(4,6);
            day[i] = sDataArraySorted[i][1].substring(6,8);
/*
            System.out.println("Year #" +i+ ": " +year[i]+ "     Month #" +i+ ": " +month[i]+ "     Day #" +i+ ": " +day[i]);
*/
        }
        //unfinished code for sorting 101 stores into an array
        String[][] sJohnStoreLocs = new String[17095][4]; //locations of stores in st.johns, newfoundland
        String tempData = "", data = "";
        for (int i = 0; i < 17095; i++) {
            for (int j = i; j < 17095; j++) {
                if(sDataArraySorted[j][0] == "101" && j>i){
                    sJohnStoreLocs[i] = sDataArraySorted[i];
                    i = j;
                }
            }
        }

        //Test: Print the formatted data for stores with ID 101



    }

    public static void fillString2DArray(Scanner fileChecker, String[][] sDataArray){
        for (int i = 0; fileChecker.hasNext(); i++) {
            sDataArray[i] = fileChecker.nextLine().split(",");
        }
    }

}
