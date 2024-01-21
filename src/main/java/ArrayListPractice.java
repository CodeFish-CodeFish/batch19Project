import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        /*
                Collections framework in Java

                ArrayList in Java

                Quick recap of arrays:

                * it stores elements of the same data type
                * size - fixed

                int or string or any other data type [] variable name = new data type [size];

                String[]
                int[]
                double[]

                * arraylist comes from collections framework, is a resizable array, can be found under java.util package.
                * arraylist is flexible in size
         */

        // Declaration of ArrayList



        /*
                Arraylist cannot store primitives, it stores only objects.
         */

        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        ArrayList<Double> myArrayList2 = new ArrayList<>();
        ArrayList<Boolean> myArrayList3 = new ArrayList<>();
        ArrayList<Character> myArrayList4 = new ArrayList<>();

        /*
                Array can store both: primitives and objects

                String[] --> Person[] ---> Car[] ---> Student[]
         */

        ArrayList<String> myArrayList = new ArrayList<>();

        ArrayList<String> myArrayList5 = new ArrayList<>(5);

        ArrayList<String> myArrayList6 = new ArrayList<>(Arrays.asList("abc", "xyz", "qwe"));

        /*
                Key/important properties of arraylist

                * dynamic size
                * allows duplicates
                * ordered collection
         */


        /*
                add();
         */

        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        System.out.println(list);
        System.out.println(list.size()); // will return the current size of your arraylist

        list.add("pear");
        System.out.println(list);
        System.out.println(list.size());


        /*
                TASK:

                Create an arraylist of integer;
                Add numbers starting from 5 to 10;
                Print out the size
         */

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i = 5; i <= 10; i++) {
            arrayList1.add(i); // autoboxing
        }

        System.out.println(arrayList1);
        System.out.println(arrayList1.size());


        /*
                addAll() - adds all elements of another collection to the arraylist
         */

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Apple");
        stringArrayList.add("Banana");

        ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList.add("Tomatoes");
        stringArrayList.add("Cucumbers");

        stringArrayList.addAll(stringArrayList1);
        System.out.println(stringArrayList);

        /*
                Task:

                Create 2 different string arraylists
                1st arraylist should contain 3 elements
                2nd should contain 2 elements

                Combine them using addAll()
                Print out the combines arraylist
         */

        ArrayList<String> arraylistOfWords = new ArrayList<>(Arrays.asList("january", "february", "march"));
        ArrayList<String> arraylistOfWords1 = new ArrayList<>(Arrays.asList("june", "july", "august"));

        arraylistOfWords.addAll(arraylistOfWords1);

        System.out.println(arraylistOfWords);
        System.out.println(arraylistOfWords1);

        /*
                clear(); // empties/clears the arraylist
         */

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(3.14);
        doubles.add(2.99);

        System.out.println(doubles);

        doubles.clear();
        System.out.println(doubles);
        System.out.println(doubles.size());

        /*
                clone(); -- make copy of your arraylist
         */

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('A', 'B', 'C'));
        ArrayList<Character> charactersClone = (ArrayList<Character>) characters.clone();

        /*
                contains(); -- checks if the element is present in the arraylist
         */

        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("summer", "autumn", "winter"));
        boolean containsWinter = arrayList2.contains("winter");
        System.out.println(containsWinter);
        boolean containsSpring = arrayList2.contains("spring");
        System.out.println(containsSpring);

        /*
                TASK:

                Use scanner to read user input (user input will be a string/word)
                You need to convert word to char array using .toCharArray() for ex: apple ---> ['a', 'p', 'p', 'l', 'e']
                use add() method to add all the elements in array to a new arraylist

                print out if your arraylist contains a letter 'a' using contains() method
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random word: ");
        String word = scanner.next();

        char[] letters = word.toCharArray(); // converts string to char array

        ArrayList<Character> characterArrayList = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            characterArrayList.add(letters[i]);
        }

        System.out.println(characterArrayList.contains('a'));
*

/
         */
        /*
                get(int index); --- returns an element at specified index

              ARRAY: array[1] -- it will get me the element at index 2 within my array
              ARRAYLIST: arraylistname.get(0) -- it will get you the first element in your arraylist

         */

        ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList("summer", "autumn", "winter"));
        System.out.println(arrayList3.get(2));

        /*
                indexOf() -- returns an index of the specified element (if exists)
         */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 22, 33));
        System.out.println(numbers.indexOf(22)); // 1

        System.out.println(numbers.indexOf(999)); // -1

        /*
                removeAll() -- removes multiple elements from arraylist
         */

        ArrayList<String> cars = new ArrayList<>(Arrays.asList("toyota", "honda", "ford", "subaru"));
        ArrayList<String> removeList = new ArrayList<>(Arrays.asList("toyota", "subaru"));

        cars.removeAll(removeList);
        System.out.println(cars);

        /*
                remove() -- removes a specified element in the arraylist
         */

        ArrayList<String> randomWordsList = new ArrayList<>(Arrays.asList("car", "house", "country", "weather", "weather"));
        randomWordsList.remove("Weather"); // removes a specified element

        System.out.println(randomWordsList);

        randomWordsList.remove(2); // removes an element at specified index

        System.out.println(randomWordsList);

        ArrayList<String> randomWordsList1 = new ArrayList<>(Arrays.asList("apple", "banana", "strawberry", "peach"));

        // DRY principle - do not repeat yourself

        ArrayListPractice arrayListPractice = new ArrayListPractice();

        System.out.println(arrayListPractice.removeIgnoreCase(randomWordsList1, "Apple"));

        System.out.println(arrayListPractice.removeIgnoreCase(randomWordsList1, "PeAcH"));

        System.out.println(arrayListPractice.removeIgnoreCase(randomWordsList1, "bAnana"));


        /*
                size() -- returns the size of the arraylist
         */

        int[] arrOfNumbers = new int[2];
        int length = arrOfNumbers.length; // property

        ArrayList<String> daysOfTheWeek = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        int size = daysOfTheWeek.size(); // method
        System.out.println(size);

        /*
                isEmpty() -- checks if the arraylist is empty
         */

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        System.out.println(randomNumbers.isEmpty());

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane", "Jenny"));
        System.out.println(names.isEmpty());

        names.removeAll(names);
        System.out.println(names.isEmpty());

        /*
                subList(int fromIndex, int toIndex) -- returns a portion of the arraylist
                * fromIndex is inclusive
                * toIndex is exclusive
         */

        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("John", "Jack", "Jane", "Jenny"));

        System.out.println(names1.subList(0, 3)); // "John", "Jack", "Jane"

        System.out.println(names1.subList(0, 1)); // "John"



        /*
                ArrayList is flexible/dynamic in size.
                Arraylist is resizable array.

                ArrayList<Data Type> variableName = new ArrayList<>();

                data type can be any object (String, custom object, wrapper classes)

                size --- dynamic for arraylist, and fixed for array

                * get(index as an int) -- fetch/retrieve an element from arraylist
                * add(Object object) -- to add to an arraylist
                * remove() -- gets rid of the certain specified element
         */


        /*
                set() -- replaces the single element from an arraylist

                * the index/location where we want to add our element
                * the object that we want to set
         */

        ArrayList<String> footballTeamNames = new ArrayList<>(Arrays.asList("Bears", "Lions", "Patriots", "Colts", "Browns"));
        footballTeamNames.set(1, "Ravens");
        System.out.println(footballTeamNames);

        footballTeamNames.set(footballTeamNames.indexOf("Colts"), "Cowboys");

        System.out.println(footballTeamNames);

        //footballTeamNames.set(6, "Bengals");
        //System.out.println(footballTeamNames); IndexOutOfBoundsException

        /*
                sort() -- sorts an arraylist according to specified order
         */

        ArrayList<Integer> unsortedArrayList = new ArrayList<>(Arrays.asList(7, 0, 2, 15, 99, 4));

        unsortedArrayList.sort(Comparator.reverseOrder()); // sorts in descending order
        unsortedArrayList.sort(Comparator.naturalOrder()); // sorts in ascending order

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John Doe", 4.3, 21));
        students.add(new Student("Jane Doe", 4.9, 19));
        students.add(new Student("John Smith", 4.0, 20));

        students.sort(Comparator.comparing(Student::getGpa));

        for (Student student : students) {
            System.out.print(student.fullName + " ");
        }

        //System.out.println(unsortedArrayList);

        /*
                toArray() -- converts arraylist to array
         */

        ArrayList<String> randomCountries = new ArrayList<>(Arrays.asList("USA", "China", "Canada", "Algeria"));

        String[] arrayOfCountries = randomCountries.toArray(new String[0]);

        System.out.println(arrayOfCountries.length);

        /*
                TASK:

                Create an arraylist of numerical primitive data type (int, double, short, byte, long, float etc.)
                Convert the arraylist ot array using toArray();
                Print out the array --- Arrays.toString([] array);
         */

        ArrayList<Double> randomDoubles = new ArrayList<>(Arrays.asList(3.14, 2.99, 3.1, 5.99));
        Double[] arrayOfDoubles = randomDoubles.toArray(new Double[0]);
        System.out.println(Arrays.toString(arrayOfDoubles));

        /*
                toString() -- converts an array to string
         */

        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.99, 0.99, 0.5, 9.99));
        String str = doubleArrayList.toString();
        System.out.println(str);

        /*
                TASK:

                * Create an arraylist of string data type
                * Using loop, ask user to enter random words
                * Store those words in arraylist ( use add() method to add those words to arraylist )

                * Ask user to choose which old word to replace and enter the new word ( use .set(index, the new value) )
                                index can be found using indexOf() method

                * Print out the updated arraylist
         */

        /*
        ArrayList<String> wordsArrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a random word: " + i);
            wordsArrayList.add(scanner.next());
        }

        System.out.println("Which word you would like to replace ?");
        String wordToBeReplaced = scanner.next();

        System.out.println("Please enter a new word to replace with.");
        String newWord = scanner.next();

        int indexOfOldWord = wordsArrayList.indexOf(wordToBeReplaced);

        wordsArrayList.set(indexOfOldWord, newWord);

        System.out.println(wordsArrayList);
*/
        /*
                ensureCapacity() -- sets a size of the arraylist
         */

        ArrayList<Integer> numsArrayList = new ArrayList<>();
        numsArrayList.ensureCapacity(10);
        System.out.println(numsArrayList.size());

        /*
                lastIndexOf() -- returns position of last occurrence of the element
         */

        ArrayList<String> carsArrayList = new ArrayList<>(Arrays.asList("tesla", "buick", "honda", "toyota", "buick"));
        int indexOfLastOccurrence = carsArrayList.lastIndexOf("buick");
        System.out.println(indexOfLastOccurrence);

        /*
                retainAll() -- retains only the common elements
         */

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "strawberry", "watermelon"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("peach", "blueberry", "watermelon"));

        list1.retainAll(list2);

        System.out.println(list1);

        /*
                containsAll() -- checks if the collection is a subset of arraylist
         */

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("apple", "banana", "strawberry", "watermelon"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("strawberry", "watermelon", "peach"));

        ArrayList<String> list5 = new ArrayList<>();

        boolean contains = list3.containsAll(list4);

        System.out.println(contains);
        System.out.println(list3.containsAll(list5)); // returns true since arraylist 5 is empty


        /*
                trimToSize() -- trims the capacity of arraylist to equal its size
         */

        ArrayList<String> arrayList4 = new ArrayList<>(10);

        arrayList4.add("abc");
        arrayList4.add("xyz");
        arrayList4.trimToSize(); // the capacity will be reduced to 2

        /*
                removeRange() -- removes a portion of arraylist
         */

        ArrayList<String> words1 = new ArrayList<>(Arrays.asList("usa", "uk", "europe", "asia", "antarctica"));
        //((ArrayList<String>) words1).removeRange(1, 2);

        /*
                replaceAll() -- replaces all elements in arraylist
         */

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("usa", "uk", "europe", "asia", "antarctica"));

        wordsList.replaceAll(String::toUpperCase); // replaces the elements with uppercase versions of the elements
        System.out.println(wordsList);

        wordsList.replaceAll(String::toLowerCase); // replaces the elements with lowercase versions of the elements
        System.out.println(wordsList);

        /*
                removeIf() -- removes element that satisfies the condition
         */

        /*
                lambda expression: was introduced in Java 8, it is a part of functional programming

                (argument-list) -> { body }
         */

        ArrayList<String> wordsList1 = new ArrayList<>(Arrays.asList("usa", "uk", "europe", "asia", "antarctica"));
        wordsList1.removeIf(word -> word.contains("a"));
        System.out.println(wordsList1);

        ArrayList<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        numbersList1.removeIf(number -> number % 2 == 1); // it will remove the odd numbers from arraylist

        /*
                TASK:

                1. Declare and initialize an arraylist (contains some words)
                2. You need to remove the words that have a length more than 4
                3. Print out the modified arraylist

         */

        ArrayList<String> wordsList3 = new ArrayList<>(Arrays.asList("apple", "banana", "europe", "asia", "antarctica", "usa", "africa"));

        wordsList3.removeIf(word -> word.length() > 4 && word.startsWith("a")); // && or ||

        System.out.println(wordsList3);

        /*
                forEach() -- performs an action to all elements of arraylist
         */

        ArrayList<String> wordsList5 = new ArrayList<>(Arrays.asList("toyota", "honda", "acura", "hyundai"));
        wordsList5.forEach(word -> System.out.print(word.charAt(0) + " "));

        /*
                NEXT CLASS we will cover HASHSET
         */

        Encapsulation object = new Encapsulation();
        object.getAge(); // indirect access using getter method
        object.getGrade();

    }

    /**
     * @param arraylistToModify
     * @param wordToRemove
     * @return Modified arraylist
     */
    public ArrayList<String> removeIgnoreCase(ArrayList<String> arraylistToModify, String wordToRemove) {
        ArrayList<String> copyOfArraylistToModify = (ArrayList<String>) arraylistToModify.clone();

        for (String eachWord : arraylistToModify) {
            if (eachWord.equalsIgnoreCase(wordToRemove)) {
                copyOfArraylistToModify.remove(eachWord);
                break;
            }
        }

        return copyOfArraylistToModify;
    }
}
