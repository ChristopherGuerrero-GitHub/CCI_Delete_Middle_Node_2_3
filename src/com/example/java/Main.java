package com.example.java;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution to CCI book problem 2.3 Delete Middle Node. Created a LinkedListNode chain of a
            string data types. Then invoke the deleteNode method and pass the LinkedListNode chain as a parameter
            and create a LinkedListNode next object. Copy the data from the next node over to the current node, and
            then delete the next node.
         */

        //Creating LinkedListNode objects
        LinkedListNode node_1 = new LinkedListNode("a");
        LinkedListNode node_2 = new LinkedListNode("b");
        LinkedListNode node_3 = new LinkedListNode("c");
        LinkedListNode node_4 = new LinkedListNode("d");
        LinkedListNode node_5 = new LinkedListNode("e");
        LinkedListNode node_6 = new LinkedListNode("f");

        //Chaining the LinkedListNode objects
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;

        LinkedListNode curr = node_1;

        System.out.println("Printing out the linkedList nodes: ");

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }

        deleteNode(node_3);

        curr = node_1;
        System.out.println("Printing out the LinkedList of node after a deletion of a node: ");

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }



    }

    /*
        The deleteNode method accepts a LinkedListNode chain as a parameter and create a LinkedListNode
        next object. Copy the data from the next node over to the current node, and then delete the next node.
     */
    static boolean deleteNode(LinkedListNode n){

        if (n == null || n.next == null){
            return false;   //failure
        }

        LinkedListNode next = n.next;
        //copy the data from the next node over to the current node, and then delete
        //the next node.
        n.data = next.data;
        n.next = next.next;
        return true;

    }

}
