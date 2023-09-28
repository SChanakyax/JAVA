package week2;

/**
 * This file is to understand week2.TypeCasting in Java
 * integer to short
 * short to integer
 * integer to double
 * double to integer
 * integer to float
 * float to integer
 * integer to long
 * long to integer
 * float to double
 * double to float
 * short to float
 * float to short
 * double to short
 * short to double
 */


public class TypeCasting {

    static int i;
    static double d;
    static long l;
    static float f;
    static short s;
    static boolean b;
    static byte B;
    static char c;

    public static void main(String[] args) {
        System.out.println("Java Week2_practice");
        intToShort();
        intToDouble();
        doubleToInt();
        shortToInt();
        integerToFloat();
        floatToInteger();
        integerToLong();
        longToInteger();
        floatToDouble();
        doubleToFloat();
        shortToFloat();
        floatToShort();
        shortToDouble();
        doubleToShort();
    }
    private static void intToShort() {
        i = 32769;
        s = (short) i;
        System.out.println(s);
        i = 127;
        s = (short) i;
        System.out.println(s);
    }

    private static void shortToInt() {
        s = 32763;
        i = s;
        System.out.println(i);
    }
    private static void intToDouble() {
        i = 999;
        d = i;
        System.out.println(d);
    }

    private static void doubleToInt() {
        d = 445;
        i = (int) d;
        System.out.println(i);
    }

    private static void integerToFloat() {
        i = 12;
        f = i;
        System.out.println(f);
    }

    private static void floatToInteger() {
        f = (float) 12.4;
        i = (int) f;
        System.out.println(i);
    }

    private static void integerToLong() {
        i = 13233;
        l = i;
        System.out.println(l);
    }

    private static void longToInteger() {
        l = 3452;
        i = (int)l;
        System.out.println(i);
    }

    private static void floatToDouble() {
        f = 233.4f;
        d = f;
        System.out.println(d);
    }

    private static void doubleToFloat() {
        d = 2333333333333333L;
        f = (float)d;
        System.out.println(f);
    }

    private static void shortToFloat() {
        s = 23333;
        f = s;
        System.out.println(f);
    }

    private static void floatToShort() {
        f = 23333;
        s = (short)f;
        System.out.println(s);
    }

    private static void shortToDouble() {
        s = 23333;
        d = f;
        System.out.println(d);
    }

    private static void doubleToShort() {
        d = 233333;
        s = (short)f;
        System.out.println(s);
    }
}
