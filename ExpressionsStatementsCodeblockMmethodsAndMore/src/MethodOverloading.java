public class MethodOverloading {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(1,12);
        calcFeetAndInchesToCentimeters(24);

    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){

        if(feet < 0 || inches < 0 || inches > 12)
            return -1;

        double centimeters = ((feet*12)*2.54) + (inches*2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
}

    public static double calcFeetAndInchesToCentimeters (double inches){

        if(inches < 0)
            return -1;

        int feet = (int)inches/12;
        int rest = (int)inches%12;

        return calcFeetAndInchesToCentimeters(feet, rest);

    }

}
