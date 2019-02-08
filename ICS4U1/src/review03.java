public class review03 {
    public static void main(String[] args) {

        //int; Array countdown function
        System.out.println("T-Minus: ");
        int[] countdown = {10,9,8,7,6,5,4,3,2,1};
        for(int count : countdown){
            System.out.println(count);
        }

        //bitwise operator
        int val = 0x000F;
        int num = 0x2222;
        System.out.println(val & num);

        //Switch Statements: Int
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
        java.util.ArrayList<String> futureWeather = new java.util.ArrayList<String>();

        int day = 8;

        switch (day) {
            case 1:  futureWeather.add("Thick clouds, temperatures drop from 20 to 5 degrees");
            case 2:  futureWeather.add("Heavy snow, temperatures drop to -7");
            case 3:  futureWeather.add("Ice Rain, temperatures drop to -15");
            case 4:  futureWeather.add("Sunny, partially cloudy, temperature increases to -5");
            case 5:  futureWeather.add("Thunder Storms, temperature increases to 2 degrees");
            case 6:  futureWeather.add("Thick Fog, humidity, temperature drop to 1 degrees");
            case 7:  futureWeather.add("Light snow, windchill, temperature drops to -5");
            case 8:  futureWeather.add("Sunny, partially cloudy, windchill, temperature drops to -8");
            case 9:  futureWeather.add("Thunder storms, windspeeds up to 50km/h, temperatures increase to 7");
            case 10: futureWeather.add("Sunny, clear skies, temperatures exceeding 35 degrees celsius (flooding imminent)");
            case 11: futureWeather.add("Sunny, clear skies, flooding on large scale due to unprecedented change in weather");
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

        //
    }
}
