package ge.credo;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter a (a != 0): ");
        float a = scanner.nextFloat();
        System.out.print("Enter b (b != 0): ");
        float b = scanner.nextFloat();
        System.out.print("Enter c (c ≥ 0): ");
        float c = scanner.nextFloat();

        // Check the conditions
        if (a != 0 && b != 0 && c >= 0) {
            double result = (Math.pow(a, 3.0)+Math.pow(b, 2.0)-Math.sqrt(c))/(a*b+c);
            System.out.println("The result IS: " + result);
        } else {
            System.out.println("Input values do not meet the required conditions.");
        }

        scanner.close();
    }
}
