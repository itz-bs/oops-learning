package lab;
import java.util.*;
class TreeNode<T extends Comparable<T>> {
    T data;
    TreeNode<T> left, right;
    TreeNode(T data) {
        this.data = data;
        left = right = null;
    }  }
class BinaryTree<T extends Comparable<T>> {
    TreeNode<T> root;
    public void insert(T data) {
        root = insertRec(root, data);
    }
    private TreeNode<T> insertRec(TreeNode<T> node, T data) {
        if (node == null) {
            return new TreeNode<>(data);
        }
        if (data.compareTo(node.data) < 0) {
            node.left = insertRec(node.left, data);
        } else if (data.compareTo(node.data) > 0) {
            node.right = insertRec(node.right, data);
        }
        return node;
    }
    public void inOrder(TreeNode<T> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }   }
    public void preOrder(TreeNode<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }    }
    public void postOrder(TreeNode<T> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }    }
    public void levelOrder() {
        if (root == null) return;
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }   }    }
public class BinaryTreetest {
    public static void main(String[] args) {
        System.out.println("=== Generic Binary Tree with Traversals ===");
        BinaryTree<Integer> tree = new BinaryTree<>();
        System.out.println("\n--- Test Case 1: Insert 10, 5, 20 ---");
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        System.out.println("Inserted elements: 10, 5, 20");
        System.out.println("\n--- Test Case 2: Level Order Traversal (BFS) ---");
        System.out.print("Output: ");
        tree.levelOrder(); // Expected: 10 5 20
        System.out.println();
        System.out.println("\n--- Test Case 3: In-order Traversal (DFS) ---");
        System.out.print("Output: ");
        tree.inOrder(tree.root); // Expected: 5 10 20
        System.out.println();
        System.out.println("\n--- Test Case 4: Pre-order Traversal (DFS) ---");
        System.out.print("Output: ");
        tree.preOrder(tree.root); // Expected: 10 5 20
        System.out.println();
        System.out.println("\n--- Test Case 5: Post-order Traversal (DFS) ---");
        System.out.print("Output: ");
        tree.postOrder(tree.root); // Expected: 5 20 10
        System.out.println();
        System.out.println("\n=== All Test Cases Executed Successfully ===");
        System.out.println("BHAVANI SANKAR M");
        System.out.println("2117240040015");
    }
}
