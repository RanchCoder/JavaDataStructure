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

public class QueueTest {

    public static void main(String[] args) {

        try {

            int[] A = new int[10];

            
            Queues.enqueue(A,10);
            Queues.enqueue(A, 15);
            //Queues.peek(A);
            
            //Queues.dequeue(A);
 
             Queues.enqueue(A,10);
            Queues.enqueue(A, 15);
            //Queues.peek(A);
            Queues.enqueue(A,10);
            Queues.enqueue(A, 15);
            //Queues.peek(A);
            Queues.enqueue(A,10);
            Queues.enqueue(A, 15);
            //Queues.peek(A);
            Queues.enqueue(A,10);
            Queues.enqueue(A, 15);
            //Queues.peek(A);
            Queues.enqueue(A,10);
            Queues.enqueue(A, 15);
            //Queues.peek(A);
           
            int tail = Queues.tail(A);
            System.out.println("tail is :: " + tail);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
