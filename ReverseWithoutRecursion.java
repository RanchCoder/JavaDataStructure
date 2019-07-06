/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Reverse{

    int data;
    Reverse next;
}
public class ReverseWithoutRecursion {
    Reverse tail;
    Reverse head;
    public void insert(int data){
    
        if(head == null){
        
            Reverse first = new Reverse();
            first.data = data;
            first.next = head;
            head = first;
            tail = first;
        }
        else{
        
            Reverse temp = head;
            Reverse temp2 = new Reverse();
            while(temp.next != null){
            
                temp = temp.next;
                
            }
            
            temp2.data = data;
            temp2.next = null;
            temp.next = temp2;
            tail = temp2;
            
        }
        
    }
    
    public void print(){
    
        Reverse temp = head;
        while(temp != null){
        
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    
    public void reverse(){
    
        while(head.next != null){
        
            Reverse temp = head;
            Reverse temp2 = head;
            
            while(temp2.next != null){
            
                temp = temp2;
                temp2 = temp2.next;
                
            }
            temp2.next = temp;
            temp.next = null;
            
        }
        
         
    }
    public void printReverse(){
    
        while(tail != null){
        
            System.out.print(tail.data + "->");
            tail = tail.next;
        
            
        }
    
    }
    
    public static void main(String[] args){
        ReverseWithoutRecursion rwr = new ReverseWithoutRecursion();
        
        rwr.insert(5);
        rwr.insert(10);
        rwr.insert(15);
        rwr.insert(25);
        
        rwr.print();
        System.out.println("\nNow printing the list in reverse manner :: ");
        rwr.reverse();
        rwr.printReverse();
    }
    
}
