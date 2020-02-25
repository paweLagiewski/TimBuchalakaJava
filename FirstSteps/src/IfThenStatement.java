public class IfThenStatement {

    public static void main (String[] args){

        boolean isAlien = true;

        if(isAlien == false)
            System.out.println("It is not an alien!");
        if(isAlien == true)
            System.out.println("It is an Alien");


        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int seconTopScore = 81;
        if ((topScore > seconTopScore) && (topScore < 100))
            System.out.println("Greater then second score and less than 100");

        if ((topScore > 90) || (seconTopScore <=90))
            System.out.println("Either or both of the conditions are true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if (!isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCas is true`");
    }
}
