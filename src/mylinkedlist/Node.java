package mylinkedlist;

@Deprecated
public class Node {
    private int data;
    public Node next;

    public Node() {
    }

    public Node(Node next) {
        this.next = next;
    }
    
    public int getData() {
        return data;
    }
}
