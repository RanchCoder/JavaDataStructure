/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

import java.util.*;
import java.io.*;
import DS.*;



public class QueueUsingLinkedList {

public static Node head;
public static Node tail;
public static void enqueue(int data){

    Node current = new Node();
    if(head == null){
    
        current.data = data;
        current.next = head;
        tail = current;
        head = current;
        
    }
    
    else{
    //we use a tail node to point the tail of the queue,once new node is added it will 
    // add the address of the new node to the current tail node's next
    //hence we can always enqueue in O(1) as we do not have to use the while loop to 
    // traverse the list and add the new element at the last of the queue.
        Node latest = new Node();
        latest.data = data;
        tail.next = latest;
        latest.next = null;
        tail = latest;
        
    
    }
    
   

}

public static void print(){

    Node temp = head;
    while(temp != null){
    
        System.out.print(temp.data+"->");
        temp = temp.next;
    }

    

}
    
public static int dequeue(){

    Node temp = head;
    head = temp.next;
    
    return temp.data;
    

}
    
    public static void main(String[] args){
    
        head = null;
        enqueue(5);
        enqueue(15);
        enqueue(25);
        enqueue(35);
        enqueue(45);
        enqueue(55);
        enqueue(65);
        print();
        System.out.println("\n"+dequeue());
        print();
    }
    
}
