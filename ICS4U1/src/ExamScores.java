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
        //most frequent grade
        System.out.println("Most frequent grade: " +frequentGradeScore(examMarks));
        //tallying grades
        System.out.println("Class Grades: ");
        studentGrades(examMarks);
        //finding students who got 100%
        int count = 0;
        for (int i = 0; i < examMarks.length; i++) {
            if(examMarks[i] == 1.0) count +=1;
        }
        System.out.println("Students who got 100% : " +count);
        //finding best answered question
        System.out.println(bestAnswered(sAnswersArray, answers));
        //finding worst answered question
        System.out.println("Worst answered: " +worstAnswered(sAnswersArray, answers));

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
                if(dArray[j] < dArray[i]){
                    min = dArray[j];
                }
            }
        }
        return min;
    }
    public static int findMin(int[] iArray){
        int min = iArray[0];
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray.length; j++) {
                if(iArray[j] < iArray[i]){
                    min = iArray[j];
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
    //most frequent letter grade method
    public static String frequentGradeScore(double[] dArray){
        double score = frequentScore(dArray);
        String grade = "";
        if(score >= 0.9) grade = "A";
        if(score == 0.8) grade = "B";
        if(score == 0.7) grade = "C";
        if(score <= 0.6) grade = "F";
        return grade;
    }
    //tallying student marks
    public static void studentGrades(double[]dArray){
        int[] gradeArray = new int[4];
        for (int i = 0; i < dArray.length; i++) {
            double score = dArray[i];
            if(score >= 0.9) gradeArray[0] +=1;
            if(score == 0.8) gradeArray[1] +=1;
            if(score == 0.7) gradeArray[2] +=1;
            if(score <= 0.6) gradeArray[3] +=1;
        }
        System.out.println("Students with A's: " + gradeArray[0]);
        System.out.println("Students with B's: " + gradeArray[1]);
        System.out.println("Students with C's: " + gradeArray[2]);
        System.out.println("Students with F's: " + gradeArray[3]);
    }
    //method for finding best answered question
    public static int bestAnswered(String[] sArray, String answers){
        int[] count = new int[answers.length()];
        for (int i = 0; i < answers.length(); i++) {
            for (int j = 0; j < sArray.length; j++) {
                if(sArray[j].charAt(i) == answers.charAt(i)){
                    count[i] += 1;
                }
            }
        }
        int best = findMax(count);
        return best;
    }
    //method for finding worst answered question
    public static int worstAnswered(String[] sArray, String answers){
        int[] count = new int[answers.length()];
        for (int i = 0; i < answers.length(); i++) {
            for (int j = 0; j < sArray.length; j++) {
                if(sArray[j].charAt(i) != answers.charAt(i)){
                    count[i] += 1;
                }
            }
        }
        int worst = findMin(count);
        return worst;
    }
}
