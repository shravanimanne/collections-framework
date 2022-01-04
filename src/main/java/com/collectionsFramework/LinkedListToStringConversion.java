package com.collectionsFramework;
import java.util.List;
import java.util.*;

public class LinkedListToStringConversion {
    public static void main(String[] args) {

        //Creating and populating LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Harry");
        linkedlist.add("Maddy");
        linkedlist.add("Chetan");
        linkedlist.add("Chauhan");
        linkedlist.add("Singh");

        //Converting LinkedList to Array
        String[] array = new String[linkedlist.size()];

        for(int j =0;j<linkedlist.size();j++){
            array[j] = linkedlist.get(j);
        }

        //Displaying Array content
        for (String s : array) {
            System.out.println(s);

        }
    }
}