// package Basics;

public class primitive {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("Int : " + num1);
        int num2 = 0b101;   // Binary
        System.out.println("Int (Binary) : " +num2);
        int num3 = 0x7E;    // Hexa Decimal
        System.out.println("Int (Hexa Decimal) : " +num3);
        int num4 = 10_00_00_000;    // Helps to count digits in number easily
        System.out.println("Int (Counting Big int) : " + num4);

        byte b = 127;
        System.out.println("byte : " + b);


        double d1 = 12;     // 12.0
        System.out.println("double : " + d1);
        double d2 = 12e10;  // e = 1.2 * 10^10 something like that
        System.out.println("double (e^10) : " + d2);

        float f = 5.6f;
        System.out.println("float : " + f);


        char c = 'a';
        System.out.println("Char : " + c);  // a
        c++;
        System.out.println("Char (increment) : " + c);  // b

        boolean boo = true;
        System.out.println("Boolean : " + boo);

    }

}
