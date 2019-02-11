import java.util.Scanner;
import java.lang.String;
public class MethodExample2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Main Program
        // Invoke the RepeatPhase for different Strings
        RepeatPhrase("Howdy", 1);
        RepeatPhrase("There", 2);
        RepeatPhrase("Padner", 3);

        System.out.println("--------------------");
        for (int iLoop = 1; iLoop <= 12; iLoop++)
            System.out.println((Random1To6()));

        System.out.println("--------------------");
        for (int iLoop = 1; iLoop <= 20 ; iLoop++)
            System.out.println(Random1To52());

        System.out.println("--------------------");
        for (int iLoop = 1; iLoop <= 20 ; iLoop++)
            System.out.println(RandomRange(13,22));

        if (PromptYN("Should I Continue?"))
            System.out.println("Yes You Should!");
        else
            System.out.println("No You Should NOT!");
    }
    //This method will Print a String on the Console a user designated number of ptimes
    public static void RepeatPhrase (String sPhrase,int iCount){
        while(iCount-- > 0){
            System.out.println(sPhrase);
        }
    }

    //Method that will produce a Random number from 1 to 6
    public static int Random1To6(){
        int iRandom;
        iRandom = (int) (Math.random() * 6 + 1);
        return iRandom;
    }

    //Method will produce a Random number from 1 to 52
    public static int Random1To52(){
        return (int) (Math.random() * 52 + 1);
    }

    //Method will produce a Random number for a range specified by the user
    public static int RandomRange(int iLow, int iHigh){
        return(int) (Math.random() * (iHigh - iLow + 1) + iLow);
    }
}
