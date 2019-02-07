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
                if(j % 8 == 0 && i > 0 && i < 9){
                    System.out.println();
                }
            }
        }

        System.out.println();

        //Exercise 7
        /*Scanner input = new Scanner(System.in);
        String numString;
        String numStringNew;
        char numStringVal;
        int[] valueArray = new int[5];
        System.out.println("Enter 5 integers you wish to sort from least-to-greatest." + 
                "Separate each integer with a '-'. Ex: 1-2-3-4-5");
        numString = input.nextLine();
        numStringNew = numString.replace("-","");
        for (int i = 0; i < numStringNew.length(); i++) {
            for (int j = 1; j < numStringNew.length(); j++) {
                if(numStringNew.charAt(i) > numStringNew.charAt(j) && i!=j){
                    char temp = numStringNew.charAt(i);
                    char temp2 = numStringNew.charAt(j);

                }
            }
        }*/

        //Exercise 8

        //Exercise 9
        String diagonal = "DIAGONAL";
        String spc = "";
        for (int i = 0; i < diagonal.length(); i++) {
            System.out.println(spc + diagonal.charAt(i));
            spc = spc.concat(" ");
        }

        System.out.println();

        //Exercise 10
        int x = 0;
        String results = "Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1, " +
                "Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";
        for (int i = 0; i < results.length(); i++) {
            if(results.charAt(i) == ','){
                x++;
            }
        }
        String[] matchArray = new String[x+1];
    }
}
