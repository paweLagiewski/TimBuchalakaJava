package Exercise;

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int a, int b, int c){

        int tempA = 0;
        int tempB = 0;
        int tempC = 0;

        while(isValid(a)){

            tempA = a % 10;

            a /= 10;

            while(isValid(b)){

                tempB = b % 10;
                if(tempB == tempA){
                    return true;
                }
                b /= 10;

                while(isValid(c)){

                tempC = c % 10;
                if(tempC == tempB || tempC == tempA) {
                    return true;
                    }
                c /= 10;
                }
            }
        }

        return false;

    }

    public static boolean isValid (int number){

        if(number<10 || number>1000)
            return false;

        return true;
    }
}
