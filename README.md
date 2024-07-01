# MathOperation.java

Here's a menu-driven Java program that performs basic mathematical operations (addition, subtraction, multiplication, and division) using a class with corresponding methods. The program uses a `switch` statement to select the appropriate operation based on user input.

### MathOperations.java

```java
import java.util.Scanner;

public class MathOperations {

    // Method for addition
    public void addition(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result of addition: " + result);
    }

    // Method for subtraction
    public void subtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result of subtraction: " + result);
    }

    // Method for multiplication
    public void multiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result of multiplication: " + result);
    }

    // Method for division
    public void division(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result of division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations operations = new MathOperations();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    operations.addition(num1, num2);
                    break;
                case 2:
                    operations.subtraction(num1, num2);
                    break;
                case 3:
                    operations.multiplication(num1, num2);
                    break;
                case 4:
                    operations.division(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // For better readability in the output
        }

        scanner.close();
    }
}
```

### Explanation

1. **Class Definition**: `MathOperations` class contains methods for addition, subtraction, multiplication, and division.
2. **Methods**:
   - `addition(double num1, double num2)`: Adds two numbers and prints the result.
   - `subtraction(double num1, double num2)`: Subtracts the second number from the first and prints the result.
   - `multiplication(double num1, double num2)`: Multiplies two numbers and prints the result.
   - `division(double num1, double num2)`: Divides the first number by the second and prints the result. It also checks for division by zero.
3. **Main Method**:
   - A `Scanner` object is created to read user input.
   - A `MathOperations` object is created to call the methods.
   - A `while` loop is used to repeatedly display the menu and perform operations based on user choice until the user chooses to exit.
   - The `switch` statement is used to call the appropriate method based on the user’s choice.
   - User inputs are taken for the two numbers needed for the operations.
   - The program checks for an invalid choice and prompts the user to try again.

### How to Run

1. Save the code in a file named `MathOperations.java`.
2. Open a terminal or command prompt.
3. Navigate to the directory where the file is saved.
4. Compile the program using the command:
   ```sh
   javac MathOperations.java
   ```
5. Run the program using the command:
   ```sh
   java MathOperations
   ```
6. Follow the on-screen instructions to perform the desired mathematical operations.

This program provides a simple and interactive way to perform basic mathematical operations using a menu-driven approach in Java.
