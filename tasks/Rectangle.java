public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", area=" + getArea() + "]";
    }

    public static void main(String[] args) {

        Rectangle[] rectangles = { new Rectangle(10, 20), new Rectangle(10, 20), new Rectangle(10, 20) };

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

}
