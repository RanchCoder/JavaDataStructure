
/*
we are given two queue, we demonstrate stack operation using those two queue
we have two methods enqueue , pop

enqueue simply adds elements to queue1;

if  pop() operation
 1)first we check if q1 is empty() i.e no element in q1
 2) then we check if q2 is empty() i.e no element in q2
  2.a)if q2 is not empty then we simply start popping elements from the queue till we have only
       one element in the queue (q2).When we have only one element left in the queue q2 we stop the while loop
       and then we return the single element of the queue q2. 
3) else if q1 is not empty then we simply pop elements from the q1 till we have the last element in the queue.
   once we have only single element left in the queue , we return the last element

and this demonstrates the operation of stack using two queue.
    

 */

import java.io.*;
import DS.*;
import java.util.*;

public class StackUsingTwoQueue {
    
    //
    public static Queue<Integer> q1 = new LinkedList<>();
    public static Queue<Integer> q2 = new LinkedList<>();
    
    public static void enqueue(int a){
 
        //adding elements to queue
        q1.add(a);
        
    
    
    }
    
    public static int pop(){
    
        //popping
        
        if(q1.isEmpty()){
            
            if(q2.isEmpty()){
            
                return -1;
        
            
            }
            
            else{
            
                while(q2.size()!= 1){
                
                    q1.add(q2.remove());
                
                }
                
                return q2.remove();
            
            }
        
            
        }
        
        else{
        
            while(q1.size()!=1){
            
                q2.add(q1.remove());
            
            }
            
            return q1.remove();
        
        
        }
        
        
    
    }
   
    public static void main(String[] args){
    
        enqueue(5);
        enqueue(15);
        enqueue(25);
        enqueue(35);
        
        System.out.println("POP ::" +pop());
        
        enqueue(65);
        enqueue(55);
        enqueue(45);
        
        System.out.println("POP ::" +pop());
        
    
        
        
    }
    
    
    
}
