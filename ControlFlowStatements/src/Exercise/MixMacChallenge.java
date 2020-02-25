package Exercise;

import java.util.Scanner;

public class MixMacChallenge {

    public static void main(String[] args) {

        int minimum = 0;
        int maximum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("If you want end this loop enter somethig that is not a number");

        while(true) {

            System.out.println("Enter Number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int number = scanner.nextInt();

                if(minimum == 0 && maximum == 0) {
                    minimum = number;
                    maximum = number;
                }

                if (number < minimum){
                    minimum = number;
                }

                if (number > maximum){
                    maximum = number;
                }

            }

            if(!hasNextInt){
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("Minimum is " + minimum + " and Maximum is " + maximum);

        scanner.close();
    }
}
