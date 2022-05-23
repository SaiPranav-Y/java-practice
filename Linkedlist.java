import java.io.*;

public class Linkedlist{

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Creating the head and tail for the single linked list
    public Node head = null;
    public Node tail = null;

    // Method to add a new node
    public void addNode(int data){
        Node newnode = new Node(data);

        if(head==null){
            head = newnode; // Assigning head and tail as the new node
            tail = newnode;
        }
        else{
            tail.next = newnode; // Here tail as the pointer which adds new node
            tail = newnode;
        }

    }

    public void display(){
        Node current = head;
        if( head ==null){ // To check if the linked list is not created
            System.out.println("Linked List is empty");
        }
        else{
            while(current!=null){ // taken current so that main linked list data is not lost/temp variable
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Linkedlist list1 = new Linkedlist();
        list1.addNode(10);
        list1.addNode(20);

        list1.display();
    }


}