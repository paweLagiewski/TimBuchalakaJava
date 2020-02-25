public class TheSwitchStatement {

    public static void main(String[] args) {

        int value = 4;

        switch(value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value " + value);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        //CHALLENGE

        char variable = 'B';

        switch(variable){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found " + variable);
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String months = "January";

        switch(months.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
}
