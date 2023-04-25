public class ControlFlow {
    public static void main(String[] args) {
        //    Entry point to your app
        //    Control Flow refers to structures within a programming language which allows us to make decisions, and/or repeat
        //    tasks conditionally.
        //    Conditional logic allows us to make decisions about which part of our code to run depending on state

        // this does not print out "5>3", because it's not a string. It's an expression.
        // Expressions are pieces of code which are evaluated at runtime.
        System.out.println(5 > 3);
        System.out.println(3 > 9);
        System.out.println("5 < 10");
        //This will print out "5<10" as it's a String. not an Expression.

        // >=, <=
        System.out.println(5 < 5); //false
        System.out.println(5 <= 5); //true. because meets one factor (equal)
        System.out.println(10 > 10); //false
        System.out.println(10 >= 10); //true

        // Equality is checked in different ways in Java.
        // We can check for value equality or for reference (memory) equality.

        // equality operator (==) checks that two primitive types have the same value
        System.out.println(5 == 5); //true
        System.out.println(6 == 5); //false

        // if:
        String name1 = "Jack";
        String name2 = new String("Jack");

        System.out.println(name1 == name2); //false

        // but if:
        // String name2 = "Jack";
        // System.out.println(name1 == name2); //true

        // the equality operator == checks if two variables are in the same memory. name 1 and name 2 have the same
        // value but are stored in different places in memory, so this returns false.
        System.out.println(name1 == name2);

        //to check if two Strings, or any other kind of objects, have the same 'value', we can use the equals method
    }
}
