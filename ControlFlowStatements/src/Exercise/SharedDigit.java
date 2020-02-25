package Exercise;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if(a<10 || a>99 || b<10 || b>99)
            return false;

        int tempA = 0;
        int tempB = 0;

        while(a != 0){

            tempA = a % 10;
            a /= 10;

            while(b != 0){

                tempB = b % 10;

                if(tempA == tempB) {
                    return true;

                }

                b /= 10;
            }
        }
        return tempA == tempB;
    }
}
