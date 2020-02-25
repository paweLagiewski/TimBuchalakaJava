package Exercise;

public class PerfectNumber {

    public static boolean isPerfectNumber (int number){

        if(number<1)
            return false;

        int sumFactors = 0;
        int factor = 0;

        while(factor<number){
            factor++;

            if(number%factor == 0)
                sumFactors += factor;

            if(number == sumFactors)
                return true;
        }

        return false;
    }
}
