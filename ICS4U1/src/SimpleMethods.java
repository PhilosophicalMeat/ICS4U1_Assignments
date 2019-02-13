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
    //tests for prime number
    public static void testPrimeNumber(int iTestPrime){
        int pTestOne = iTestPrime % 2;
        int pTestTwo = iTestPrime % 3;
        String pResult = (pTestOne != 0 && pTestTwo != 0 && iTestPrime > 3) ? iTestPrime+" is a prime number" : iTestPrime+" is NOT a prime number";
        System.out.println(pResult);
    }
}