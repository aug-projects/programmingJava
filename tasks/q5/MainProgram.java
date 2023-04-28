import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class MainProgram {
    public static void main(String[] args) {
        Set<Country> countriesByArea = new TreeSet<>(new CountryAreaComparator());
        Set<Country> countriesByPopulation = new TreeSet<>(new CountryPopulationComparator());

        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("countries.txt"));
            String line = inputStream.readLine();

            while (line != null) {
                String[] tokens = line.split(",");
                String name = tokens[0];
                int area = Integer.parseInt(tokens[1]);
                int population = Integer.parseInt(tokens[2]);
                Country country = new Country(name, area, population);
                countriesByArea.add(country);
                countriesByPopulation.add(country);

                line = inputStream.readLine();
            }

            inputStream.close();
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }

        System.out.println("Countries sorted by area:");
        for (Country country : countriesByArea) {
            System.out.println(country);
        }

        System.out.println("--------------------");

        System.out.println("Countries sorted by population:");
        for (Country country : countriesByPopulation) {
            System.out.println(country);
        }
    }
}
