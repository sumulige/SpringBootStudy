package com.example.springbootstudy.partics;

import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> subSet = new TreeSet<Integer>();
        for (int i = 606; i < 613; i++) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        subSet = (TreeSet) set.subSet(608, true, 611, true);
        set.add(609);
        System.out.println(set + " " + subSet);
    }
}
