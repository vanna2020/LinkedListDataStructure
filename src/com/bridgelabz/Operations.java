package com.bridgelabz;

public class Operations {
    public static LinkedList addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
    }
    /*
   Created a method to add data at end.
    */
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    /*
   Created a method to add data in between.
    */
    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("after:");
        linkedList.print();

    }
    /*
   Created a method to delete first node.
    */
    public static void deleteFirstNode() {
        LinkedList linkedList = addDataAtStart();
        linkedList.pop();
        linkedList.print();
    }
    /*
   Created a method to delete last node.
    */
    public static void deleteLastNode() {
        LinkedList linkedList = addDataAtStart();
        linkedList.popLast();
        linkedList.print();
    }
    /*
    Created a method to delete last node.
    */
    public static void findNodeBasedOnValue() {
        LinkedList linkedList = addDataAtStart();
        linkedList.searchNode(30);
    }
}