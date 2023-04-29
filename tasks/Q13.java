package homework;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int inputNumber = scanner.nextInt();
        
        if (isPrime(inputNumber)) {
            System.out.println(inputNumber + " is a prime number");
        } else {
            System.out.println(inputNumber + " is not a prime number");
        }
    }
    
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
