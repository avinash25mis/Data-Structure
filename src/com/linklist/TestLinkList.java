package com.linklist;

import java.util.LinkedList;

/**
 * @author avinash.a.mishra
 */
public class TestLinkList {

    public static void main(String[] args) {
       // checkAddFirst();
       // checkAddLast();
       //checkRemoveFirst();
        //checkRemoveLast();
        //checkAddAtIndex();
        checkRemoveAtIndex();

    }



    private static void checkAddLast() {
        MyLinkList linkList =new MyLinkList();
        linkList.addLast(1);
        linkList.addLast(2);
        linkList.addLast(3);
        linkList.show();
    }

    private static void checkAddFirst() {
     MyLinkList linkList =new MyLinkList();
     linkList.addFirst(1);
     linkList.addFirst(2);
     linkList.addFirst(3);
     linkList.show();
    }


    private static void checkRemoveFirst() {
        MyLinkList linkList =new MyLinkList();
        linkList.addLast(1);
        linkList.addLast(2);
        linkList.addLast(3);
        linkList.removeFirst();
        linkList.removeFirst();


        linkList.show();
    }


    private static void checkRemoveLast() {
        MyLinkList linkList =new MyLinkList();
        linkList.addLast(1);
        linkList.addLast(2);
        linkList.addLast(3);
        linkList.removeLast();
        linkList.removeLast();


        linkList.show();
    }


    private static void checkAddAtIndex() {
        MyLinkList linkList =new MyLinkList();
        linkList.addLast(1);
        linkList.addLast(2);
        linkList.addLast(3);

        linkList.show();
        linkList.addAtIndex(1,9);
        linkList.show();
    }


    private static void checkRemoveAtIndex() {
        MyLinkList linkList =new MyLinkList();
        linkList.addLast(1);
        linkList.addLast(2);
        linkList.addLast(3);

        linkList.show();
        linkList.removeAtIndex(0);
        linkList.show();
    }
}
