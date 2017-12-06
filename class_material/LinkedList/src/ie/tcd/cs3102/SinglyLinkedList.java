package ie.tcd.cs3102;

public class SinglyLinkedList {
    private Node head;
    private int count;

    SinglyLinkedList() {
        head = null;
        count = 0;
    }

    public boolean contains(int n) {
        for (Node current = head; current != null; current = current.next) {
            if (n == current.value) {
                return true;
            }
        }
        return false;
    }

    public SinglyLinkedList push(int n) {
        head = new Node(n, head);
        count += 1;
        return this;
    }

    public SinglyLinkedList insert(int n) {
        Node current, previous;
        for (current = head, previous = null;
             current != null && current.value < n;
             previous = current, current = current.next) {

        }
        if (previous == null) {
            head = new Node(n, head);;
        } else {
            previous.next = new Node(n, previous.next);;
        }
        count += 1;
        return this;
    }

    public SinglyLinkedList remove(int n) {
        for (Node current = head, previous = null;
             current != null;
             previous = current, current = current.next) {

            if (n == current.value) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                count -= 1;
                break;
            }
        }
        return this;
    }

    public int size() {
        return count;
    }

    public String toString() {
        String s = "[";
        for (Node current = head; current != null; current = current.next) {
            if (current != head) {
                s += ", ";
            }
            s += current.value;
        }
        return s + "]";
    }

    class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
