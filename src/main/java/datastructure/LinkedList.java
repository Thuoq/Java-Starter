package datastructure;

class Node<T> {
    public T value;
    public Node<T> next = null;
}
class LinkedListClass<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    public void add(T value) {
        Node<T> node = new Node<T>();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    public void reverseLinkList(Node<T> head) {

        if(head == null) {
            return;
        }
        reverseLinkList(head.next);
        System.out.println(head.value);

    }
}

public class LinkedList {
    public static void main(String[] args) {

        LinkedListClass <Integer> list = new LinkedListClass<Integer>();
        list.add(1);
        list.add(2);

        list.reverseLinkList(list.getHead());
    }
}
