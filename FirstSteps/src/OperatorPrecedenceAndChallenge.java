public class OperatorPrecedenceAndChallenge {

    public static void main (String[] args){

        double a = 20.00;
        double b = 80.00;
        double aB = (a + b) * 100.00;
        double remainder = aB % 40.00;
        boolean ifRemainderIs = remainder == 0 ? true : false;
        System.out.println(ifRemainderIs);

        if(!ifRemainderIs)
            System.out.println("Got some remainder");



    }
}
