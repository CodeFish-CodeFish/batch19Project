import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class GovernmentEmployee {

    private int id;

    GovernmentEmployee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == null) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {  // edge case
            return false;
        }

        GovernmentEmployee employee = (GovernmentEmployee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {

        GovernmentEmployee employee1 = new GovernmentEmployee(101);
        GovernmentEmployee employee2 = new GovernmentEmployee(102);

        HashSet<GovernmentEmployee> employees = new HashSet<>();

        employees.add(employee1);
        employees.add(employee2);

        System.out.println(employees);

        GovernmentEmployee employee3 = new GovernmentEmployee(101);
        employees.add(employee3);

        System.out.println(employees);

        // employee3.equals(employee1) --->

        // ArrayList stores only objects

        HashSet<String> hashSet1 = new HashSet<>(Arrays.asList("apple", "watermelon"));
        HashSet<String> hashSet2 = new HashSet<>(Arrays.asList("tomatoes", "cucumbers"));

        ArrayList<HashSet<String>> arrayListOfHashSets = new ArrayList<>();

        arrayListOfHashSets.add(hashSet1);
        arrayListOfHashSets.add(hashSet2);

        System.out.println(arrayListOfHashSets);

        ArrayList<ArrayList<String>> arrayList;

        ArrayList<ArrayList<int[]>> arrayList1; // ArrayList<Object>

        ArrayList<int[]> arrayList2 = new ArrayList<>(); // integer arrays will be stored in arraylist

        int[] arr1 = new int[]{1, 111, 222};
        int[] arr2 = new int[]{2, 121, 252};

        arrayList2.add(arr1);
        arrayList2.add(arr2);

        System.out.println(arrayList2);
    }

}
