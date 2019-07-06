/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell

*/


// we use two stacks , to represent a queue , we select an element from the top of the
// stack2 as oldest elements will be added on top of stack2 , hence it can represent queue datastructure
// QUEUE represents FIFO , thats is oldest element is removed first and stack in the inverse of STACK
//STACK removes most recent elements added to the stack.


import java.util.*;

public class QueueUsingTwoStack {
    
    //declaring two stacks to perform stack operation
        static Stack<Integer> st1 = new Stack<Integer>();
        static Stack<Integer> st2 = new Stack<Integer>();
        
    
        public static void enqueue(int e){
        
            st1.push(e);
            
            Iterator<Integer> itr = st1.iterator();
                
                while(itr.hasNext()){
                
                    //st1.push(st1.pop());
                    System.out.print(itr.next() + " ");
                
                }
                System.out.println("");
        
        
        }
        
        public static void dequeue(){
        
            //if stack 2 is not empty , then we pop from it.
            
            if(!st2.isEmpty()){
            
                System.out.println("Popped element is ::" + st2.pop());
            
            }
            // if stack 1 is empty that means no more elements added to the queue, hence we display no elements in queue.
            else if(st1.isEmpty()){
            
                System.out.println("No element in the queue");
            }
                   
            //if stack2 is empty and new elements are added in stack1 then we inverse the stack1 by popping from stack1 and pushing it to stack2.
            if(st2.isEmpty()){
            
                Iterator<Integer> itr = st1.iterator();
                
                while(itr.hasNext()){
                
                    st2.push(st1.pop());
                
                }
                

             
                Iterator<Integer> itr2 = st2.iterator();
                
                while(itr2.hasNext()){
                
                    System.out.print(itr2.next() + " ");
                
                }
                System.out.println("");
             
            }
            
            
        
        
        }
    
    public static void main(String[] args){
    
        enqueue(10);
        enqueue(20);
        
        enqueue(40);
        
        dequeue();
        
        
        
        enqueue(50);
        enqueue(60);
        
        enqueue(70);
        
        enqueue(80);
        enqueue(90);
        
        enqueue(140);
        
        enqueue(100);
        enqueue(200);
        
        enqueue(400);
        
        dequeue();
        
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
    
    }
    
}
