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
public class TwoStackInOneArray {
    
    //declare a new array , with the desired size
    
        int[] A = new int[10];
        
        int mid = A.length / 2;
        
        int counter1 = 0; // counter for stack1
        int counter2 = 0;  // counter for stack2
        
        int high = -1;
        int high2 = mid - 1;
        
        public void push(int e){
        
            if(counter1 == 0 && counter2 == 0){
            
                //if high does not exceeds its limit
                if(high < mid){
                
                    A[high + 1] = e;
                    high = high + 1;
                    counter1 = counter1 + 1;
                
                }
                
            
            
            }
            
            else if(counter1 > counter2){

                //high2 does not exceeds the array limit
                if(high2 < A.length - 1){
                
                    A[high2 + 1] = e;
            
                    high2 = high2 + 1;
                    counter2 = counter2 + 1;
                
                }
                
            }
            
            else{
            
                //to check that high does not exceeds the limit
                if(high < mid - 1){
                
                    A[high + 1] = e;
                    high = high + 1;
                    counter1 = counter1 + 1;                
                }
            
            
            }
            
        
        }
        
        
        public int pop(){
            
            int element = 0;
            if(counter1 > counter2){
            
             
                element = A[high];
                high = high - 1;
                counter1 = counter1 - 1;
            
                return element;
            
            }
            else{
            
                element = A[high2];
                high2 = high2 - 1;
            
                counter2 = counter2 - 1;
                return element;
            }
            
            
        
        
        }
        
        
        public void print(){
    
            System.out.println("Stack 1::");
            
            for(int i = 0 ; i <= high ; i++){
            
            
                System.out.print(A[i] + " ");
                
            
            }
            
            System.out.println("\nStack 2::");
            
            for(int i = mid ; i <= high2; i++){
            
            
                System.out.print(A[i] + " ");
                
            
            }

            

            
            
        
        
        }
    
    
    public static void main(String[] args){
    
        
        TwoStackInOneArray tsia = new TwoStackInOneArray();
        
        tsia.push(15);
        tsia.push(10);
        tsia.push(31);
        tsia.push(18);
        
        tsia.push(21);
        
        tsia.push(31);
        
        tsia.print();
        
        tsia.pop();
        tsia.pop();
        tsia.print();
        
        
        
    
    }
    
    
    
    
    
    
}
