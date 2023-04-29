package homework;

import java.util.Scanner;

public class Q19 {

    static double harmonic(int n) {
        return 1.0 / n;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += harmonic(i);
        }

        System.out.println(String.format("The sum of the first %d terms of the harmonic series is %.2f", n, sum));
    }

}
