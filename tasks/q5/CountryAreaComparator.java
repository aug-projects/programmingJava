
package assigment6;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return Long.compare(o1.getArea(), o2.getArea());
    }  
}
