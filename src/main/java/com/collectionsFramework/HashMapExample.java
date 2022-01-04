package com.collectionsFramework;
import java.util.Collections;
import java.util.*;

public class HashMapExample {
    public static void main(String args[]) {

        /* declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        //System.out.println(hmap);
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry map = (Map.Entry)iterator.next();
            System.out.println("Key is: " +map.getKey() + "Value is: "+ map.getValue());
        }
    }
}