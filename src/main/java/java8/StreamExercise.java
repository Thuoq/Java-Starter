package java8;

import java.util.stream.Stream;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StreamExercise {
    public static void main(String[] args) {
        Stream<Node> streamI = Stream.of(new Node(1), new Node(2), new Node(3));
        streamI.forEach(node -> System.out.println(node.data));
    }
}
