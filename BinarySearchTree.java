import java.util.*;

class Node{
    Node left = null;
    Node right = null;
    int data;
}

public class BinarySearchTree{
    Node root;

    public void preorderTraversalBstree(Node current){
        if(current==null){
            return;
        }

        System.out.print(current.data + " ");
        preorderTraversalBstree(current.left);
        preorderTraversalBstree(current.right);
    }

    public void inorderTraversalBstree(Node current){
        if(current==null){
            return;
        }

        inorderTraversalBstree(current.left);
        System.out.print(current.data + " ");
        inorderTraversalBstree(current.right);
    }

    public void postorderTraversalBstree(Node current){
        if(current==null){
            return;
        }

        postorderTraversalBstree(current.left);
        postorderTraversalBstree(current.right);
        System.out.print(current.data + " ");
    }

    public Node perfromInsertion(int[] arr){
        root = new Node();
        root.data = arr[0];

        for (int i = 1; i < arr.length; i++) {
            Node current = root;
            boolean insertionDone = false;
            while(!insertionDone){
                if (arr[i] <= current.data){
                    if(current.left!=null){
                        current = current.left;
                    }
                    else{
                        Node newnode = new Node();
                        newnode.data = arr[i];
                        current.left = newnode;
                        insertionDone = true;
                    }
                }
                else{
                    if(current.right!=null){
                        current = current.right;
                    }
                    else{
                        Node newnode = new Node();
                        newnode.data = arr[i];
                        current.right = newnode;
                        insertionDone = true;
                    }
                }
            }

        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements to be inserted: ");
        System.out.print(Arrays.toString(arr));

        BinarySearchTree bst = new BinarySearchTree();
        Node start = bst.perfromInsertion(arr);

        System.out.print("\nPreorder Traversal: [ ");
        bst.preorderTraversalBstree(start);
        System.out.print("]");        

        System.out.print("\nInorder Traversal: [ ");
        bst.inorderTraversalBstree(start);
        System.out.print("]");

        System.out.print("\nPostorder Traversal: [ ");
        bst.postorderTraversalBstree(start);
        System.out.print("]");
    }
}