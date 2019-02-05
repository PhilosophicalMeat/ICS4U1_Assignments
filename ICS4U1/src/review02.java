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

        System.out.println();//Spacing the outputs

        //Exercise 2
        String vocalistsArray[] = {"Beyonce (f) ", "David Bowie (m)", "Elvis Costello (m)", "Madonna (f)", "Elton John (m)",
                "Charles Aznavour (m)"};
        int vocMale = 0, vocFemale = 0;
        for (int i = 0; i < vocalistsArray.length; i++) {
            if(vocalistsArray[i].contains("(m)")){
                vocMale++;
            }
            else if(vocalistsArray[i].contains("(f)")){
                vocFemale++;
            }
        }
        System.out.println("Male Vocalists: " +vocMale);
        System.out.println("Female Vocalists: " +vocFemale);

        //Exercise 3
        String instrumentsArray[] = {"cello", "guitar", "violin", "double bass"};
        String vowelsArray[] = {"a", "e", "i", "o", "u"};
        
    }
}
