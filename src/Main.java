public class Main {
    public static void main(String[] args) {

        // print string
        System.out.println("Hello world!");
        // Double quotes mean string.

        // print boolean
        boolean flag = true;
        System.out.println("Boolean:" + flag);

        // print byte: The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
        byte range;
        range = 124;
        System.out.println("Byte:" + range);

        // print short: The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
        short temperature;
        temperature = -200;
        System.out.println("Short:" + temperature);

        // print int: The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
        int rangeInt = -4250000;
        System.out.println("Int:" + rangeInt);  // print -4250000

        // print long: The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
        long rangeLong = -42332200000L;
        System.out.println("Long:" + rangeLong);

        // print double: The double data type is a double-precision 64-bit floating-point. Never to be used on precise values such as currency.
        double numberDouble = -42.3;
        System.out.println("Double" + numberDouble);  // prints -42.3

        // print float: The float data type is a single-precision 32-bit floating-point. Never to be used on precise values such as currency.
        float numberFloat = -42.3f;
        System.out.println("Float" + numberFloat);

        // print char: The minimum value of the char data type is '\u0000' (0) and the maximum value of the char data type is '\uffff'.
        char letter = '\u0051';
        System.out.println(letter);
        char letter1 = '9';
        System.out.println(letter1);
        char letter2 = 65;
        System.out.println(letter2);
    }
}


