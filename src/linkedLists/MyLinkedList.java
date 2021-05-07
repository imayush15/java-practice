package linkedLists;

public class MyLinkedList<E> {


    //    Creating a node for linked list
    static class Node<E> {
        E data;
        Node next;

//        Constructor for Node class
        Node(E data) {
            this.data = data;
            next = null; // Initially this does not point to any other node
        }
    }

    Node<E> head;

    public void add(E data) {
//        We need node that is to be added
        Node<E> toAdd = new Node<>(data);

//        New node temp for traversal to the end
        Node<E> temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
//        Adding toAdd node at last
        temp.next = toAdd;

    }
}