public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 13, 15};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
