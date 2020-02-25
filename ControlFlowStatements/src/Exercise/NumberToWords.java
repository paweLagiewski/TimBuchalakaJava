package Exercise;

public class NumberToWords {

    public static void numberToWords(int number){

        int reversed = reverse(number);

        if(number<0)
            System.out.println("Invalid Value");
        if(number==0)
            System.out.println("Zero");

        while(reversed > 0){

            int lastDigit = reversed % 10;

            switch(lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversed /= 10;

        }

        reversed = reverse(number);
        int reverseCount = getDigitCount(reversed);
        int numberCount = getDigitCount(number);

        if(numberCount > reverseCount){
            for(int i = reverseCount; i != numberCount; i++) {
                    System.out.println("Zero");
            }
//            while(numberCount != reverseCount){
//                reverseCount++;
//                System.out.println("Zero");
//            }
        }
    }

    public static int reverse(int number){

        int reverse = 0;

        while(number!=0){

            int lastDigit = number % 10;

            reverse = (reverse*10)  +  lastDigit;

            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){

        int count = 0;

        if(number<0)
            return -1;

        if(number==0)
            return 1;
//        for(int i = number; number!=0; i%=10){
//            count++;
//            number /= 10;
//        }

        while(number > 0){
            //int lastDigit  = number % 10;
            count++;
            number /= 10;

        }

        return count;
    }
}
