// The "PrintACheque" class.
import java.util.Scanner;

///////////////////////////////////////////////////
//
//  This assignment prompts the user for an
//  amount to be printed on a cheque.
//
//  It uses the value and translate the numeric
//  value into a worded representation of the
//  number.  This word representation is printed.
//
//  Example:
//    If the user entered a value of 1357.86
//    the program will print the expression:
//
//    One Thousand Three Hundred Fifty Seven Dollars and 86 Cents
//
//////////////////////////////////////////////////
public class PrintACheque
{
    public static void main (String[] args)
    {
        // Set up variable to be used in the program.
        int iChqAmount, iPennies, iTens, iDollars, iHundreds, iBlockOf3, iSection;

        double dChqAmount;

        String sPennies       = "",
                sSectionPhrase = "",
                sChqPhrase     = "";

        // Prompt the user for the cheque amount
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Amount for the Cheque: ");
        dChqAmount = input.nextDouble();

        // Turn the Cheque Amount into an integer that
        // will be processed one section at a time
        //   e.g. dChqAmount = 1357.86
        //   ---> iChqAmount = 135786
        iChqAmount = (int) (dChqAmount * 100);
        if (iChqAmount < 0) iChqAmount *= -1;

        // Extract the pennies from the Chq Amount
        iPennies = iChqAmount % 100;
        // Turn the integer for Pennies into a string
        sPennies = "" + iPennies;
        // Pad the Pennies string with a leading zero if it is only one digit long
        if (sPennies.length() == 1) sPennies = "0" + sPennies;


        // Adjust the ChqAmount to remove the pennies
        iChqAmount /= 100;
        if (iChqAmount == 0)
        {
            sChqPhrase = "Zero ";
        }
        else
        {
            for (iSection = 1; iSection <= 2; iSection++)
            {
                // Strip last three digits from the Chq Amount
                //  & then remove them
                iBlockOf3  = iChqAmount % 1000;
                iChqAmount /= 1000;

                //Reset Section Phrase to blanks
                sSectionPhrase = "";

                iTens      = iBlockOf3 % 100;
                iDollars   = iBlockOf3 % 10;
                iHundreds  = iBlockOf3 / 100;

                // Handle the Hundreds
                switch(iHundreds){
                    case 1: sSectionPhrase += "One ";
                    case 2: sSectionPhrase += "Two ";
                    case 3: sSectionPhrase += "Three ";
                    case 4: sSectionPhrase += "Four ";
                    case 5: sSectionPhrase += "Five ";
                    case 6: sSectionPhrase += "Six ";
                    case 7: sSectionPhrase += "Seven ";
                    case 8: sSectionPhrase += "Eight ";
                    case 9: sSectionPhrase += "Nine ";
                }
                System.out.println("Hundred ");
                /*if (iHundreds == 1) sSectionPhrase += "One ";
                if (iHundreds == 2) sSectionPhrase += "Two ";
                if (iHundreds == 3) sSectionPhrase += "Three ";
                if (iHundreds == 4) sSectionPhrase += "Four ";
                if (iHundreds == 5) sSectionPhrase += "Five ";
                if (iHundreds == 6) sSectionPhrase += "Six ";
                if (iHundreds == 7) sSectionPhrase += "Seven ";
                if (iHundreds == 8) sSectionPhrase += "Eight ";
                if (iHundreds == 9) sSectionPhrase += "Nine ";
                if (iHundreds > 0)  sSectionPhrase += "Hundred ";*/

                // Handle the Tens
                if (iTens >= 20)
                {
                    iTens /= 10;
                    if (iTens == 2) sSectionPhrase += "Twenty ";
                    if (iTens == 3) sSectionPhrase += "Thirty ";
                    if (iTens == 4) sSectionPhrase += "Forty ";
                    if (iTens == 5) sSectionPhrase += "Fifty ";
                    if (iTens == 6) sSectionPhrase += "Sixty ";
                    if (iTens == 7) sSectionPhrase += "Seventy ";
                    if (iTens == 8) sSectionPhrase += "Eighty ";
                    if (iTens == 9) sSectionPhrase += "Ninety ";

                    if (iDollars == 1) sSectionPhrase += "One ";
                    if (iDollars == 2) sSectionPhrase += "Two ";
                    if (iDollars == 3) sSectionPhrase += "Three ";
                    if (iDollars == 4) sSectionPhrase += "Four ";
                    if (iDollars == 5) sSectionPhrase += "Five ";
                    if (iDollars == 6) sSectionPhrase += "Six ";
                    if (iDollars == 7) sSectionPhrase += "Seven ";
                    if (iDollars == 8) sSectionPhrase += "Eight ";
                    if (iDollars == 9) sSectionPhrase += "Nine ";

                }
                else
                //  0 to 19 are handled as exceptions
                {
                    if (iTens ==  1) sSectionPhrase += "One ";
                    if (iTens ==  2) sSectionPhrase += "Two ";
                    if (iTens ==  3) sSectionPhrase += "Three ";
                    if (iTens ==  4) sSectionPhrase += "Four ";
                    if (iTens ==  5) sSectionPhrase += "Five ";
                    if (iTens ==  6) sSectionPhrase += "Six ";
                    if (iTens ==  7) sSectionPhrase += "Seven ";
                    if (iTens ==  8) sSectionPhrase += "Eight ";
                    if (iTens ==  9) sSectionPhrase += "Nine ";
                    if (iTens == 10) sSectionPhrase += "Ten ";
                    if (iTens == 11) sSectionPhrase += "Eleven ";
                    if (iTens == 12) sSectionPhrase += "Twelve ";
                    if (iTens == 13) sSectionPhrase += "Thirteen ";
                    if (iTens == 14) sSectionPhrase += "Fourteen ";
                    if (iTens == 15) sSectionPhrase += "Fifteen ";
                    if (iTens == 16) sSectionPhrase += "Sixteen ";
                    if (iTens == 17) sSectionPhrase += "Seventeen ";
                    if (iTens == 18) sSectionPhrase += "Eighteen ";
                    if (iTens == 19) sSectionPhrase += "Nineteen ";
                }
                if (iBlockOf3 > 0)
                    if (iSection == 2) sChqPhrase = sSectionPhrase + "Thousand " + sChqPhrase;
                    else sChqPhrase += sSectionPhrase;
            }
            System.out.println("\n\nThe amount in words would be:\n\t"
                    + sChqPhrase + "Dollars and " + sPennies + " Cents");
        }
    } // main method
} // PrintACheque class

