public class CastingInJava {
    public static void main(String[] args) {

        // Casting: is the process of converting one data type to another
        // Casting includes: upcasting and down-casting
        // Upcasting

        byte a = 1;
        short b = (short) a; // we're upcasting the value of a to short and assigning it to b
        int int1 = (int) a; // we're upcasting the value of a to int and assigning it to int1
        long long1 = (long) a; // we're upcasting the value of a to long and assigning it to long1

        // you can omit/ignore/drop the parentethes with the data type to which you want to upcast

        // Down-casting

        long number = 10L;
        int myCastedNum1 = (int) number; // we're downcasting the value of "number" to integer, and assigning it to myCastedNum1
        short shortNum = (short) number; // we're downcasting the value of "number" to short, and assigning it to shortNum
        byte byteNum = (byte) number; // we're downcasting the value of "number" to byte, and assigning it to byteNum

        // any arithmetic operations with byte, short will result in int

        byte myByte1 = 1;
        int result = myByte1 + 1;

        byte d = 12;
        d += 10; // d = d + 10 ---> d = 12 + 10;
        System.out.println(d);

        int num2 = 5;
        double num3 = 1.5;
        // num2 / num3 ---> result will be double
        double myResult = num2 / num3;
        System.out.println(myResult);

    }
}
