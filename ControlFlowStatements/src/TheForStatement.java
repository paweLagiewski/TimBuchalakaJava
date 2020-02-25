public class TheForStatement {

    public static void main(String[] args) {

        for(int i=8; i>=2; i-- ){
            System.out.println("10.000 at " + i + "% interest = " +
                    String.format("%.2f",calculateInterest(10000,i)));
        }

        int count = 0;
        for (int a=2; count<=3; a++) {
            if (isPrime(a))
                System.out.println("The Number " + a + " is prime " + isPrime(a));
                count++;
        }

    }

    public static boolean isPrime(int n){

        if(n == 1)
            return false;

        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }

        return true;
    }

    public static double calculateInterest (double amount, double interestRate){

        return (amount * (interestRate/100));
    }
}
