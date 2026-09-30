import java.util.*;

public class Sum {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum(Node root) {
        if(root == null) {
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        int ts = ls + rs + root.data;

        return ts;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(sum(root));
    }
}