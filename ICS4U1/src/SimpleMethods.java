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
        testPrimeNumber(9);
        
        //lowest common multiple command
        System.out.println(lcm(12,8));

        //greatest common factor command
        /*System.out.println(gcf(20,12));*/
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

    //boolean method for identifying prime numbers
    public static void testPrimeNumber (int iNumberToTest)
    {
        boolean isPrime = false;
        for(int i = 2; i <= iNumberToTest/2; ++i)
        {
            // nonprime
            if(iNumberToTest % i == 0)
            {
                isPrime = true;
                break;
            }
        }
        if (!isPrime)
            System.out.println(iNumberToTest + " is a prime number.");
        else
            System.out.println(iNumberToTest + " is not a prime number.");
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
    /*public static int gcf(int number1, int number2) {

    }*/


}