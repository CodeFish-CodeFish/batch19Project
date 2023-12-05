public class ArithmeticOperators {

    public static void main(String[] args) {

        /*
        1. Addition [+]
         */

        byte sumOfTwoNumbers = 1 + 1;
        System.out.println(sumOfTwoNumbers);

        short number1 = 10000;
        short number2 = 11000;
        short number3 = 500;

        int total = number1 + number2 + number3;

        System.out.println(total);

        int numberOfStudentsWithGradeA = 21;
        int numberOfStudentsWithGradeB = 10;
        int numberOfStudentsWithGradeC = 4;

        int totalNumberOfStudentsPassed = numberOfStudentsWithGradeA + numberOfStudentsWithGradeB + numberOfStudentsWithGradeC;

        System.out.println(totalNumberOfStudentsPassed);


        /*
        1. Subtraction [-]
         */

        int temperature1 = 75;
        int temperature2 = 35;

        int difference = temperature1 - temperature2;
        System.out.println(difference);

        double priceOfIMacAt1stLocation = 2100.67;
        double priceOfIMacAt2ndLocation = 1999.99;

        double priceDifference = priceOfIMacAt1stLocation - priceOfIMacAt2ndLocation;
        System.out.println(priceDifference);

        float averageTemp1 = 82.45f;
        float averageTemp2 = 73.12f;

        float differenceBetweenTwoTemps = averageTemp1 - averageTemp2;
        System.out.println(differenceBetweenTwoTemps);

        long largeNumber1 = 632478L;
        long largeNumber2 = 387434L;

        System.out.println(largeNumber1 - largeNumber2);

        /*
        1. Multiplication [*]
            * - asterisk
         */

        int numberOfStudents = 10;
        int numberOfCarsPerStudent = 2;

        int totalNumberOfCars = 10 * 2;
        System.out.println(totalNumberOfCars);

        System.out.println(numberOfStudents * numberOfCarsPerStudent);

        float pricePerItem = 19.99f; // double pricePerItem = 19.99
        int totalNumberOfItems = 125; // byte, short, long with L at the end

        System.out.println(totalNumberOfItems * pricePerItem);

        System.out.println("-----------------------------");

        long populationOfCity = 999999999L;
        double averageSalaryOfThatCity = 125020.80;

        System.out.println(populationOfCity * averageSalaryOfThatCity);


        System.out.println("--------------------------------");


        /*
        HOMEWORK:

        1. Find the average price of 2 br apartment in the city of your choice (chicago - 350,000$)
        2. Find the average price of 2 br apartment in NYC (nyc - 850,000$)
        3. Find and print out the difference

        4. Find the distance between 2 cities of your choice (chi to winnetka - 25 miles)
        5. Find the average gas price per mile (gas average - 4.21)
        6. Multiply distance by the average gas price

        7. Find the current value of bitcoin and ethereum (b=36,501.00, eth=1,956.17)
        8. Find the sum of them
         */

        //1st
        int apartmentPriceChicago = 350000;
        int apartmentPriceNyc = 850000;

        int diffBetweenChiAndNyc = apartmentPriceNyc - apartmentPriceChicago;
        System.out.println(diffBetweenChiAndNyc);

        //2nd
        int distanceChicagoToWinnetka = 25;
        double averageGasPriceInIllinois = 4.21;

        System.out.println(distanceChicagoToWinnetka * averageGasPriceInIllinois);

        //3rd
        double priceOfBitcoin = 36501.00;
        double priceOfEthereum = 1956.17;

        double totalOfBitcoinAndEthPrices = priceOfBitcoin + priceOfEthereum;
        System.out.println(totalOfBitcoinAndEthPrices);
        System.out.println("--------------------------");

        /*
        3. Division
         */

        int totalNumberOfTables = 60;
        int totalNumberOfClasses = 6;
        int tablesPerClass = totalNumberOfTables / totalNumberOfClasses;
        System.out.println(tablesPerClass);

        double priceOfApartment = 502355.15;
        int totalSquareFeet = 2000;
        double pricePerSquareFoot = priceOfApartment / totalSquareFeet;
        System.out.println(pricePerSquareFoot);

        int first = 5;
        int second = 2;
        int result = first/second; // 7/2 = 3.5, but when we assign the result to INT, the decimal is dropped/truncated
        System.out.println(result);

        // !!! Even though the result is 3.5, Java will store only the integer part.

        double num1 = 5;
        double num2 = 2;
        double result1 = num1/num2;
        System.out.println(result1);

        float priceOfCar = 238358.76f;
        float numberOfBuyers = 2.0f;
        float pricePerBuyer = priceOfCar / numberOfBuyers;
        System.out.println(pricePerBuyer);

        double priceOfHouse = 1234567.56;
        int months = 36;
        System.out.println(priceOfHouse / months); // result will be decimal/double

        // When you divide decimal (double or float) by integer, the result will still be decimal (double or float)


        /*
        4. Remainder/modulus [ % ]
         */

        // 7/2 ---> remainder is 1, 4/2 ----> 0, 11/5 -----> 1, 1/2 ----> 1
        // even: 2, 4, 6, 8, 10, 12 etc.
        // odd: 3, 5, 7, 9
        // 9/3 --> 0, 5/5 ---> 0

        int firstNum = 5;
        int secondNum = 2;
        int remainder = firstNum % secondNum;
        System.out.println(remainder);

        int someNumber1 = 10;
        int someNumber2 = 5;
        System.out.println(someNumber1 % someNumber2);


        // 1, 2, 3, 4, 5, 6, 7, 8
        // PSEUDOCODE:

        /*
        1. Take the number one by one
        2. Find the modulus by dividing it by 2
        3. if no remainder, the number is even, otherwise it's odd

        2 % 2 = 0;     1 % 2 = 1;
        4 % 2 = 0;     3 % 2 = 1;
         */

        // 1. Find the even/odd numbers within a given array of integers.


        /*
        Declaration of any variable
         */

        int a; // declaration
        int b = 1; // declared and initialized

        int c; // declared
        c = 4; // we're initializing

        int sum;
        sum = 1 + 3;
        System.out.println(sum);

        /*
        DEFAULT values of primitive data types
         */

        int myNumber; // the default value of int is 0
        short myNum; //0
        byte myByteNum; //0
        boolean myBool; // default value is FALSE
        char letter; // empty/null/nothing


        /*
        PRECEDENCE
         */


        System.out.println("---------PRECEDENCE-------------");
        int result2 = 2 + 3 * 4; // Multiplication (3*4) will be performed first, then addition will happen (12+2)
        System.out.println(result2);

        int result4 = 10 - 6 / 2; // Division (6/2) will be performed first, and then subtraction (10-3)
        System.out.println(result4);

        int result5 = 11 + 5 % 2; // Remainder is performed first (5 % 2), and then the addition (11 + 1)
        System.out.println(result5);

        int result6 = 2 * 3 * 4; // 2 * 3 is evaluated, 6 * 4 is calculated afterwards
        // if operators are in the same level, the calculation is performed from the left to right
        System.out.println(result6);

        int result7 = 20 - 5 + 3; // (20-5) is evaluated first, and then (15+3) is calculated
        // + and - operators are on the same level of precedence
        System.out.println(result7);

        int result8 = 10 / 2 % 3; // 10 / 2 is first, 5 % 3 is second in calculation
        // / and % are on the same level of precedence
        System.out.println(result8);

        int result9 = 10 / (2 % 3); // 2 % 3 = 2 is first in calc, the division is performed second
        System.out.println(result9);

        int result10 = 20 - (5 + 3); // (5+3) is evaluated first, and then (20-8) is calculated afterwards
        System.out.println(result10);

        int result11 = 2 + (3 * 4 - 2) / 2;
        // first in order is (3 * 4)
        // second in order is (12 - 2)
        // third is (10 / 2)
        // fourth is (2 + 5)
        System.out.println(result11);

    }
}
