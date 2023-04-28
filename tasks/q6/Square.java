import java.util.Scanner;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
        System.out.println("Square created with side " + this.side + " and color " + this.color);
    }

    public Square() {
        super();
        System.out.println("Square created with side " + this.side + " and color " + this.color);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new color, the current is " + this.getColor());
        this.setColor(scanner.nextLine());
        System.out.println("Enter a new side length, the current is " + this.getSide());
        this.setSide(scanner.nextDouble());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
