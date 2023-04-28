import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        while (true) {
            System.out.println("------------------------- Main program -------------------------");
            System.out.println("--- [c], [s] Choose a new shape: c for circle, s for square");
            System.out.println("--- [T] - Set attributes");
            System.out.println("--- [A] - Compute area");
            System.out.println("--- [P] - Compute perimeter");
            System.out.println("--- [e] - Exit");
            System.out.println("--- Enter your choice");

            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "c":
                    shape = new Circle();
                    break;
                case "s":
                    shape = new Square();
                    break;
                case "t":
                    if (shape != null) {
                        shape.setData();
                    }
                    break;
                case "a":
                    if (shape != null) {
                        System.out.println("The area is: " + shape.getArea());
                    }
                    break;
                case "p":
                    if (shape != null) {
                        System.out.println("The perimeter is: " + shape.getPerimeter());
                    }
                    break;
                case "e":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
