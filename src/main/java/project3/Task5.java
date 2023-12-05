package project3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
 Using the scanner asks the user to enter one sentence with three words and print the
index number of each word's last character and then print the sum of each index
number that you found.
For Example:
Input:
"Importance of Human" --> it can be any three-word sentence.
 Output:
9 --> index number of 'e'
12 --> index number of 'f'
18 --> index number of 'n'
The sum: 39
        *
        *
        *
        * */

//        Scanner scanner = new Scanner(System.in);

        //first 3 words
        System.out.println("Please enter the first string: ");
//        String str1 = scanner.nextLine();

        String sentence = "Importance of Human";

        System.out.println(sentence.lastIndexOf(' ',12));
        //charAt()
        //
//        sentence.lastIndexOf(' ')






    }
}
