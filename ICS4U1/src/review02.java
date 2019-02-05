import java.lang.String;
import java.util.Scanner;
public class review02 {
    public static void main(String[] args) {
        //Exercise 1
        String notes = "ABCDEFG";
        for (int i = 0; i < notes.length(); i++) {
            if(notes.charAt(i) == 'C'){
                for (int j = i; j < notes.length(); j++) {
                    System.out.print(notes.charAt(j));
                    }
                for (int x = 0; x < i; x++) {
                    System.out.print(notes.charAt(x));
                }
            }
        }

        //Exercise 2
        String vocalistsArray[] = {"Beyonce (f) ", "David Bowie (m)", "Elvis Costello (m)", ""};
    }
}
