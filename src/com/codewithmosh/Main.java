package com.codewithmosh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(30));
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);*/

        var list = new LinkedList();
        System.out.println(list.size());
        list.addFirst(10);
        list.addLast(20);
        System.out.println(list.size());
        list.addLast(30);
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(30));
        System.out.println(list.size());
        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromTheEnd(2));
    }
}
