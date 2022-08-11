import java.util.*;
import java.io.*;

class BinarySearchTree{
    
    // first create Node
    
    class Node{
        int key;
        Node left, right;
        
        public Node(int data){
            key = data;
            left = right = null;
        }
        
    }
    
    // Create root
    
    Node root;
    
    // Create constructor for BinarySearchTree to get data
    
    // One no argument constructor to initiliaze root
     BinarySearchTree(){
         root = null;
     }
     
    // One constructor with data argument
    BinarySearchTree(int value){
        root = new Node(value);
    }
    
    // METHODS TO INSERT AND PRINT
    
    Node insertRec(Node root, int key){
        if(root==null){
            root = new Node(key);
            return root;
        }
        // If key less than root.key, then insert in left
        else if(key<root.key){
            root.left = insertRec(root.left, key);
        }
        // If key more than root.key, then insert in right
        else if(key>root.key){
            root.right = insertRec(root.right,key);
        }
        
        return root;
    }
    
    void insert(int key){
        root = insertRec(root, key);
    }
    
    void inorderRec(Node root){
        // LEFT - ROOT - RIGHT
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
    void inorder(){
        inorderRec(root);
    }
}

public class Main{
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        
        tree.inorder();
    }
}