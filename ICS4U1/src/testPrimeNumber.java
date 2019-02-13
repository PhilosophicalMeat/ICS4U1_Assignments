public class testPrimeNumber {
    public static void main(String[] args) {
        findPrime(17);
        findPrime(6);
        findPrime(3);
    }
    public static void findPrime(int iTestPrime){
        int pTestOne = iTestPrime % 2;
        int pTestTwo = iTestPrime % 3;
        String pResult = (pTestOne != 0 && pTestTwo != 0 && iTestPrime > 3) ? iTestPrime+" is a prime number" : iTestPrime+" is NOT a prime number";
        System.out.println(pResult);
    }
}
