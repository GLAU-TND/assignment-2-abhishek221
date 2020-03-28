/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 28-03-2020
 *  Time: 19:20
 */
package problem4.node;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}