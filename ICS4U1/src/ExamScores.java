import java.io.*;
import java.util.Scanner;
public class ExamScores {
    public static void main(String[] args) throws IOException {
        File examData = new File("C:\\Users\\Ethan\\Desktop\\ExamDataFile.txt");
        Scanner scanner = new Scanner(examData);
        String answers = "FTFFTFFTFT";
        String[] sDataArray = new String[14];
        fillArray(scanner, sDataArray);
        System.out.println(sDataArray[0]);
        System.out.println(sDataArray[13]);
        String[] sAnswersArray = new String[14];
        for (int i = 0; i <sAnswersArray.length ; i++) {
            sAnswersArray[i] = sDataArray[i].substring(5);
        }
        System.out.println(sAnswersArray[0]);
        //seperating IDs
        String[] idArray = new String[14];
        splitArray(sDataArray,idArray);
        //finding marks
        double[] examMarks = new double[14];
        checkMark(sAnswersArray,answers,examMarks);
        System.out.println("TEST - Student ID: " +idArray[1]+ "    Mark: " +examMarks[1]);
        //finding highest mark
        System.out.println("max value: " +findMax(examMarks));
        //finding lowest mark
        System.out.println("minimum value: " +findMin(examMarks));
        //class average
        System.out.println("average: " +average(examMarks));
        //printing in table
        for (int i = 0; i < 13; i++) {
            System.out.println("Student ID: " +idArray[i]+ "    Score: " +examMarks[i]+ "   Mark: " +(examMarks[i]*100)+ "%");
        }
        //most frequent score
        System.out.println("Most Frequent score: " +(frequentScore(examMarks)*100)+ "%");
        //
    }
    //method for finding #of lines in a txt file & filling an array
    public static void fillArray(Scanner fileCheck, String[] array){
        int i = 0;
        while(fileCheck.hasNext()){
            array[i] = fileCheck.nextLine();
            i++;
        }
    }
    //method for dividing student number and score
    public static String[] splitArray(String[] sArrayOne, String[] sArrayTwo){
        for (int i = 0; i < sArrayOne.length; i++) {
            sArrayTwo[i] = sArrayOne[i].substring(0,4);
        }
         return sArrayTwo;
    }
    //method for determing student mark
    public static void checkMark(String[] sAnswers, String acAnswers, double[] iArray){
        double count = 0;
        for (int i = 0; i < sAnswers.length; i++) {
            for (int j = 0; j < sAnswers[i].length(); j++) {
                if (sAnswers[i].charAt(j) == acAnswers.charAt(j)) count+=1;
            }
            iArray[i] = count/10;
            count = 0;
        }
    }
    //method for finding best score
    public static double findMax(double[] dArray){
        double max = dArray[0];
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 1; j < dArray.length; j++) {
                if(dArray[j] > dArray[i]){
                    max = j;
                }
            }
        }
        return max;
    }
    public static double findMin(double[] dArray){
        double min = dArray[0];
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray.length; j++) {
                if(dArray[j] > dArray[i]){
                    min = j;
                }
            }
        }
        return min;
    }
    //finding most frequent score
    public static void mostCommonMark(double[] dArray){
        double[] countArray = new double[dArray.length];
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < dArray.length; j++) {
                if (dArray[i] == dArray[i + 1] && i != dArray.length - 1) {
                    countArray[i]++;
                }
            }
        }
        System.out.println("Most common: " +findMax(countArray));
    }
    //find average
    public static double average(double[] dArray){
        double total = 0;
        for (int i = 0; i < dArray.length; i++) {
            total+= dArray[i];
        }
        double average = total/dArray.length;
        return average;
    }
    //find max INT method
    public static int findMax(int[] iArray){
        int max = iArray[0];
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 1; j < iArray.length; j++) {
                if(iArray[j] > iArray[i]){
                    max = j;
                }
            }
        }
        return max;
    }
    //find most frequent score
    public static double frequentScore(double[] dArray){
        double[] scoreArray = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0};
        int[] countArray = new int[11];
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < scoreArray.length; j++) {
                if(dArray[i] == scoreArray[j]){
                    countArray[j] += 1;
                }
            }
        }
        return (scoreArray[findMax(countArray)]);
    }

}
