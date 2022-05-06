
import java.util.Scanner;

public class BinarySearchTree {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Node root = new Node(24);
        insert(root, 9);
        insert(root, 60);
        insert(root, 8);
        insert(root, 28);
        insert(root, 7);
        insert(root, 32);
        insert(root, 26);
        System.out.println(root.right.left.right.value);
        Node found = search(root, 26);
        System.out.println(found.value);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    static Node insert(Node root, int val){
        Node ins = new Node(val);
        // base condition
        if(root == null){
            return ins;
        }
        if(ins.value <root.value){
            root.left = insert(root.left, val);

        }
        else if(ins.value > root.value){
            root.right = insert(root.right, val);
        }
        return root;
    }

    static Node search(Node root, int val){ // returns the parent node
        Node found = null;
        if(root.value == val){  // element found
            return root;
        }
        else if(root != null){  // element not found
            if(root.value < val){
                found = search(root.right, val);
            }
            else if(root.value > val){
                found = search(root.left, val);
            }
        }
        return found;
    }
    static void delete(Node root, Node node){
        Node parent = root;
        if(root == null){  // prevention from nullPointerException
            return;
        }
        if(root.value == node.value){
            // delete node
        }
        else{
            if(node.value < root.value){
                delete(root.left, node);
            }
            else if(node.value > root.value){
                delete(root.right, node);
            }
        }
    }

    public static void inOrder(Node root){  //LNR
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + ", ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){  //LNR
        if(root == null){
            return;
        }
        System.out.print(root.value + ", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){  //LNR
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + ", ");
    }



}

// node class
class Node{
    int value;
    Node left, right;
    public Node(int value){
        this.value = value;
    }
}
