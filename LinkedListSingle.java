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
import DS.*;

public class LinkedListSingle {
    
    public static void insert(int data){
    
        SinglyLinkedList.insert(data);
        
        
    
    }
    
    public static void main(String[] args){
    
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        insert(45);
        insert(55);
        insert(65);   
        SinglyLinkedList.print();
    }
    
    
}
