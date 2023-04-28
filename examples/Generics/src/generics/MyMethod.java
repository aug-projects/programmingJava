
package generics;

public class MyMethod {
    
    /*
    public static <type> type getMiddle()
    
    ***** <type> => type of var
    ***** type   => return value

    */
    
    // print data
    public static <T> void printArray( T a[]){
        
        for(int i =0 ; i<a.length;i++){
            System.out.print(a[i] +" ,  ");
        }
        System.out.println("\n**********************");
    }

    // get the middle elmement of the array
    public static <type> type getMiddle(type[] a){
        return a[a.length/2];
    }


}
