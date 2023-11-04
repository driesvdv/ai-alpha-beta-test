package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(0, null, 0, false);
        tree.setRoot(root);

        List<Node> children = new ArrayList<>();
        Node child1 = new Node(0, null, 1, false);
        Node child2 = new Node(0, null, 1, false);
        Node child3 = new Node(0, null, 1, false);
        children.add(child1);
        children.add(child2);
        children.add(child3);
        root.setChildren(children);

        List<Node> children1 = new ArrayList<>();
        Node child11 = new Node(3, null, 2, false);
        Node child12 = new Node(5, null, 2, false);
        Node child13 = new Node(10, null, 2, false);
        children1.add(child11);
        children1.add(child12);
        children1.add(child13);
        child1.setChildren(children1);

        List<Node> children2 = new ArrayList<>();
        Node child21 = new Node(3, null, 2, false);
        Node child22 = new Node(3, null, 2, false);
        Node child23 = new Node(3, null, 2, false);
        children2.add(child21);
        children2.add(child22);
        children2.add(child23);
        child2.setChildren(children2);

        List<Node> children3 = new ArrayList<>();
        Node child31 = new Node(2, null, 2, false);
        Node child32 = new Node(7, null, 2, false);
        Node child33 = new Node(3, null, 2, false);
        children3.add(child31);
        children3.add(child32);
        children3.add(child33);
        child3.setChildren(children3);

        tree.prune(tree.getRoot(), Integer.MIN_VALUE, Integer.MAX_VALUE);

    }




}