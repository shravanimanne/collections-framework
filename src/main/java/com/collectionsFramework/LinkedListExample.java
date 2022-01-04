package com.collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        //Adding elements to the list
        list.add(0, "Apple");
        list.add(1, "Orange");
        list.add(2, "Banana");
        list.add(3, "Grapes");
        list.add(4, "PineApple");
        list.add(5, "Watermelon");
        list.addLast("Muskmelon");
        list.addFirst("milk");
        //System.out.println(list);
        //Iterating linkedlist
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}

