import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashSetPractice {

    // wildcard importing - import java.util.*;

    /*
            Hashset is a type of collection in Java.

            KEY POINTS:
            * cannot contain duplicates (duplicate elements)
            * it contains unique elements
            * Unordered collection - hashset do not guarantee any specific order of the elements

            for example:

            int[] array = new int[] { 11, 22, 33 }; ---> array[2]
            ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("abc", "xyz")); // myArrayList.get(0) ---> "abc"

            It stores the elements by using a mechanism called "hashing".

            * HashSet allows to store null value, but only one null value.
            * HashSet is not synchronized ( threads )
            * The initial default capacity of HashSet is 16, and the load factor is 0.75.

            What is the difference between arraylist and hashset? the arraylist allows duplicates, whereas hashset does not allow.

     */

    HashSet<String> myFirstHashSet = new HashSet<>(); // created hashset using default/empty constructor
    HashSet<String> hashSet = new HashSet<>(20); // created hashset using overloaded constructor that sets the capacity of your hashset
    HashSet<String> hashSet1 = new HashSet<>(17, 0.80f); // this constructor sets initial capacity and sets the load factor

    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "peach", "cherry"));
    HashSet<String> hashSet2 = new HashSet<>(arrayList);

    // Intermediate level
    Set<String> set = Set.of("apple", "pineapple", "pear"); // immutable set, we cannot remove/add elements after its creation

    // Advanced way of creating hashset, it uses stream() API
    HashSet<String> hashSet3 = Stream.of("bmw", "toyota", "mercedes").collect(Collectors.toCollection(HashSet::new));

    /*
            TASK:

            1. Create a hashset using another collection (arraylist)
            2. Create using Set.of()
            3. Create using Stream.of()
     */

    public static void main(String[] args) {

        // METHODS:
        // add() -- adds the specified element to this set, if it's not already present

        HashSet<String> hashSet4 = new HashSet<>();
        hashSet4.add("Apple");
        hashSet4.add("Banana");

        System.out.println(hashSet4);

        HashSet<Integer> hashSet5 = new HashSet<>();
        hashSet5.add(999);
        hashSet5.add(888);
        hashSet5.add(888); // no duplicates allowed

        System.out.println(hashSet5);

        // remove(Object o) -- removes the specified element from this hashset if it is present

        HashSet<String> hashSet6 = new HashSet<>(Arrays.asList("Australia", "Japan", "China"));
        hashSet6.remove("China");
        hashSet6.remove("Austria"); // remove only present elements

        System.out.println(hashSet6);

        HashSet<Double> hashSet7 = new HashSet<>(Arrays.asList(2.99, 3.99, 8.99));
        hashSet7.remove(8.99);

        System.out.println(hashSet7);

        // contains(Object o) -- returns "true" if this hashset contains the specified element

        HashSet<String> hashSet8 = new HashSet<>(Arrays.asList("Australia", "Japan", "China"));
        System.out.println(hashSet8.contains("Japan")); // true because "Japan" is present in hashset

        // size() -- returns the number of elements in this hashset

        HashSet<String> hashSet9 = new HashSet<>();
        hashSet9.add("book");

        System.out.println(hashSet9.size()); // 1

        // isEmpty() -- returns "true" if this hashset contains no element (or empty)

        HashSet<String> hashSet10 = new HashSet<>();
        System.out.println("isEmpty(): " + hashSet10.isEmpty());

        // clear() -- removes all the elements from this hashset

        HashSet<String> hashSet11 = new HashSet<>(Arrays.asList("engineer", "doctor", "police officer"));
        hashSet11.clear(); // removes all the elements

        System.out.println(hashSet11);

        // iterator() -- returns an iterator over the elements in this hashset

        HashSet<String> hashSet12 = new HashSet<>(Arrays.asList("summer", "winter", "spring", "autumn"));
        Iterator<String> iterator = hashSet12.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // removeIf() -- will remove the elements in this hashset based on the "filter" (predicate/lambda expression)

        HashSet<String> hashSet13 = new HashSet<>(Arrays.asList("summer", "winter", "spring", "autumn"));
        hashSet12.removeIf(word -> word.contains("r"));
        System.out.println(hashSet13);


        // addAll() -- will add elements of the collection to this hashset

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("chicago", "new york", "los angeles", "new york"));

        HashSet<String> hashSet14 = new HashSet<>();
        hashSet14.addAll(arrayList1);

        System.out.println(hashSet14);

        /*
                TASK:

                * Create a hashset of string.
                * Ask user using scanner to input random words.
                * Store them in hashset.
                * Ask user to input the word that they want to remove.
                * Remove that word from your hashset.
                * Print out the modified/updated hashset.
         */

        /*
        HashSet<String> stringHashSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter any soccer club name: Round " + i);
            stringHashSet.add(scanner.nextLine());
        }

        System.out.println("Please enter the club name you wish to remove from hashset. \nCurrent list of clubs: " + stringHashSet);
        String clubToRemove = scanner.nextLine();

        stringHashSet.remove(clubToRemove);

        System.out.println("Updated list of club names is: " + stringHashSet);

        // arsenal --> a ---> A + rsenal

        System.out.println("Please enter the club name instead of the removed one. "
                + clubToRemove.substring(0, 1).toUpperCase() + clubToRemove.substring(1));

        stringHashSet.add(scanner.nextLine());

        System.out.println("The updated hashset is: " + stringHashSet);
*/
        /*
                null value in hashset
         */

        HashSet<String> hashSet15 = new HashSet<>();
        hashSet15.add(null); // adds null to hashset
        hashSet15.add(null); // attempt to add a null value to hashset that already contains null

        System.out.println("Content of hashset - " + hashSet15); // [null]

        System.out.println("Size of hashset - " + hashSet15.size()); // 1

        /*
                When you are storing any custom objects in HashSet, the good practice is to override "hashCode" and ".equals()"
         */

    }
}
