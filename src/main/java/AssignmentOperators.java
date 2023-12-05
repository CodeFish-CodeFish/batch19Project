public class AssignmentOperators {
    public static void main(String[] args) {

        // 1. Simple assignment [=]
        int a = 1; // assigned the value 1 to the variable a
        int b = 3; // assigned the value 3 to the variable b

        // 2. Addition assignment [+=]
        int c = 10;
        c += 3; // is equivalent to c = c + 3

        // c = 10 + 3;
        System.out.println(c);

        int d = 12;
        d += 10; // d = d + 10 ---> d = 12 + 10;
        System.out.println(d);

        // 3. Subtraction assignment [-=]
        int e = 5;
        e -= 3; // equivalent to e = e - 3; ---> e = 5 - 3;
        System.out.println(e);

        e -= 3;
        System.out.println(e); // current value of e is 2, e = 2 - 3;

        // 4. Multiplication assignment [*=]
        int f = 8;
        f *= 5; // is equivalent to f = f * 5 --> f = 8 * 5; --> 40
        System.out.println(f);

        int g = 100;
        g *= 3;
        System.out.println(g); // 300

        // 5. Division assignment [/=]
        int i = 100;
        i /= 25; // is equivalent to i = i / 25; --> 100/25 ---> 4
        System.out.println(i);

        int j = 20;
        j /= 5; // 20/5 ---> the value is reassigned back to j
        System.out.println(j); // 4

        //6. Modulus/remainder assignment [%=]

        int k = 5;
        k %= 2; // is equivalent to k = k % 2 ----> k = 5 % 2 ---> k = 1;
        System.out.println(k);

        int l = 10;
        l %= 4; // l = l % 4 ---> l = 10 % 4 ----> l = 2
        System.out.println(l);

        int number = 1;
        number = 2; // reassigned the value of number from 1 to 2
        number = 5;
        System.out.println(number);

        double pi = 3.1415;
        pi = 4.11; // reassigned the value of pi from 3.1415 to 4.11
        System.out.println(pi);

        // Any arithmetic operation with byte,
        // short will result in int [the result will be promoted to int]

        byte myByte = 10;
        // myByte = (myByte + 1); //<---- error

        byte myByte1 = 10;
        myByte1 += 1; // myByte1 + 10

        // Casting is the process of converting one data type to another
        // (byte) <--- is used to convert the data type of int to byte

        byte myByte2 = 10;
        myByte2 = (byte) (myByte2 + 1);

        // byte -> short -> int
        // float -> double

        byte byte1 = 1;
        int myConvertedByte = (int) byte1;
        short myConvertedShort = (short) byte1; //upcasting (from small to big)
        long myConvertedLong = (long) byte1;

        int myInt = 10;
        byte myByte12 = (byte) myInt;
        short myShort12 = (short) myInt; // downcasting (from big to small)
        long myLong12 = (long) myInt;

    }
}
