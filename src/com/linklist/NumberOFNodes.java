package com.linklist;


import com.tree.core.BinaryTree;
import com.tree.core.BinaryTreeUtils;
import com.tree.core.Node;

/**
 * @author avinash.a.mishra
 */
public class NumberOFNodes {

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeUtils.generateBinaryTree();
        int i = countNodes(binaryTree.root);
        System.out.println(i);
    }


   static int countNodes(Node root)
    {
        int count =  1;             //Root itself should be counted
        if (root ==null)
            return 0;
        else
        {
            count += countNodes(root.left);
            count += countNodes(root.right);
            return count;
        }
    }
}
