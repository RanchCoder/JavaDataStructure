/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 *
 */
import java.io.*;
import java.util.*;

//complete linked list (Singly)
public class SinglyLinkedListComplete {

    public static Node head;

    //to insert an element in the list
    public static String insert(int e) {

        if (head == null) {

            Node first = new Node();
            first.data = e;
            first.next = head;
            head = first;
            return "Insert successFul, the list was empty";

        } else {

            Node later = new Node();
            later.data = e;
            later.next = head;
            head = later;
            return "insert successful the list is not empty";

        }

    }

    //to delete an element in the list
    public static void delete(int key) {

        // Node toDel = head;
        Node temp = head;

        while (temp.next.data != key) {

            temp = temp.next;

        }
        temp.next = temp.next.next;

    }

    //to search an element in the list
    public static String search(int key) {

        Node temp = head;
        while (temp.data != key && temp.next != null) {

            temp = temp.next;

        }

        if (temp.data == key) {

            return "success";
            //System.out.println("success");

        } else {

            return "failure";

        }
    }

    //to print()
    public static void print() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        head = null;
        System.out.println(insert(4));
        System.out.println(insert(10));
        System.out.println(insert(14));

        System.out.println(insert(24));
        System.out.println(insert(30));
        System.out.println(insert(54));
        print();
        System.out.println("");
        delete(10);
        print();
        //String result = search(11);

        System.out.println("\nresult of search :: " + search(90));
    }

}
