
package datastructure1;

public class LinkedList {

    listNode firstNode;
    int lenght;
    
    public int size(){
        return lenght;
    }
    
    public void print(){
        listNode n;
        n = firstNode;
        while(n != null){
            System.out.println(n.info);
            n = n.link;
        }
    }
    
    
    public listNode search(String name){
        listNode n;
        n = firstNode;
        while (n != null){
            if( !name.equals(n.info))
                n = n.link;
            else
                return n ; 
        }
        return n;
    }
    
    public void insertsNewNode(String info){
        
        listNode n = new listNode();
        n.info=info;
        
        if(lenght == 0)
        return ;
        
        n.link = firstNode.link;
        firstNode.link = n;
        lenght ++;
    } 
    
    public void deleteNodeHead(){
        listNode myFirst;
      if (firstNode != null){
          
          if(firstNode.link == null){
              firstNode = null;
              lenght--;
          }else{
              myFirst =firstNode;
              firstNode =firstNode.link;
              myFirst.link =null;
              lenght--;
          }
            
          
      }
      
        
    }     
    public void deleteLast(){
        
        listNode prev , current;
        if (firstNode != null){
            if (firstNode.link == null){
                firstNode = null;
                lenght--;
            }else{
                prev = firstNode;
                current = firstNode.link;
                while (current.link != null)
                {
                prev = current;
                current = current.link;
                }
                prev.link = null;
                lenght--;
            }
        }
        
        
    }
}
