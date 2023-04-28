public class Country implements Measurable {
    
    private String name;
    private double area;
    
    public Country(String name, double area) {
        super();
        this.name = name;
        this.area = area;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    @Override
    public String toString(){
        return "Country [name: " + this.getName() + ", area: " + this.getArea() + "]";
    }

    @Override
    public double getMeasure() {
        return area;
    }
}
