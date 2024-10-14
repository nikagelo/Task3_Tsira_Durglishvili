package ge.credo;

import java.util.Scanner;


public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exchange rate from USD to EUR
        System.out.print("Enter the exchange rate from USD to EUR: ");
        double exchangeRate = scanner.nextDouble();

        // Input amount in USD to be exchanged
        System.out.print("Enter the amount in USD to be exchanged: ");
        double amountInUSD = scanner.nextDouble();

        // Input exchange fee percentage
        System.out.print("Enter the exchange fee percentage: ");
        double feePercentage = scanner.nextDouble();

        // Calculate EUR received after deducting the fee
        double eurReceived = amountInUSD * exchangeRate * (1 - (feePercentage / 100));

        // Output the result
        System.out.printf("Amount of EUR received: %.2f\n", eurReceived);

        // Close the scanner
        scanner.close();
    }
}
