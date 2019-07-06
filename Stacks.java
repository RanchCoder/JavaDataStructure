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
public class  Stacks {
    
   public Stacks(){}
    
    static int high = -1;
   
    //peeking the top of the stack
    public static int top(int A[]){

        return high - 1;
    }
    
    //pushing at the top of the stack
    public static String push(int e,int[] A){
    
        if(high < A.length - 1){
        
            A[high + 1] = e;
            high = high + 1;
        
            return "Successfully pushed the element";
        }
        
        else{
        
            return "Unsuccessful";
        
        }
    
    }
    
    //popping an element
    public static int pop(int[] A){
    
        //to check if the base element of array is not null
        if(A.length == 0){
        
            return 0;
        
        }
        
        
        else{
        
            int popped = 0;
            if(high >= 0){
        
                popped = A[high];
                high = high - 1;
                
                
            
            
            }
            
            
        
            return popped;
        }
        
    
        
    }
    
    //printing the elements in the stack.
    public static void print(int[] A){
        
        for(int i = 0 ; i <= high ; i++){
        
            System.out.println(A[i]);
        
        
        }
        
    
    
    
    }  
    
    
}
