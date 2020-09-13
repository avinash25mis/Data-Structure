package com.tree;

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
        BinaryTree binaryTree =new BinaryTree(2);
        binaryTree.root.left=new NodeTree(3);
        binaryTree.root.right=new NodeTree(4);
        binaryTree.root.left.left=new NodeTree(5);
        binaryTree.root.left.right=new NodeTree(6);
        //System.out.println(heightOfTree(binaryTree.root));
       breathFirstSearch(binaryTree.root);
    }

    private static int heightOfTree(NodeTree node) {

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




    private static void breathFirstSearch(NodeTree root) {
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
    private static void printGivenLevel(NodeTree node, int level) {
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
