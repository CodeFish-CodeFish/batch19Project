package project1;

public class CoinsConvertToTotal {

    /*
    *
    * Write program will add up the value of a number of quarters, dimes, nickels, and pennies.
    *  The number of each type of coin is input by the user.
    *  The total value is printed in dollars.
   Example:
    Quarters: 5
    Dimes: 4
    Nickels: 3
    Pennies: 2
The total in dollars is $1.82*/

    public static void main(String[] args) {

        // each coins type
        int quarters = 5;
        int dimes = 4;
        int nickel = 3;
        int pennies = 2;

        // value of each coin

        double quartValue = 0.25;
        double dimeValue = 0.10;
        double nickelValue = 0.05;
        double penniesValue = 0.01;

        double totalDollars = (quarters * quartValue);
        totalDollars += (dimes * dimeValue);
        totalDollars += (nickel * nickelValue);
        totalDollars += (pennies * penniesValue);

        System.out.println("The total of the coins value is $" + totalDollars );



    }
}
