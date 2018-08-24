/*  The height of a binary search tree is the number of edges between the tree's root 
	and its furthest leaf. You are given a pointer, root, pointing to the root of a 
	binary search tree. Create a code that returns the height of the binary search tree. */
	
import java.util.*;

class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTrees {
	public static int getHeight(Node root) {
        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }

        return (heightLeft > heightRight ? heightLeft : heightRight);
    }


	public static Node insert(Node root,int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left,data);
                root.left = cur;
            } else {
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while(T-->0) {
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}