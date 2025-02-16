public class VariablesAndCaseSensitivity {
    public static void main(String[] args) {
        
        // Declare and initialize variables
        int studentAge = 15;             // Integer variable for age
        double itemPrice = 29.99;        // Double variable for price
        String studentName = "Alice";    // String variable for name
        
        // Declare two variables to demonstrate case sensitivity
        int counter = 10;               // Integer variable named 'counter'
        int Counter = 20;               // Integer variable named 'Counter' (different case)
        
        // Output the values
        System.out.println("Student Age: " + studentAge);  // Display age
        System.out.println("Item Price: $" + itemPrice);   // Display price
        System.out.println("Student Name: " + studentName); // Display student name
        System.out.println("Counter: " + counter);          // Display 'counter'
        System.out.println("Counter (Different Case): " + Counter); // Display 'Counter' with different case
    }
}
