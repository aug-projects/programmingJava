
package assigment6;

import java.io.Serializable;

public class Country implements Serializable{

    private String name;
    private int area;
    private int population;

    public Country(String name, int area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country [name=" + name + ", area=" + area + ", population=" + population + "]";
    }
}
