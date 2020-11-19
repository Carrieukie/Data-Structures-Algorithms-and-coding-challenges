package datastructures.graphs.adjecencylist;

import datastructures.linkedlist.Linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    LinkedList adjacent = new LinkedList();

    public Node(int data) {
        this.data = data;
    }

}

public class Graph {

    private HashMap<Integer, Node> nodeLookup = new HashMap<>();
//    private Node getNode(int data){}
    public void addEdge(int source,int destinatio){}
    
}
