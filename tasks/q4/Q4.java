public class Main {
    public static void main(String[] args) {
        drawTriangle(5);
        drawUpsideDownTriangle(5);
    }

    public static void drawTriangle(int size) {
        System.out.println("     *");
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawUpsideDownTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}