package Exercise;

public class LargestPrime {

    public static int getLargestPrime (int number){

        if(number<=1)
            return -1;

        for(int n = number/2 ; n > 1; n--) {

            if (number % n == 0) {
                return getLargestPrime(n);
            }
        }

        return number;
    }
}
