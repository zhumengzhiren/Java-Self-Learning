public class FooCorporation {
    
    public static void calculatePay(double basePay, double hoursWorked) {
        // Define the minimum wage and the maximum working hours
        final double MIN_WAGE = 8.00;
        final double MAX_HOURS = 60.00;

        // Check for errors
        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay is below minimum wage.");
            return;
        }
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceeds maximum allowed.");
            return;
        }

        // Calculate total pay
        double totalPay;
        if (hoursWorked > 40) {
            double regularPay = 40 * basePay;
            double overtimePay = (hoursWorked - 40) * (basePay * 1.5);
            totalPay = regularPay + overtimePay;
        } else {
            totalPay = hoursWorked * basePay;
        }

        // Print the total pay
        System.out.println("Total pay for the employee: $" + totalPay);
    }

    public static void main(String[] args) {
        // Employee 1
        calculatePay(7.50, 35); // Expected output: Error: Base pay is below minimum wage.

        // Employee 2
        calculatePay(8.20, 47); // Expected output: Total pay for the employee: $414.7

        // Employee 3
        calculatePay(10.00, 73); // Expected output: Error: Hours worked exceeds maximum allowed.
    }
}
