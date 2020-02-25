package Exercise;

public class DigitSumChallenge {

    public static int sumDigits (int number){

        int sum = 0;

        if(number <= 9)
            return -1;

        while(number > 0){

            sum += number % 10;

            number /= 10;

        }

        return sum;
    }
}
