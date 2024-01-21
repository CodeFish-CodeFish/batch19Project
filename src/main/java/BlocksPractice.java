public class BlocksPractice {

    /*
            Block:

            In Java, a block is a group of zero, one or multiple statements surrounded by "{}".


            1. Method block / method body -- is executed whenever the method is called/invoked

            public void methodName(){
                    // statements;
            }

            2. Constructor block -- is executed whenever constructor is called

            public ClassName(){
                    // statements;
            }


            3. Instance initialization block -- executed each time an instance (object) is created

            {
                // statements;
            }

            ! Instance initializer blocks are executed before the constructor.

            4. Static initialization block -- executed once when the class is loaded

            static{
                // statements;
            }

            ORDER OF EXECUTION:

            1st: static block/s in the way they are ordered
            2nd: instance block/s in the way of the ordered
            3rd: constructor

     */


    {
        System.out.println("An instance is created.");
    }

    {
        System.out.println("2nd instance initializer block is executed.");
    }

    public static void main(String[] args) {

        BlocksPractice object = new BlocksPractice();

        BlocksPractice object1 = new BlocksPractice();

        /*
                TASK:

                * Create a class called BootcampStudent
                * Create 3 instance initializer blocks (print out statements)
                * In main method, create 3 objects of BootcampStudent
         */

    }

}
