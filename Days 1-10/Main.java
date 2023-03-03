public class Main {
    public static void main(String[] args) {
        // as seen in Day 0 this is how we output a string to the console.
        System.out.println("This is output to the console.");

        // Working with variables
        int age = 30;                   // Any whole number value
        String name = "Perry";          // A string of two or more characters
        char favouriteLetter = 'L';     // a unicode character
        double PI = 3.14;               // A decimal number
        boolean hungry = true;          // must equate to either true or false

        // The above can be called as follows
        System.out.println(age);
        System.out.println(name);
        System.out.println(favouriteLetter);
        System.out.println(PI);
        System.out.println(hungry);

        // or can be used in conjunction with each other
        System.out.println("My name is " + name + ", and I am " + age + " years old.");

        // the technique above is called string concatenation, it is how we join strings together or use variables
        // within a string

    }
}
