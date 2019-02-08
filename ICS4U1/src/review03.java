import java.lang.String;
import java.util.Scanner;
public class review03 {
    public static void main(String[] args) {

        //int; Array countdown function
        System.out.println("T-Minus: ");
        int[] countdown = {10,9,8,7,6,5,4,3,2,1};
        for(int count : countdown){
            System.out.println(count);
        }

        //bitwise: XOR operator
        System.out.println("Bitwise: XOR Operation Loop");
        boolean x = true, y = false;
        boolean xOrY = x ^ y;
        for (int i = 0; i < 10; i++) {
            System.out.println("True XOR False" + xOrY);
        }

        //Switch Statements: Int
        System.out.println("Switch Statements: Int");
        int printVal = 0;
        String printString;
        switch(printVal){
            case 0: System.out.println("zero");
            case 1: System.out.println("one");
            case 2: System.out.println("two");
            case 3: System.out.println("three");
            case 4: System.out.println("four");
            case 5: System.out.println("five");
            case 6: System.out.println("six");
            case 7: System.out.println("seven");
            case 8: System.out.println("eight");
            case 9: System.out.println("nine");
            case 10: System.out.println("ten");
            case 11: System.out.println("eleven");
            case 12: System.out.println("twelve");
            case 13: System.out.println("thirteen");
            case 14: System.out.println("fourteen");
            case 15: System.out.println("fifteen");
        }

        //Switch Statements: String
        System.out.println("Switch Statements: String");
        java.util.ArrayList<String> futureWeather = new java.util.ArrayList<String>();
        int day = 8;
        switch (day) {
            case 1:  futureWeather.add("Thick clouds, temperatures drop from 20 to 5 degrees");
                System.out.println();
            case 2:  futureWeather.add("Heavy snow, temperatures drop to -7");
                System.out.println();
            case 3:  futureWeather.add("Ice Rain, temperatures drop to -15");
                System.out.println();
            case 4:  futureWeather.add("Sunny, partially cloudy, temperature increases to -5");
                System.out.println();
            case 5:  futureWeather.add("Thunder Storms, temperature increases to 2 degrees");
                System.out.println();
            case 6:  futureWeather.add("Thick Fog, humidity, temperature drop to 1 degrees");
                System.out.println();
            case 7:  futureWeather.add("Light snow, windchill, temperature drops to -5");
                System.out.println();
            case 8:  futureWeather.add("Sunny, partially cloudy, windchill, temperature drops to -8");
                System.out.println();
            case 9:  futureWeather.add("Thunder storms, windspeeds up to 50km/h, temperatures increase to 7");
                System.out.println();
            case 10: futureWeather.add("Sunny, clear skies, temperatures exceeding 35 degrees celsius (flooding imminent)");
                System.out.println();
            case 11: futureWeather.add("Sunny, clear skies, flooding on large scale due to unprecedented change in weather");
                System.out.println();
            case 12: futureWeather.add("Sunny, clear skies, temperatures exceeding 60 degrees celsius");
                break;
            default: break;
        }

        if (futureWeather.isEmpty()) {
            System.out.println("Invalid date");
        } else {
            for (String date : futureWeather) {
                System.out.println(date);
            }
        }

        //Break & Continue Statements: Int
        System.out.println("Break & Continue Statments: Int");
        Scanner scanner = new Scanner(System.in);
        int target;
        int[] valueArray = new int[10];
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter value #" +(i+1));
            valueArray[i] = scanner.nextInt();
        }
        System.out.println("Enter Target Value");
        target = scanner.nextInt();
        for (int j = 0; j < valueArray.length; j++) {
            if(valueArray[j] == target){
                System.out.println("Target Confirmed: Value #" +(j+1));
                break;
            }
            else if(j == valueArray.length && valueArray[j] != target){
                System.out.println("Target not located amongst data.");
            }
        }

        //Break & Continue Statements: String
        System.out.println("Break & Continue Statements: String (Target: 'p')");
        String range = "Peter Piper picked a peck of pickled peppers.\n" +
                "A peck of pickled peppers Peter Piper picked.\n" +
                "If Peter Piper picked a peck of pickled peppers,\n" +
                "Where's the peck of pickled peppers Peter Piper picked?";
        char locate = 'i';
        System.out.println(range);
        for (int i = 0; i < range.length(); i++) {
            if (range.charAt(i) == locate) {
                System.out.println("Target Found: Character #" + (i + 1));
                break;
            }
            else if(i == range.length() && range.charAt(i) != locate){
                System.out.println("Target not in range.");
            }
        }

        //


    }
}
