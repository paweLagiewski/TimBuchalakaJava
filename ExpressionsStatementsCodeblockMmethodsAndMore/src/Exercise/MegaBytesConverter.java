package Exercise;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int kiloBytesToMegaBytes = kiloBytes/1024;
        int kiloBytesToMegabytesRest = kiloBytes - (kiloBytesToMegaBytes*1024);

        if(kiloBytes < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kiloBytes + " KB = " +
                    kiloBytesToMegaBytes + " MB and " +
                    kiloBytesToMegabytesRest + " KB");

    }
}
