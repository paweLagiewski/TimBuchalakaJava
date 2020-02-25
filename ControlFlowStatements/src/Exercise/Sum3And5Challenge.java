package Exercise;

public class Sum3And5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i = 1; count<=4; i++){
            if(i%3==0 && i%5==0) {
                System.out.println("Divided by 3 and 5 is number " + i);
                sum += i;
                count++;
            }
        }

        System.out.println("The sum of sum of the first numbers is " + sum);

    }
}
