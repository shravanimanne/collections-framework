package com.collectionsFramework;
import java.util.*;
import java.util.Collections;

public class ArraylistExample {

    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(0,1);
        obj.add(1,4);
        obj.add(2,3);
        obj.add(3,2);
        obj.add(4,5);
        obj.add(5,6);
        //System.out.println(obj);
        //System.out.println(obj.add(100));
        /*
        why the above methods gives true as output??
         */
        //To change the value of the existing element
        obj.set(4,10);
       // System.out.println(obj);
        //To remove the element from the list
        obj.remove(5);
        //System.out.println(obj);
        //To sort the elements in the list
        Collections.sort(obj);
        Collections.reverse(obj);
        for(Integer str: obj){
        System.out.println(str);

        }
        System.out.println("size of the arraylist is " +obj.size());
        //to find the object a the given index
        int pos = obj.indexOf(2);
        System.out.println("position of 2 in the above list is "+pos);
        //to find the index of specific object
        int id = obj.get(4);
        System.out.println("4th index object is " +id);
        //to check whether the object is present in the list or not. if no then it returns false
        System.out.println("the given object is "+obj.contains(10));
        //to delete all the elements in the list
        obj.clear();

    }

}
