package university;

import java.util.ArrayList;

public class UniversityStudent {

    public String fullName;
    private Address address; // UniversityStudent HAS-A Address
    public ArrayList<Course> courses;

    public Course finalCourse; // UniversityStudent HAS-A Course

    public UniversityStudent(String fullName, Address address, ArrayList<Course> courses) {
        this.fullName = fullName;
        this.address = address;
        this.courses = courses;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return fullName + "'s address is " + this.address.getStreet() + " " + this.address.getCity() + " and studying course/s: "
                + this.courses.get(0);
    }

    public static void main(String[] args) {

        Address studentAddress = new Address("2400 N Lincoln Ave", "Chicago", 60622, "IL", 1);

        ArrayList<Course> courses = new ArrayList<>();

        Course historyCourse = new Course("History 201", "John Smith", 4);
        Course geometryCourse = new Course("Geometry 101", "Jack Doe", 6);

        courses.add(historyCourse);
        courses.add(geometryCourse);

        UniversityStudent student = new UniversityStudent("Alex Jackson", studentAddress, courses);

        System.out.println(student);
    }
}
