package Exercise;

public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        int sum = 0;

        if(number < 0)
            return -1;

        while (number != 0) {

            int currentNumber = number % 10;
            if(currentNumber%2==0)
                sum += currentNumber;

            number /= 10;
        }

        return sum;
    }
}
