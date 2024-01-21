public class Community {
    public static void main(String[] args) {

        Person person = new Person();

        person.setAge(-10);

        person.setName(null);
        person.setName("");
        person.setName(" ");
        person.setName("123");
        person.setName("12a");

        System.out.println(person.getName());


    }
}
