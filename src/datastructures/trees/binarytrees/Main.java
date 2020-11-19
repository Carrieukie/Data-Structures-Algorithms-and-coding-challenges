package datastructures.trees.binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

class BinaryTree{

    static Node root;
    Node current;

    static void inorder(){
        printInorder(root);
    }

    private static void printInorder(Node node) {
        if (node == null){
            return;
        }
        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);

    }

    static void preOrder(){
        printPreOrder(root);
    }

    private static void printPreOrder(Node node) {
        if (node == null){
            return;
        }
        System.out.println(node.data);
        printInorder(node.left);
        printInorder(node.right);
    }

    static void postOrder(){
        printPostOrder(root);
    }

    private static void printPostOrder(Node node) {
        if (node == null){
            return;
        }
        printInorder(node.left);
        printInorder(node.right);
        System.out.println(node.data);
    }

    static void bfs(){
        bfs(root);
    }

    static void bfs(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node current =  queue.remove();
            if (current.left != null){
                queue.add(current.left);
            }

            if (current.right != null){
                queue.add(current.right);
            }

            System.out.print(current.data);
        }
    }

    static void dfs(){
        dfs(root);
    }

    static void dfs(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            Node current =  stack.pop();
            if (current.left != null){
                stack.push(current.left);
            }
            System.out.print(current.data);
            if (current.right != null){
                stack.push(current.right);
            }
        }
    }

    static void insert(int data){
        if (root == null){
            root = new Node(data);
            return;
        }else {
                add_node(data,root);
        }
    }

    static int maximumDepth(){
        System.out.println("maxim2" + maxim2(root,0));
        return maximumDepth(root) - 1;
    }

    static int maxim2(Node root,int height){
        if (root == null){
            return height;
        }
        int left = maxim2(root.left,++height);
        int right = maxim2(root.right,++height);
        return Math.max(left,right);
    }

    static int maximumDepth(Node root){
        if (root == null){
            return 0;
        }
        int left = maximumDepth(root.left);
        int right = maximumDepth(root.right) ;
        return Math.max(left,right) + 1;
    }

    static void add_node(int data, Node node){
        if (node == null){
            node = new Node(data);
        }
        if (data < node.data){
            if (node.left == null){
                node.left = new Node(data);
            }else {
                add_node(data,node.left);
            }

        }else {
            if (node.right == null){
                node.right = new Node(data);
            }else {
                add_node(data, node.right);
            }
        }
    }

//    static Node findInorderSuccesor(Node node){
//
//    }

}

public class Main {
    public static void main(String[] args) {
        BinaryTree.insert(5);
        BinaryTree.insert(9);
        BinaryTree.insert(11);
        BinaryTree.insert(12);
        BinaryTree.insert(20);
        BinaryTree.insert(25);
        BinaryTree.maximumDepth();
    }
}
