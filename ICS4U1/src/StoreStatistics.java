import java.io.*;
import java.util.Scanner;
public class StoreStatistics {
    public static void main(String[] args) throws IOException{
        File storeData = new File("C:\\Users\\Ethan\\Desktop\\Project02Data (1).txt");
        Scanner fileChecker = new Scanner(storeData);
        String[][] sDataArraySorted = new String[17113][4];
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
        String[] year = new String[17113], month = new String[17113], day = new String[17113];
        for (int i = 0; i < sDataArraySorted.length; i++) {

        }


    }

    public static void fillString2DArray(Scanner fileChecker, String[][] sDataArray){
        for (int i = 0; fileChecker.hasNext(); i++) {
            sDataArray[i] = fileChecker.nextLine().split(",");
        }
    }

}
