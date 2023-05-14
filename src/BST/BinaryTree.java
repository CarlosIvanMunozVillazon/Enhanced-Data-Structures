package BST;

public class BinaryTree {

    private static class Node {

        private Node left;
        private int data;
        private Node right;

        public Node() {

        }

        public Node(int data) {
            left = null;
            this.data = data;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BinaryTree() {
        this.root = null;
        this.size = 0;

    }

    private void inOrder(Node root) {

        if (root.left != null) {
            inOrder(root.left);
        }

        System.out.print(root.data + " ");

        if (root.right != null) {
            inOrder(root.right);
        }
    }

    public void printInOrder() {
        System.out.println("In order: ");
        inOrder(this.root);
        System.out.println();
    }

    private void preOrder(Node root) {

        /*if (root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }*/
        System.out.print(root.data + " ");

        if (root.left != null){
            preOrder(root.left);
        }

        if (root.right != null){
            preOrder(root.right);
        }

    }

    public void printPreOrder() {
        System.out.println("Pre order: ");
        preOrder(this.root);
        System.out.println();
    }

    private void postOrder(Node root) {

        /*if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }*/

        if (root.left != null) {
            postOrder(root.left);
        }

        if (root.right != null) {
            postOrder(root.right);
        }

        System.out.print(root.data + " ");
    }

    public void printPostOrder() {
        System.out.println("Post order: ");
        postOrder(this.root);
        System.out.println();
    }

    private Node insert(int data, Node root) {

        if (root == null) {
            root = new Node(data);
            this.size++;
        } else if (data != root.data) {
            if (data < root.data) {
                root.left = insert(data, root.left);
            } else {
                root.right = insert(data, root.right);
            }
        }

        return root;
    }

    public void insertData(int newData) {
        this.root = insert(newData, this.root);
    }

    //Find the minimum

    private Node findMinimum (Node root) {
        if (root != null){
            while (root.left != null){
                root = root.left;
            }
        }

        return root;
    }

    public int findMinorValue() {
        Node returnNode = findMinimum(this.root);
        return returnNode.data;
    }

    private Node findMaximum (Node root) {
        if (root != null){
            while (root.right != null){
                root = root.right;
            }
        }

        return root;
    }

    public int findMaxValue() {
        Node returnNode = findMaximum(this.root);
        return returnNode.data;
    }

    public int getSize() {
        return size;
    }
}
