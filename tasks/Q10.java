import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        System.out.println("Enter three integers:");
        int[] inputNumbers = new int[3];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < inputNumbers.length; i++) {
                inputNumbers[i] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : inputNumbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
