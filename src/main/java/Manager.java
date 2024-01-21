public class Manager extends Employee { // is-a and has-a

    public int numberOfEmployeesManaged;

    public void manage() {
        System.out.println("Manager: " + fullName + " is managing at " + department);
    }

    @Override
    public void work() {
        System.out.println("Manager " + fullName + " is working.");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.fullName = "John Doe";
        manager.work();
    }
}
