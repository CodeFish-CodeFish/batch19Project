package project3;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder strBuilder1 = new StringBuilder();

        strBuilder1.append("Programming");
        System.out.println(strBuilder1);

        StringBuilder strBuilder2 = new StringBuilder();


        StringBuilder strBuilder3 = new StringBuilder(8);

        System.out.println("String builder 1 " + strBuilder1);
        System.out.println("String builder 2 " + strBuilder2);
        System.out.println("String builder 3 " + strBuilder3);

        //5
        strBuilder1.append(" Language");
        System.out.println("String builder 1 updated " + strBuilder1);
        strBuilder1.insert(0,"I Love ");
        System.out.println("String builder 1 updated 2 " + strBuilder1);
        //Delete the substring from index 7 to 11 (inclusive)
        // from `strBuilder1` and print the updated value.

        strBuilder1.delete(7,11);
        System.out.println("String builder deleted from 7 - 11 indexes: " + strBuilder1);

        strBuilder2.append("abcdefgh");
        strBuilder2.delete(2,strBuilder2.length());
        System.out.println("String builder 2 " + strBuilder2);

        strBuilder3.append("ABCDEFGH");
        strBuilder3.reverse();

        System.out.println("StringBuilder3 reversed: " + strBuilder3);
    }
}
