
package datastructure1;

public class listNode {

    String info;
    listNode link;

    public listNode() {
        this.info = null;
        this.link = null;
    }
    
    public listNode(String info, listNode link) {
        this.info = info;
        this.link = link;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public listNode getLink() {
        return link;
    }

    public void setLink(listNode link) {
        this.link = link;
    }
    
    
    
    
    
}
