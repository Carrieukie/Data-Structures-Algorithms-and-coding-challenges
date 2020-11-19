package datastructures.hastables;

import java.util.*;

class HashNode<K,V>{
    K key;
    V value;
    HashNode<K,V> nextNode;

    public HashNode(K key, V value) {
        this.nextNode = nextNode;
    }
}

class HashMap<K,V> {
    List<HashNode<K,V>> bucket ;
    int size ;
    private int numBuckets;

    HashMap(){
        bucket = new ArrayList<>();
        size = 0;
        numBuckets = 20;
    }

    private int bucketIndex(K key){
        int hashcode = key.hashCode();
        return hashcode % numBuckets;
    }

    protected void remove(K key){
//        get the probable index of the node in the bucket
//        check if it exists
//        if it deos remove it

        int probableIndex = bucketIndex(key);
        HashNode<K,V> node = bucket.get(probableIndex);
        HashNode<K,V> prev = null;

//        treverse the linkedlist searching for the key
//        we need to have prev node so it canponit to the next node of current node
//        2,3,4,5,9

        while (node != null){
//            if key is found remove it
            if (node.key ==  key){
                prev = node.nextNode;
                return;
            }
            prev = node;
            node = node.nextNode;
        }

    }

    public void add(K key, V value){
//        get index of the bucket to chain the node
//        get the node and add it
//        check if the value exists if it does return(Stop the add fuction)
//        if it doesnt create a new node and make it the head of the bucket at that index

        int indexInTheBucket = bucketIndex(key);
        HashNode<K,V> node = bucket.get(indexInTheBucket);
        while (node != null){
            if (node.value == value){
                return;
            }
            node = node.nextNode;
        }
        HashNode<K,V> newHead = new HashNode<>(key,value);
        newHead.nextNode = bucket.get(indexInTheBucket);
        bucket.set(indexInTheBucket,newHead);
        size ++;
    }

    public V getValue(K key){
        int indexOfHashNode = bucketIndex(key);
        HashNode<K,V> head = bucket.get(indexOfHashNode);
        while (head != null){
            if (head.key == key){
                return head.value;
            }
            head = head.nextNode;
        }
        return null;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print_HashMap(){

    }

}

public class Main {
    public static void main(String[] args) {

    }

}
