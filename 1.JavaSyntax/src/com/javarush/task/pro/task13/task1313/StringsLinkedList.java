package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newElement = new Node();
        if (this.first.next == null) {
            this.first.next = newElement;
            newElement.prev = null;
            newElement.value = value;
            newElement.next = null;
            this.last.prev = newElement;
        } else {
            Node current = this.first.next;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newElement;
            newElement.prev = current;
            newElement.value = value;
            newElement.next = null;
            this.last.prev = newElement;
        }



    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
