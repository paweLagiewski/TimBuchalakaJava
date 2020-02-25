public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(15050));

    }

    public static String getDurationString (int minutes, int seconds){

        if(minutes < 0 || seconds < 0 || seconds > 59)
            System.out.println("Invalid Value");

        int hour = minutes/60;
        minutes %= 60;

        String stringHour = hour + "h ";
        if(hour < 10)
            stringHour = "0" + stringHour;

        String stringMinutes = minutes + "m ";
        if(minutes < 10)
            stringMinutes = "0" + stringMinutes;

        String stringSeconds = seconds + "s";
        if(seconds < 10)
            stringSeconds = "0" + stringSeconds;

        return stringHour + stringMinutes + stringSeconds;

    }

    public static String getDurationString (int seconds){

        if(seconds < 0)
            System.out.println("Invalid Value");

        int minutes = seconds/60;
        seconds%=60;

        return getDurationString(minutes, seconds);
    }
}
