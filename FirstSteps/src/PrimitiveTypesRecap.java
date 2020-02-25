public class PrimitiveTypesRecap {

    public static void main (String[] args){

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is string";
        System.out.println(myString);

        myString = myString + " and this is more";
        System.out.println(myString);

        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + " 49.95";
        System.out.println(numberString);

        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
