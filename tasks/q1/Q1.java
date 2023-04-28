import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (number1 % number2 == 0) {
            System.out.println("The first number is divisible by the second number.");
        } else {
            System.out.println("The first number is not divisible by the second number.");
        }
    }
}
