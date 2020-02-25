package Exercise;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfTheDay) {

        if (!barking)
            return false;

        if (barking) {

            if (hourOfTheDay<0 || hourOfTheDay>23)
                return false;

            else if (hourOfTheDay >= 8 && hourOfTheDay <= 22)
                return true;

        }

        return true;

    }
}
