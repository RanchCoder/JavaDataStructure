/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

import DS.*;

public class Stack1 {
    
    public static void main(String[] args){
    
        int[] S = new int[10];
        
        Stacks.push(5, S);
        Stacks.push(3, S);
        Stacks.print(S);
        
        Stacks.pop(S);
        Stacks.print(S);
        
      
    }
    
}
