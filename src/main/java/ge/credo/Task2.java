package ge.credo;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius, height, and slant height
        System.out.print("Enter the radius of the cone (r): ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cone (h): ");
        double height = scanner.nextDouble();

        System.out.print("Enter the slant height of the cone (s): ");
        double slantHeight = scanner.nextDouble();

        // Calculate surface area
        double surfaceArea = Math.PI * radius * (radius + slantHeight);

        // Calculate volume
        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;

        // Output the results
        System.out.printf("Surface Area of the cone: %.2f\n", surfaceArea);
        System.out.printf("Volume of the cone: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}

