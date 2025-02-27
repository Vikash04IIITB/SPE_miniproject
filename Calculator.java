import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Basic Calculator ---");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Square Root (√x)");
                System.out.println("6. Factorial (n!)");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 7) {
                    System.out.println("Exiting... Thank you!");
                    break;
                }

                double num1, num2;
                int n;
                
                switch (choice) {
                    case 1: // Addition
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + add(num1, num2));
                        break;

                    case 2: // Subtraction
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + subtract(num1, num2));
                        break;

                    case 3: // Multiplication
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + multiply(num1, num2));
                        break;

                    case 4: // Division
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero!");
                        } else {
                            System.out.println("Result: " + divide(num1, num2));
                        }
                        break;

                    case 5: // Square Root
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        if (num1 < 0) {
                            System.out.println("Error: Square root of negative number not supported!");
                        } else {
                            System.out.println("Result: " + squareRoot(num1));
                        }
                        break;

                    case 6: // Factorial
                        System.out.print("Enter a number: ");
                        n = scanner.nextInt();
                        if (n < 0) {
                            System.out.println("Error: Factorial not defined for negative numbers!");
                        } else {
                            System.out.println("Result: " + factorial(n));
                        }
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
