/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 28-03-2020
 *  Time: 19:40
 */
package problem3.node;

import problem5.student.Student;

public class Node {
    private Student student;
    private Node next;

    public Node(Student student) {
        this.student = student;
        next = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}