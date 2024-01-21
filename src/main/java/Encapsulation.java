public class Encapsulation {

    private int age;
    private String name;
    private double grade;
    private String id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 125){
            System.out.println("Invalid setting, try again.");
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setId(long id) {
        this.id = String.valueOf(id);
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {

        /*
                JAVA OOP (oops) PRINCIPLES - (object oriented programming)

                1. Encapsulation
                2. Inheritance
                3. Abstraction
                4. Polymorphism

                * Encapsulation (data hiding) - is the technique or process of hiding the data, is achieved using "private" access modifier set to the variables,
                and by providing an indirect access using getters and/or setters.

                capsule -

                getter - gets the data (reads the data)
                setter - sets the data (writes/changes the data)

                write-only class - when only setter is provided, but no getter methods
                read-only class - when only getter is provided, but no setter methods


                TASK:

                * Create a class of your choice
                * Add 3 instance variables
                * Encapsulate the variables

                * Create or use another class where you create an instance of the custom class
                * Try setting and getting the fields (print out those fields, or just assign them to some variables)


                Benefits of encapsulation:

                1. We can make the class read-only or write-only
                2. A class can have total control over what is stored in its fields
                3. User will not know how the class stores its data. A class can change the data type of any field and users of the class do
                                                                need to change any of their code.
         */

        Building building = new Building();
        building.setAddress("123 lincoln street");
        building.setNumberOfRooms(5);
        System.out.println(building.getNumberOfRooms());

        Encapsulation encapsulation = new Encapsulation();


    }
}
