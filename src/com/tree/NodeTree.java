package com.tree;



/**
 * @author avinash.a.mishra
 */
public class NodeTree {

    int key;
   NodeTree left;
   NodeTree right;

   NodeTree(int value){
       key=value;
       left=right=null;
   }

   NodeTree(int value,NodeTree right,NodeTree left){
       key=value;
       this.right =right;
       this.left =left ;
   }


}
