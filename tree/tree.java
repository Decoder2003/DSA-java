package tree;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class tree {
    Node root;

    tree(){
        root = null;
    }

    void insert(){

    }

    private Node insertRec(Node curNode, int data){
        if(curNode == null){
            curNode = new Node(data);
            return curNode;
        }
        if(curNode.data < data){
            curNode = insertRec(curNode.left, data);
        }
        else {
            curNode = insertRec(curNode.right, data)
        }
    }

    public static void main(String[] args) {
        
    }
}
