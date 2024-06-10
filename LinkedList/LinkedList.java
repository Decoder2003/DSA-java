package LinkedList;

public class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    LinkedList(){
        this.head = null;
    }

    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node curNode = head;
        
    }
    
    void showData(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
    }
}