/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

/**
 *
 * @author Dell
 */
import java.io.*;
import java.util.*;

class  Node {

    Node next;
    int data;

    Node() {

    }

}

public class SinglyLinkedList {

    //setting the head node as null, in the beginning, later on it will be updated
    static Node head;
    
    public static void insert(int data) {

        if (head == null) {

            Node latest = new Node();
            latest.data = data;
            latest.next = head;
            head = latest;
            

    }
        
        else{
            
            Node following = new Node();
            Node temp = head;
            
            while(temp.next != null){
            
                temp = temp.next;
            
            }
            following.data = data;
            temp.next = following;
            following.next = null;
            
        
        }
     
        
        
    }

    public static void print() {

        Node print = head;
        

        //we can go into infinite loop if we do not increment the position of print by print.next address.
        //else it will go on printing the same element again and again. since print.head contains single element and 
        // will always return not null
        
       while(print != null){
       
           System.out.print(print.data + "->");
           print = print.next;
       
       }
    }

    

}
