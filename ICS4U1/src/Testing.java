public class Testing {
    public static void main(String[] args) {
        String temp = "036000241457";
        char[] tempArray = temp.toCharArray();
        String[] dataArray = new String[tempArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = String.valueOf(tempArray[i]);
            System.out.println(dataArray[i]);
        }
        try{


        }
        catch(Exception e){

        }
    }
}
