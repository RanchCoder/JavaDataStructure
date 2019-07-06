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

class Node2{

    static Node next;
    static Node prev;
    static int data; 
   
}

public class CircularLinkedList {

    public static Node head;
    public static Node tail;
    public static void insert(int i){
    
        if(head == null){
        
            Node first = new Node();
            first.data = i;
            first.next = head;
            head = first;
            tail = first;
        
        }
        else{
            
            Node later = new Node();
            later.data = i;
            later.next = head;
            //tail = head;
            head = later;
        
            Node2.next = head;
            Node2.prev = tail;
               
            //System.out.print( Node2.next.data + "->");
            
            
        
        }
        
    }
    public static void print(){
    
        Node temp = Node2.next;
      
        
        while(temp != null){
        
            System.out.print(temp.data + "->");
            temp = temp.next;
        
        }
        System.out.println("\nhead of the circular linked list is :: " + Node2.next.data);
        System.out.println("tail of the circular linked list is :: " +Node2.prev.data);
        
    }
    
    public static void delete(int i){
    
        System.out.println("performing a delete ");
        Node temp  = Node2.next;
        if(i == temp.data){
        
            head = temp.next;
            Node2.next = head;
        }
        
        else{
        
            while(temp.next.data != i){
                
                temp = temp.next;
            
            }
            if(temp.next == Node2.prev){
            
                Node2.prev = temp;
            }
            temp.next = temp.next.next;
            
        
        }
        
    }
    public static void search(int i){}
    
    public static void main(String[] args){
    
        head = null;
        tail = null;
        
        insert(10);
        insert(25);
        insert(35);
        insert(45);
        insert(55);
        print();
        delete(55);
        print();
        delete(10);
        print();
        
        
    }
    
}
