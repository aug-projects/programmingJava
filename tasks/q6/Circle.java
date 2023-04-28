import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        System.out.println("Circle created with radius " + radius + " and color " + color);
    }

    public Circle() {
        super();
        System.out.println("Circle created with radius " + radius + " and color " + color);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new color, the current is " + this.getColor());
        this.setColor(scanner.nextLine());
        System.out.println("Enter a new radius, the current is " + this.getRadius());
        this.setRadius(scanner.nextDouble());
    }
}
