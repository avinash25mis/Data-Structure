package com.linklist;

/**
 * @author avinash.a.mishra
 */
public class MyNode {

    int size;
    int data;
    MyNode next;
    MyNode prev;

   MyNode(){

   }

   MyNode(int data, MyNode next){
      this.data=data;
      this.next=next;
   }
}
