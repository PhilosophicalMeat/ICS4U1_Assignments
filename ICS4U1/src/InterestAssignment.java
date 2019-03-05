public class InterestAssignment {
    public static void main(String[] args) {
        String temp = "16";
        String string = "392043,CMI,350.25,350.25,350.25,350.25,350.25,350.25,580.25,580.25,580.25,580.25,525.62,525.62,525.62,525.62,515.62,594.62,685.62,685.62,661.62,708.62,669.62,669.62,693.62,802.62,860.62,943.62,886.62,768.62,748.62,818.62";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ',') count+=1;
        }
        System.out.println(count - 1);
    }
    
}
