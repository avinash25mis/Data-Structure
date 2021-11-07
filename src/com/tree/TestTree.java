package com.tree;

import com.tree.core.BinaryTree;
import com.tree.core.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author avinash.a.mishra
 */
public class TestTree {

    /*

      tree
      ----
       2
     /   \
    3     4
   /  \
  5     6

  */

    public static void main(String[] args) {
        BinaryTree binaryTree =new BinaryTree();
        binaryTree.root=new Node(2);
        binaryTree.root.left=new Node(3);
        binaryTree.root.right=new Node(4);
        binaryTree.root.left.left=new Node(5);
        binaryTree.root.left.right=new Node(6);
        //System.out.println(heightOfTree(binaryTree.root));
       breathFirstSearch(binaryTree.root);
    }

    private static int heightOfTree(Node node) {

      if(node ==null){
          return 0;
      }else{
         int heightL = heightOfTree(node.left);
         int heightR = heightOfTree(node.right);
         if(heightL>heightR) {
             return heightL + 1; //
         }else{
             return heightR +1 ;
         }
      }

    }




    private static void breathFirstSearch(Node root) {
        int h = heightOfTree(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);

     }

   /*   tree is traversed from the root till the level provided is reached
       left part of tree is traversed and when we reach provide level  it  printes
       right part of tree is traversed and when  we reach provide level  it  printes

       when to decide that level is reached ??

       every time printGivenLevel() is called for a "level" value, we travel from root
       to reach that level value, by decrementing  the provided "level" value
       once we reach that level ie "level==1", we print it
      */
    private static void printGivenLevel(Node node, int level) {
       List<String> array=new ArrayList<>();
      Collections.reverse(new ArrayList<>());
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.key + " ");
        else if (level > 1) {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }
}
