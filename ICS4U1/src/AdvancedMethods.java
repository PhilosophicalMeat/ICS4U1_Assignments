import java.util.Scanner;
import java.lang.String;
public class AdvancedMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iAge;
        double dAge;
        String sAge;
        //age double (decimal value) input
        System.out.println("Enter your age in years");
        sAge = input.nextLine();
        if(parseIt)


        /*//age range integer method call
        double iMoviePrice = (inRange(iAge, 14,64)) ? 10.50 : 7.99;
        System.out.println("Price: $" +iMoviePrice);

        //age double input
        double dAge;
        System.out.println("Enter your age in years (estimate to the nearest tenth)");
        dAge = input.nextDouble();
        double dMoviePrice = (inRange(dAge,14,64)) ? 10.50 : 7.99;*/



    }
    //age range int method
    public static boolean inRange(int iValue, int min, int max){
        return (iValue>min && iValue<max);
    }
    //age range double floating point decimal value method
    public static boolean inRange(double dValue, int min, int max){
        return (dValue>min && dValue<max);
    }
    //age range short int method
    public static boolean inRange(short shrtValue, int min, int max){
        return (shrtValue > min && shrtValue < max);
    }
    //age range byte int method
    public static boolean inRange(byte bValue, int min, int max){
        return (bValue > min && bValue < max);
    }
    //age range long int method
    public static boolean inRange(long lValue, int min, int max){
        return (lValue > min && lValue < max);
    }
    //age range floating point decimal value method
    public static boolean inRange(float fValue, int min, int max){
        return (fValue > min && fValue < max);
    }
    //TEST: parse int method

}
