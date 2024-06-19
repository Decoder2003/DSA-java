package tree;

public class BinaryTree {

    // Defining node for building tree
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    // BinaryTree implementation using arr
    // Preorder
    static class BuildBinaryTree {
        static int idx = -1;
        public static TreeNode buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }


    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BuildBinaryTree tree = new BuildBinaryTree();
        // TreeNode root = tree.buildTree(nodes);
        // System.out.println(root.val);
    }
}
