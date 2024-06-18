package tree;

class TreeNode{
    int data;
    TreeNode left, right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class main {
    TreeNode root;

    main(){
        root = null;
    }

    private TreeNode insertRec(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (root.data > data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    private

    public static void main(String[] args) {
        main tree = new main();

        
    }
}
