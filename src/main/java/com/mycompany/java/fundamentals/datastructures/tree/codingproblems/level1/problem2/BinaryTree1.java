package com.mycompany.java.fundamentals.datastructures.tree.codingproblems.level1.problem2;

/**
 * Program to Determine if given Two Trees are Identical or not Write a function
 * to determine if two trees are identical or not:
 *
 * Two trees are identical when they have the same data and the arrangement of
 * data is also the same
 *
 * Examples:
 *
 * Input:         1                    1
                 /   \                /   \
               2      3            2      3
             /                    /
           4                   4
 *
 *
 * Output: Both trees are identical
 *
 * Input:         1                    1
                 /   \                /   \
               2      3            5      3
                     /             /
                  4             4
 *
 * Output: Trees are not identical
 * Answer from:
 * https://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
 */
// Java program to see if two trees are identical
// A binary tree node
class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree1 {

    Node root1, root2;

    /* Given two trees, return true if they are
	structurally identical */
    boolean identicalTrees(Node a, Node b) {
        /*1. both empty */
        if (a == null && b == null) {
            return true;
        }

        /* 2. both non-empty -> compare them */
        if (a != null && b != null) {
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
        }

        /* 3. one empty, one not -> false */
        return false;
    }

    /* Driver code*/
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);

        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);

        // Function call
        if (tree.identicalTrees(tree.root1, tree.root2)) {
            System.out.println("Both trees are identical");
        } else {
            System.out.println("Trees are not identical");
        }
    }
}
