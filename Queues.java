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
public class Queues {

    //head pointing to null location and tail pointing to first location in array.
    public static int head = -1;
    public static int tail = 0;

    public static int front(int[] A) {
        return (head + 1) % A.length;
    }

    public static boolean isEmpty() {

        if (head == -1 && tail == 0) {

            return true;

        } else {

            return false;

        }

    }

    public static boolean isFull(int[] A) {

        if ((tail + 1) % A.length == head) {

            return true;

        } else {
            return false;
        }

    }

    public static void enqueue(int[] A, int e) {
        //to check if the queue is full
        if (isFull(A) == true) {

            System.out.println("Overflow");

        }
        //to check is queue is empty
        else if (isEmpty() == true) {

            A[(head + 1) % A.length] = e;
            tail = (tail + 1) % A.length;
            head = (head + 1) % A.length;
            System.out.println("success");
        } else {

            A[(tail + 1) % A.length] = e;
            tail = (tail + 1) % A.length;

            System.out.println("Success");
        }

    }

    public static void dequeue(int[] A) {

        if (isEmpty() == true) {

            System.out.println("Underflow");

        } else if (head == tail) {

            head = -1;
            tail = 0;

        } else {

            //in circular fashion we dequeue the queue , and return the head using modulus operator.
            head = (head + 1) % A.length;

            System.out.println(A[((head + A.length) - 1) % A.length]);

        }

    }

    public static void peek(int[] A) {

        if (isEmpty() == false) {

            System.out.println(A[(head % A.length)]);

        } else {
            return;
        }

    }
    
    public static int tail(int[] A){
    
        if(!isEmpty()){
        
            return (tail - 1);
        
        }
        
        else{
        
            return -1;
        
        }
        
    
    }

}
