//import java.util.*;
public class Test {

    class Printit{
        
        public void printS(String s){
            System.out.println(s);
        }
    }
    
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newnode = new Node(data);

        if(head==null){
           head = newnode;
           tail = newnode; 
        }
        else{
           tail.next = newnode;
           tail = tail.next; 
        }

    }

    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("Linked list in empty");
        }
        else{
            while(current!=null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}

