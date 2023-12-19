package Project5Loops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//i am happy
//i amhpy
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any sentence. I will remove duplicate letters.");
        String input = scanner.nextLine();
        input = input.trim();

        scanner.close();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            String currentChar = input.substring(i, i + 1);

            if (!result.contains(currentChar)) {
                result += currentChar;
            }

        }

        System.out.println("OUTPUT is : " + result);
        //for loop until length of the string
        //save the current character - charAt - substring
        //is the new string has the previous value.
        //new string save there only unique


    }
}
