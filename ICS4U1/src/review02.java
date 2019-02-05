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
        String vowelReplace[] = new String[instrumentsArray.length];
        for (int i = 0; i < instrumentsArray.length; i++) {
            vowelReplace[i] = instrumentsArray[i];
            for (int j = 0; j < vowelsArray.length; j++) {
                vowelReplace[i] = vowelReplace[i].replace(vowelsArray[j], "");
            }
            System.out.println(vowelReplace[i]);
        }

        //Exercise 4
        int[] numArray = new int[1000];
        int data = 1;
        int remainder;
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = data;
            data++;
        }
        for (int j = 0; j < numArray.length; j++) {
            remainder = numArray[j] % 3;
            if(remainder == 0){
                System.out.println(numArray[j]);
            }
        }

        //Exercise 5
        int[] baseScoreArray = new int[20];
        int scoreData = 1;
        int scoreDoubled;
        int scoreTripled;
        for (int i = 0; i < baseScoreArray.length; i++) {
            scoreDoubled = numArray[i]*2;
            scoreTripled = numArray[i]*3;
            System.out.println("Base Score: " +numArray[i]+ "   Doubled: " +scoreDoubled+ "     Tripled: " +scoreTripled);
        }

        //Exercise 6
        String[][] checkerArray = new String[8][];
        String boardData;
        int rowRemainder, colRemainder;
        for (int i = 0; i < checkerArray.length; i++) {
            checkerArray[i] = new String [8];
            for (int j = 0; j < checkerArray[i].length; j++) {

                rowRemainder = i % 2;
                colRemainder = j % 2;
                if(rowRemainder > 0 && colRemainder > 0){
                    System.out.print("white-");
                }
                else if(rowRemainder == 0 && colRemainder > 0){
                    System.out.print("black-");
                }
                else if(rowRemainder == 0 && colRemainder == 0){
                    System.out.print("white-");
                }
                else if(rowRemainder > 0 && colRemainder == 0){
                    System.out.print("black-");
                }
                if(j % 8 == 0){
                    System.out.println();
                }
            }
        }

        //Exercise 7
        Scanner input = new Scanner(System.in);
        int value;
        int[] valueArray = new int[5];
        for (int i = 0; i < valueArray.length; i++) {
            System.out.println("Enter value #" +(i+1));
            valueArray[i] = input.nextInt();
        }
        for (int j = 0; j < valueArray.length; j++) {
            for (int k = 1; k < valueArray.length; k++) {
               
            }
        }
    }
}
