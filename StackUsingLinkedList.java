/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

import java.io.*;
import java.util.*;

class Node{

    Node next;
    int data;

}

public class StackUsingLinkedList {
    
    public static Node head;
    public static Node tail;
    public static void push(int data){
    
        if(head == null){
        
            Node latest = new Node();
            latest.data = data;
            latest.next = head;
            head = latest;
            tail = latest;
            
        
        }
        
        else{
        
            Node late = new Node();
            Node temp = head;
            late.data = data;
            late.next = temp;
            head = late;
            
        
        }
        
    
    }
    
    public static int pop(){
    
     
        Node temp = head;
        
        head  = temp.next;
        return temp.data;
        
    
    }
    
    public static void print(){
    
        Node ne = head;

        while(ne != null){
        
            System.out.print(ne.data + "->");
            ne = ne.next;
        }        
        
    
    }
    
    public static void main(String[] args){
    
        head = null;
        tail = null;
        
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        push(100);
        print();
        
        System.out.println("\npopped element is" +pop());
        System.out.println("New list is ");
        print();
    }
    
}
