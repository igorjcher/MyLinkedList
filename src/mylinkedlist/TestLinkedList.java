package mylinkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        for (int i = 0; i < 50; i++) {
            myLinkedList.addToFirst(i);
        }
        myLinkedList.showAll();
        System.out.println(myLinkedList.size());
        
        while (!myLinkedList.isEmpty()) {
            //System.out.print(myLinkedList.removeFirst());
            System.out.print(myLinkedList.removeLast());
            System.out.print(" ");
        }
        System.out.println();
    }  
}
