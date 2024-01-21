public class Person {
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Setter method with validation
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age, try again.");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // "" or " "
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.out.println("Invalid name, try again.");
            return;
        }

        boolean areAllCharsDigits = true;

        // "123" " John Smith 2"

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                areAllCharsDigits = false;
            }
        }

        if (areAllCharsDigits) {
            System.out.println("Invalid name, name should not contain digits only. Try again!");
            return;
        }

        this.name = name;
    }
}
