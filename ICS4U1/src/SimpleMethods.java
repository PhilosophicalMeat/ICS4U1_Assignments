import java.lang.String;
import java.util.Scanner;
public class SimpleMethods {
    public static void main(String[] args) {
        //out commands
        out("I will be paid on Friday, the ");
        out(23);
        out("rd day of September.\\nI expect to be paid $");
        out(234.56);
        out(" string to cut # ");
        out(1);
        out(" string to cut # ");
        out(2);
        out(" There are no strings on me");
        
        //outln commands
        outln(6);
        outln(.667);
        outln("there areeeee noooooo striiinnngggsss ooonn mmeeeee");
        //Commands for testPrimeNumber
        testPrimeNumber(12);
        testPrimeNumber(17);
        testPrimeNumber(6);

        //boolean commands for identifying prime number (needs to be fixed)
        String sIsPrimeNumber = (isPrimeNumber(7)? "Is prime" : "Is NOT prime");
        System.out.println(sIsPrimeNumber);

        //lowest common multiple command
        System.out.println(lcm(12,8));

        //greatest common factor command
        System.out.println(gcf(6,3));

        //rounded double commanded
        System.out.println(myRound(1243.1387,2));

        //pad right string command
        System.out.println(padRString("there are no strings on me",12));

        //pad left string command
        System.out.println(padLString("all your base are", 6));
    }

    //out methods
    public static void out(int iNumberToPrint) {
        System.out.print(iNumberToPrint); //prints int
    }

    public static void out(double dNumberToPrint) {
        System.out.print(dNumberToPrint); //prints double
    }

    public static void out(String stringToPrint) {
        System.out.print(stringToPrint); //prints string
    }

    //outln methods
    public static void outln(int iNumToPrint) {
        System.out.println(iNumToPrint); //prints int on new line
    }

    public static void outln(double dNumToPrint) {
        System.out.println(dNumToPrint); //prints double on new line
    }

    public static void outln(String sLineToPrint) {
        System.out.println(sLineToPrint); //prints string on new line
    }

    //void method for identifying prime numbers
    public static void testPrimeNumber (int iNumberToTest) {
        if(iNumberToTest%2 == 0 && iNumberToTest%3 == 0){
            System.out.println(iNumberToTest+ " is prime");
        }
        else{
            System.out.println(iNumberToTest+ " is NOT a prime number");
        }
    }

    //boolean method for identifying prime numbers
    public static boolean isPrimeNumber(int iNumberToTest){
        return(iNumberToTest%2 == 0 && iNumberToTest%3 == 0);
    }
    //method for identifying lowest common multiple of two integers
    public static int lcm(int number1, int number2) {
        for (int i = 1; ; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                return i;
            }
        }
    }

    //Greatest Common Factor Method
    public static int gcf(int number1, int number2) {
        int count = 0;
        int factor = 0;
        if(Math.max(number1,number2)%Math.min(number1,number2) == 0){
            return Math.min(number1,number2);
        }
        else {
            for (int i = 1; i < Math.min(number1, number2); i++) {
                if(number1%i != 0 || number2%i !=0){
                    continue;
                }
                else if(number1%i == 0 && number2%i ==0){
                    factor = i;
                }
            }
            return factor;
        }
    }

    //rounding method
    public static double myRound(double number1, int number2){
        double roundedVal = Math.round(number1*(Math.pow(10,number2))); //multplies by desired # of decimals
        double resultVal = roundedVal/(Math.pow(10,number2));
        return resultVal;
    }

    //string pad right method
    public static String padRString (String sPhrase, int iWidth){
        for (int i = iWidth; i < sPhrase.length(); i++) {
            sPhrase.replace(sPhrase.charAt(i), 'i');
        }
        return sPhrase;
    }

    //string pad left method
    public static String padLString(String sPhrase, int iWidth){
        for (int i = 0; i < iWidth-1; i++) {
            sPhrase.replace(sPhrase.charAt(i), ' ');
        }
        return sPhrase;
    }

}