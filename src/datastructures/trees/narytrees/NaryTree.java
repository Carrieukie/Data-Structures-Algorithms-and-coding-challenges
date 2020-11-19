package datastructures.trees.narytrees;

import java.util.*;

class Node{
    int data;
    List<Node> children;

    public Node(int data) {
        children = new ArrayList<>();
        this.data = data;
    }
}

public class NaryTree {

    static int dfsGlobal = 0;
    public static int maxDepthDFS(Node root){
        if (root == null){ return 0; }
        getMaxDepth(root,0);
        return dfsGlobal;
    }

    private static void getMaxDepth(Node node, int depth) {

        if (node == null){return;}

        dfsGlobal = Math.max(dfsGlobal,depth); 
        for (Node child : node.children){
            getMaxDepth(child,++depth);
        }

    }

    public static int maxDepthBFS(Node root){
        if (root == null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()){
            int j = queue.size();
            for (int i = 0; i < j ; i++) {
               Node currentNode = queue.remove();
//                System.out.println(currentNode.data);
               for (Node child : currentNode.children){
                   queue.add(child);;
               }

            }  depth ++;
        }

        return depth;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        Node node = new Node(3);
        Node node1= new Node(1);
        Node node2 = new Node(2);
        node.children.add(node1);
        node.children.add(node2);
        root.children.add(node);
        Node node3= new Node(4);
        Node node4 = new Node(5);
        root.children.add(node3);
        root.children.add(node4);

        System.out.println(maxDepthBFS(root));
        System.out.println(maxDepthDFS(root));
    }

}
