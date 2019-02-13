import java.lang.String;
import java.util.Scanner;
public class SimpleMethods {
    public static void main(String[] args) {
        out("I will be paid on Friday, the ");
        out(23);
        out("rd day of September.\\nI expect to be paid $");
        out(234.56);
    }
    public static void out (int iNumberToPrint){
        System.out.print(iNumberToPrint);
    }
    public static void out (double dNumberToPrint){
        System.out.print(dNumberToPrint);
    }
    public static void out (String stringToPrint){
        System.out.print(stringToPrint);
    }
}
