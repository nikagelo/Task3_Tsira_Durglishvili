package ge.credo;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Input second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Input operator
        System.out.print("Enter an operator (+, -, *, /5): ");
        String operator = scanner.next();

        int result;

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.printf("Result: %d + %d = %d\n", num1, num2, result);
                break;
            case "-":
                result = num1 - num2;
                System.out.printf("Result: %d - %d = %d\n", num1, num2, result);
                break;
            case "*":
                result = num1 * num2;
                System.out.printf("Result: %d * %d = %d\n", num1, num2, result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("Result: %d / %d = %d\n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
        }

        // Close the scanner
        scanner.close();
    }
}

