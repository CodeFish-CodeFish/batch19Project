public class BootcampStudent {

    int i = 10;

    {
        System.out.println("1st instance initializer block is executed." + i);
    }

    int j = 10;

    {
        System.out.println("2nd instance initializer block is executed." + j);
    }

    int k = 10;

    {
        System.out.println("3rd instance initializer block is executed." + k);
    }

    static {
        System.out.println("Static initializer block 1 is executed.");
    }

    static {
        System.out.println("Static initializer block 2 is executed.");
    }

    public BootcampStudent() {
        System.out.println("A student is created.");
        i = 22;
    }

    public static void main(String[] args) {
        BootcampStudent student1 = new BootcampStudent();


        /*
                TASK:

                * Create a class of your choice
                * Have 2 instance initializer blocks
                * Have 2 static initializer blocks
                * Have a constructor ( print out "constructor is called" )


         */
    }
}
