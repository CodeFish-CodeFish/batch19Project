import university.Address;

public class Employee {

    public String fullName;
    public String department;

    public Address address;

    public void work() {
        System.out.println("Employee " + fullName + " is working.");
    }

    /*
            Inheritance:

            * is a OOP concept that allows a new class ( subclass/derived class/child class ) to inherit properties ( variables/fields )
            and behavior ( methods/functions ) of an existing class ( super class/parent class ).

            terminology:

            * Super class ( parent class ) -- the class whose properties/behavior is getting inherited.
            * Sub class ( child class ) -- the class that inherits the superclass's features (properties/behavior)
            * "extends" is the keyword used in Java to create a subclass

            advantages:

            * re-usability of code ( properties/behavior )
            * method overriding
            * maintainability

            TASK:

            * Create a class Transport (super class)
            * Extend the class to classes (Ship, Train, Plane)
            * Add 2 variables and 2 methods
            * Override 1 method

            * Create some objects and call the methods


                NOTE: FINAL CLASS CANNOT BE EXTENDED.

            * super() is a keyword to call a constructor from parent class.
            * super is also used to call a method or variable from parent class.


            METHOD OVERRIDING:

            Is a Java feature that allows a subclass to provide a specific
            implementation of a method that is already defined in its superclass.

            1. We need a method that was defined in superclass.
            2. We need a subclass that extends the class where that method was defined.

            RULES:

            * Same method signature: it should contain same name, return type, and params as a method in superclass.
            * Access level: the method in subclass cannot be more restrictive than the method from parent class.
            * Super keyword: "super" keyword can be used in the subclass method to call the superclass method if needed.
            * Annotation: "@Override" annotation should be used to indicate that the method is overridden. This will tell
                    the compiler that the method is getting overridden.
            * Exceptions: the overriding method can only throw those exceptions that are specified in the parent class method's signature.


            STATIC METHODS:

            * We cannot override static method, we can "hide" static method -- "METHOD HIDING"

            when you define a static method in the subclass that has the same method signature as a method in superclass,
            it hides the superclass's method.


            TASK:

            * Create a class of your choice
            * Declare 3 instance variables
            * Override toString() method

            * Create an object of your class, and try printing out the object.

     */

}
