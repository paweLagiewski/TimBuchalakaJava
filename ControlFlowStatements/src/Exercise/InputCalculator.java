package Exercise;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage (){

        int sum = 0;
        double count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){

            boolean isInt = scanner.hasNextInt();

            if(isInt) {

                int number = scanner.nextInt();

                sum += number;
                count++;

            }

            if(!isInt){
                break;
            }

            scanner.nextLine();
        }

        double avg = sum/count;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));

        scanner.close();
    }
}
