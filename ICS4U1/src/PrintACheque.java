import java.util.Scanner;
public class PrintACheque {
    public static void main(String[] args) {
        // Set up variables to be used in the program.
        int iChqAmount, iPennies, iTens, iDollars, iHundreds, iBlockOf3, iSection;

        double dChqAmount;
        //Array for if iTens is less than 20 (plus for hundreds, thousands, etc)
        String[] iOneAndTeens = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
                "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ",
                "Eighteen ", "Nineteen"};
        //Array for if iTens is greater than or equal to 20
        String[] iTensTwentyPlus = {"", "", "Twenty ", "Thirty ", "Fourty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ",
                "Ninety "};


        String sPennies       = "",
                sSectionPhrase = "",
                sChqPhrase     = "";

        // Prompt the user for the cheque amount
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Amount for the Cheque: ");
        dChqAmount = input.nextDouble();

        // Turn the Cheque Amount into an integer that will be processed one section at a time
        //   e.g. dChqAmount = 1357.86
        //   ---> iChqAmount = 135786
        iChqAmount = (int) (dChqAmount * 100);
        iChqAmount *= (iChqAmount < 0) ? -1:1; //if false, multiplies by '1', so nothing changes

        // Extract the pennies from the Chq Amount
        iPennies = iChqAmount % 100;
        // Turn the integer for Pennies into a string
        sPennies = "" + iPennies;
        // Pad the Pennies string with a leading zero if it is only one digit long
        /*if (sPennies.length() == 1) sPennies = "0" + sPennies;*/
        sPennies = (sPennies.length() == 1) ? "0" + sPennies : sPennies;

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
                sSectionPhrase += iOneAndTeens[iHundreds] + " Hundred ";

                // Handle the Tens
                if (iTens >= 20)
                {
                    iTens /= 10;
                    sSectionPhrase += iTensTwentyPlus[iTens] + " " + iOneAndTeens[iDollars];
                }
                else
                //  0 to 19 are handled as exceptions
                {
                    sSectionPhrase += iOneAndTeens[iTens] + " ";
                }
                if (iBlockOf3 > 0)
                    if (iSection == 2) sChqPhrase = sSectionPhrase + "Thousand " + sChqPhrase;
                    else sChqPhrase += sSectionPhrase;
            }
            System.out.println("\n\nThe amount in words would be:\n\t"
                    + sChqPhrase + "Dollars and " + sPennies + " Cents");
        }
    }
}
