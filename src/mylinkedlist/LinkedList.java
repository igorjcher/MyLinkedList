package mylinkedlist;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public void addToLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (first == null) {
            first = newNode;
            first.next = null;
            last = first;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void addToFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if(first == null) {
            first = newNode;
            last = first;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }
    
    public T removeFirst() {
        Node<T> node = first;
        if(node == null) {
            return null;
        } else if(node.next == null) {
            first = null;
            last = null;
            size--;
            return node.data;
        } else /*if (node.next != null)*/ {
            first = node.next;
            size--;
            return node.data;
        }
    }
    
    public T removeLast() {
        Node<T> node = last;
        if(node == null) {
            return null;
        } else if (first == last) {
            first = last = null;
            size--;
            return node.data;
        } else {
            Node<T> previous = getPrevious(node);
            previous.next = null;
            last = previous;
            size--;
            return node.data;
        }
    }
    
    private Node<T> getPrevious(Node<T> node) {
        Node<T> currentNode = first;
        while(currentNode.next != node) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void showAll() {
        Node<T> currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            System.out.print(" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    
    public void push(T data) {
        addToFirst(data);
    }
    
    public T pop() {
        return removeFirst();
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size <= 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }
}
