package com.nishthasoft.recursive;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left = null, right = null;
    Node(int data){
        this.data = data;

    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left.data +
                ", right=" + right.data +
                '}';
    }
}

public class BinarySubtree {

    public static void main(String[] args) {

       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);

       Node root2 = new Node(4);
       root2.left = new Node(5);
       root2.right = new Node(6);

        System.out.println(root);
        System.out.println(root2);

        System.out.println(checkSubtree(root,root2));

    }

    // to check if given tree is subtree

    static boolean checkSubtree(Node tree, Node subtree){

        if(subtree == null)
            return true;

        if(tree == null)
            return false;

        List<Integer> first = new ArrayList<>();
        inorder(tree, first);
        List<Integer> second = new ArrayList<>();
        inorder(subtree,second);

        if(listToString(first).contains(listToString(second)))
            return true;

        first.clear();
        second.clear();
        preorder(tree,first);
        preorder(subtree,second);

        return  listToString(first).contains(listToString(second));


    }

    // to convert list to string
    static String listToString(List<Integer> list){
        System.out.println(list);
        return list.toString().replace("[","").replace("]","")
                .replace(",","");

    }

    // to store inorder traversal in list
    static void inorder(Node node, List<Integer> list){

        if(node == null){
            return;
        }

        inorder(node.left,list);
        list.add(node.data);
        inorder(node.right,list);

    }

    // to store preoder traversal in list
    static void preorder(Node node, List<Integer> list){
        if(node == null){
            return;
        }
        list.add(node.data);
        preorder(node.left,list);
        preorder(node.right,list);

    }

    static void postorder(Node node, List<Integer> list){
        if(node == null){
            return;
        }

        preorder(node.left,list);
        preorder(node.right,list);
        list.add(node.data);
    }
}
