package com.tree;

/**
 * @author avinash.a.mishra
 */
public class BinaryTree {

   NodeTree root;


   /*
   we just need to initialize the root node
   * */
   BinaryTree (int value){
       root =new NodeTree(value);
   }

    BinaryTree (){
        root = null;
    }
}
