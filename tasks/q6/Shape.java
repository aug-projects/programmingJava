public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        this("No color");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void setData();
}
