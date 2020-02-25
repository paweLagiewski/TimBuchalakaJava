public class FloatingAndDoublePrimitiveTypes {

    public static void main(String[] args){

       float myMinFloatValue = Float.MIN_VALUE;
       float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3;
        double myDoubleValue = 5d/3;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Challenge

        double pounds = 3d;
        double pound = 0.45359237d;
        double poundsToKilograms = pounds*pound;

        System.out.println(pounds+ " Pounds is " + poundsToKilograms + " Kilograms");
    }
}