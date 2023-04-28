
package datastructure1;

public class DataStructure1 {
    public static void main(String[] args) {
      
        listNode n1 = new listNode("haytham",null);
        listNode n2 = new listNode("ahmed",null);
        listNode n3 = new listNode("ali",null);
        
        
        LinkedList L1 = new LinkedList ();    
        L1.firstNode = n1;
        L1.lenght = 3;
        L1.insertsNewNode("del");
        L1.insertsNewNode("saied");
        L1.insertsNewNode("salama");
        

        L1.deleteNodeHead();

        L1.print();

        
    }
    
}
