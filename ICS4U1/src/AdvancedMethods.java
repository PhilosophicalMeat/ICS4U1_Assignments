import java.util.Scanner;
import java.lang.String;
public class AdvancedMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iAge;

        System.out.println("Enter your age in years");
        iAge = input.nextInt();

        //age range integer method call
        double dMoviePrice = (inRange(iAge, 14,64)) ? 10.50 : 7.99;
        System.out.println("Price: $" +dMoviePrice);

    }
    //age range int method
    public static boolean inRange(int iValue, int min, int max){
        return (iValue>min && iValue<max);
    }
    //age range double method
    public static boolean inRange(double dValue, int min, int max){
        return(dValue>min && dValue<max);
    }



}
