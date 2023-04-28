
package generics;

import static generics.MyMethod.*;


public class Generics {
    public static void main(String[] args) {
        
        Double[]  haytham   = {20.0,30.0,50.3};
        Integer[] haytham1  = {20,30,50};
        String[]  haytham3  = {"hay","tham"};


        
        printArray(haytham);
        printArray(haytham1);
        printArray(haytham3);
        
        System.out.println(getMiddle(haytham)); 
        System.out.println(getMiddle(haytham1));
        System.out.println(getMiddle(haytham3));


        
    }
}
