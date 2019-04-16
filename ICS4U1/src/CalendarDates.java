import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.*;
public class CalendarDates{
    public static void main(String[] args) throws IOException{
        //creating scanner to collect inputted data
        Scanner input = new Scanner(System.in);
        int[] dateArray = new int[3], timeArray = new int[2]; //made it double just to be safe. might make it integer in the future
        String temp = "";
        String[] tempArrayDate= new String[3];
        String[] tempArrayTime = new String[2];
        //prompt for the date
        System.out.println("Enter the current date (year/month/day)");
        temp = input.nextLine();
        tempArrayDate = temp.split("/");
        dateArray[0] = Integer.parseInt(tempArrayDate[0]);
        dateArray[1] = Integer.parseInt(tempArrayDate[1]);
        dateArray[2] = Integer.parseInt(tempArrayDate[2]);

        //prompt for the time of day
        System.out.println("Enter the time of day (hour:minute)");
        temp = input.nextLine();
        tempArrayTime = temp.split(":");
        timeArray[0] = Integer.parseInt(tempArrayTime[0]);
        timeArray[1] = Integer.parseInt(tempArrayTime[1]);
        //testing the calendar class

    }
}
