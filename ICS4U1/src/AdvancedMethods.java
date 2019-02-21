import java.util.Scanner;
import java.lang.String;
public class AdvancedMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dAge;
        //age double (decimal value) input
        System.out.println("Enter your age in years");
        dAge = input.nextInt();

        //movie price age range method
        double dMoviePrice = (inRange(dAge,14,64)) ? 10.50 : 7.99;
        System.out.println("Movie Price: $" +dMoviePrice);

        //command for legal drinking
        String canDrink = (inRange(dAge,0,19)) ? "Can't drink" : "Can drink";
        System.out.println(canDrink);

        //command for age to vote
        String canVote = (inRange(dAge, 0,18)) ? "Can't vote" : "Can vote";
        System.out.println(canVote);

        //command for joining army
        String canJoinArmy = (inRange(dAge, 0 ,15)) ? "Can't join the army" : "Can join the army";
        System.out.println(canJoinArmy);

        //command for licence in alberta
        String canGetLicence = (inRange(dAge, 0, 15)) ? "Can't drive" : "Can Drive";
        System.out.println(canGetLicence);

        //command for being home alone
        String canStayHomeAlone = (inRange(dAge,0,15)) ? "Can't stay home alone" : "Can stay home alone";
        System.out.println(canStayHomeAlone);



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
}
