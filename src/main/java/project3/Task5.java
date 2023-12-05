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

        int indexOfFirstSpace = sentence.indexOf(" ");

        System.out.println(indexOfFirstSpace);
        int indexOfFirstWord = sentence.indexOf(sentence.charAt(indexOfFirstSpace -1));
        System.out.println("Index of the first word: " + indexOfFirstWord);

        int indexOfSecondSpace= sentence.indexOf(' ', indexOfFirstSpace + 1);
        int indexOfSecondOne = sentence.lastIndexOf(sentence.charAt(indexOfSecondSpace -1));
        System.out.println("Index of the first word: " + indexOfSecondOne);

        int indexOfLastCharacter = sentence.lastIndexOf(sentence.charAt(sentence.length() -1));
        System.out.println(indexOfLastCharacter);

        int result = indexOfFirstWord + indexOfSecondOne + indexOfLastCharacter;

        System.out.println(result);


        //charAt()
        //
//        sentence.lastIndexOf(' ')






    }
}
