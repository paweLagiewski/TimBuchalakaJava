public class TheWhileAndDoWhileStatements {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int totalNumber = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Count value is " + number);
            totalNumber ++;
            if(totalNumber>=5)
                break;
        }

        System.out.println("Total even numbers found = " + totalNumber);

    }

    public static boolean isEvenNumber (int number){

        if(number<0)
            return false;

        return number%2==0;
    }
}
