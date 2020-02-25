public class PrimitiveTypes {

    public static void main(String[] args){

       int myValue = 10000;

       int myMinIntValue = Integer.MIN_VALUE;
       int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Macimum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

       byte myMinByteValue = Byte.MIN_VALUE;
       byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // Casting In Java
        // Int jest używany z Automatu

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);

        //PrimitiveTypesChallenge

        byte a = 10;
        short b = 8;
        int c = 13;

        long d = 50000L + (10L * (a + b + c ));
        System.out.println(d);

        short shortTotal = (short)(1000 + 10 * (a+b+c));
        System.out.println(shortTotal);
    }
}
