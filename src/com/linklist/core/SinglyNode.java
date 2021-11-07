package com.linklist.core;

/**
 * @author avinash.a.mishra
 */
public class SinglyNode {
  public int val;
  public SinglyNode next;
  public SinglyNode() {}
  SinglyNode(int val) { this.val = val; }
  SinglyNode(int val, SinglyNode next) { this.val = val; this.next = next; }

}
