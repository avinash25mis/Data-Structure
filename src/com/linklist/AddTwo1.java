package com.linklist;

/**
 * @author avinash.a.mishra
 */


import com.linklist.core.SinglyNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
* this was my forst approach which did not worked and did not have carryforward handeling
*
*
* */
class AddTwo1 {

    public static void main(String[] args) {
        addTwoNumbers(null,null);
    }

    public static SinglyNode addTwoNumbers(SinglyNode l1, SinglyNode l2) {

        SinglyNode result= new SinglyNode();

        SinglyNode  t1=l1;
        SinglyNode  t2=l2;
        SinglyNode re=result;

        do {
            re.val= t1.val+t2.val;
            t1=t1.next;
            t2=t2.next;
            if(t1!=null && t2!=null) {
                SinglyNode newNode= new SinglyNode();
                re.next=newNode;
                re=re.next;
            }

        }while(t1!=null && t2!=null);

        return result;
    }
}