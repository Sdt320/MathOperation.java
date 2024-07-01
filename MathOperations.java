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
