package Project5Loops;

public class Task1 {
    public static void main(String[] args) {
        String input = "Happy";

        System.out.println("Original String: " + input);

        //yppaH
        String newstr = "";
        int lastChar = input.length() - 1;// 4
        System.out.println(lastChar + " length");

        while (lastChar >= 0) { // 4
            newstr = newstr + input.charAt(lastChar);
            System.out.println(lastChar + " lastchar in the while");
            lastChar -- ;
        }
        System.out.println("Result is : " + newstr);
    }
}
// length of the string to reverse you need to start from the end
//you have to find the end index
// you have to save it in new variable /
// you have to spin all the way to index 0
