package Exercise;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit ( int number) {

        int lastDigit = number % 10;

        int reverseDigit = 0;
        int reverse = 0;

        if(number < 0)
            return -1;

        while(number != 0) {

            reverseDigit = number % 10;
            reverse = reverse * 10 + reverseDigit;

            number /= 10;

        }

        return reverse%10 + lastDigit;
    }

}
