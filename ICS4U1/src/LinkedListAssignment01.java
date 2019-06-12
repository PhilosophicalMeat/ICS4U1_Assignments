import java.io.IOException;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class LinkedListAssignment01 {
    private static boolean gameOn = true;
    private static int contestantOneRoll = 0, contestantTwoRoll = 0, contestantOneScore = 0,
            contestantTwoScore = 0, result = 0;
    private static LinkedList<String> contestantList = new LinkedList<String>();
    private static LinkedList<String> dropOutList = new LinkedList<String>();
    private static Random rand = new Random();
    private static Scanner input = new Scanner(System.in);
    private static String contestantOne = "", contestantTwo = "";
    public static void main(String[] args) throws IOException {
        boolean continueGame = true;
        while(continueGame){
            //the conditon for refilling the contesant list
            if(contestantList.size() <= 1){
                gameOn = false;
                getContestants();
                gameOn = true;
            }
            else{
                selectContestants();
                System.out.println("This match is between " + contestantOne + " and " + contestantTwo);
                while(gameOn) {
                    roll();
                    if (result < 7){
                        System.out.println(contestantOne + " has won the round. Awarding 50 points");
                        contestantOneScore += 50;
                        roll();
                    }
                    else if (result > 7){
                        System.out.println(contestantTwo + " has won the round. Awarding 50 points");
                        contestantTwoScore += 50;
                        roll();
                    }
                    //condition for disqualification
                    else{
                        gameOn = false;
                        //removing the two contestants from the contestant list and into the dropOutList
                        contestantList.remove(contestantOne);
                        contestantList.remove(contestantTwo);
                        dropOutList.add(contestantOne);
                        dropOutList.add(contestantTwo);
                        //getting the next two contestants
                        selectContestants();
                    }
                }
            }
        }
    }
    //the method for refilling the applicant list
    public static void getContestants(){
        int contestantCount = contestantList.size();
        String applicantName = "";
        boolean isDropOut = false;
        while (contestantCount < 10) {
            //prompting the user for the contestants name
            System.out.println("Enter the name of the new contestant.");
            applicantName = input.nextLine();
            //making sure the applicant hasn't played this game before
            for (int i = 0; i < dropOutList.size(); i++) {
                if (applicantName.equals(dropOutList.get(i))) isDropOut = true;
            }
            //if the applicant has already played,
            if (isDropOut) {
                System.out.println("Applicant has already played. Please enter a different name");
                applicantName = input.nextLine();
            } else {
                contestantList.add(applicantName);
                contestantCount += 1;
            }
        }
    }
    //method for selecting contestants
    public static void selectContestants(){
        contestantOne = contestantList.get(0);
        contestantTwo = contestantList.get(1);
    }
    //method for playing the match
    public static void roll(){
        contestantOneRoll = rand.nextInt(6);
        contestantOneRoll = (contestantOneRoll == 0) ? 1 : contestantOneRoll;
        contestantTwoRoll = rand.nextInt(6);
        contestantTwoRoll = (contestantTwoRoll == 0)? 1 : contestantTwoRoll;
        result = contestantOneRoll + contestantTwoRoll;
    }
}
