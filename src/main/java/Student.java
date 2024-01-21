public class Student {

    String fullName;
    double gpa;
    int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String fullName, double gpa, int age) {
        this.fullName = fullName;
        this.gpa = gpa;
        this.age = age;
    }

    public static void main(String[] args) {

        Movie movie = new Movie();

        movie.setName("Harry Potter");
        movie.setGenre("Fantasy");
        movie.setDuration(120);

        System.out.println(movie.getName());




        Encapsulation object = new Encapsulation();
        object.setId(12345);








    }
}
