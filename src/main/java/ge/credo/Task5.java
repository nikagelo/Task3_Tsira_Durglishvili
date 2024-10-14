package ge.credo;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to hold scores and weights
        double[] scores = new double[5];
        double[] weights = new double[5];

        // Input scores and weights
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();

            System.out.print("Enter weight for score " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
        }

        // Calculate weighted average
        double weightedSum = 0.0;
        double totalWeights = 0.0;

        for (int i = 0; i < 5; i++) {
            weightedSum += scores[i] * weights[i];
            totalWeights += weights[i];
        }

        // Compute the weighted average
        double weightedAverage = weightedSum / totalWeights;

        // Output the result
        System.out.printf("The weighted average is: %.2f\n", weightedAverage);

        // Close the scanner
        scanner.close();
    }
}
