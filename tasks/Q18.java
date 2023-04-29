package homework;

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        
        System.out.println("Enter five integers:");
        int[] numbers = new int[5];
        int sum = 0;
        
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }
        }
        
        for (int num : numbers) {
            sum += num;
        }
     
        double average = (double) sum / numbers.length;
        System.out.println("The average is: " + average); 
    }

}
