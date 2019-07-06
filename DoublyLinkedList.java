class NodeDouble{

    public int data;
    public NodeDouble prev;
    public NodeDouble next;
    
    public void displayData(){
    
        System.out.println(data);
        
    }

}

public class DoublyLinkedList{
    NodeDouble head;
    NodeDouble tail;
    public void insert(int data){
    
        NodeDouble temp = new NodeDouble();
        
        if(head == null){
        
            temp.data = data;
            temp.next = head;
            temp.prev = null;
            head = temp;
            tail = temp;
            
        }
        
        else{
        
           temp.data = data;
           temp.prev = null;
           temp.next = head;
           head.prev = temp;
           
           head = temp;
        
        }
    
    }
    
    public void displaybackWard(){
    
        NodeDouble temp = tail;
        
        while(temp != null){
        
            System.out.println(temp.data);
            temp = temp.prev;
        }
    
    }
    public void display(){
    
        NodeDouble temp = head;
        while(temp != null){
        
            System.out.println("->"+temp.data);
            temp =temp.next;
        }
    }
    
    public void delete(int data){
    
        NodeDouble temp = head;
        
        while(temp.data != data){
        
            temp = temp.next;
        
        }
        
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    
    }
    public void insertLast(int data){
    
        NodeDouble temp = new NodeDouble();
        temp.data = data;
        NodeDouble temp2 = tail;
        temp2.next = temp;
        temp.prev = temp2;
        temp.next = null;
        tail = temp;
        
    }
    
    public void search(int data){
    
        NodeDouble temp = head;
        int temp1 = 0;
        while(temp != null){
        
            if(temp.data == data){
        
                temp1 = 1;
                break;
        }
            
        else{
             temp1 = 0;
             temp = temp.next;
        
        }
            
            
            
        }
        
        if(temp1 == 1){
        
            System.out.println("found, contains");
        
        }
        else{
            System.out.println("Not found , does not contains");}
        
        
    
    }

public static void main(String[] args){

    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insert(4);
    dll.insert(14);
    dll.insert(166);
    dll.display();
    dll.displaybackWard();
    dll.delete(14);
    dll.display();
    dll.displaybackWard();
    dll.insertLast(2344);
    dll.display();
    dll.search(2344);
    dll.search(4);
    dll.search(15);
    dll.search(145);
            
}
}