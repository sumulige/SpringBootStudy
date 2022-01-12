package com.example.springbootstudy.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FloatTest {
    public static void main(String[] args) {
        short s1 = 1;

        //s1 = (s1 + 1);报错
        s1 = (short) (s1 + 1);

        final short s2 = 2;
//         s2+=1;

        s1 += 1;

        int[] ints = {1, 2, 3, 4, 5};

        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(3)) ;
            continue;
        }

        System.out.println(s1);

        String a = "ab";
        String b = "ab";
        String c = "a" + "b";

        System.out.println("a:" + a.hashCode());
        System.out.println("b:" + b.hashCode());
        System.out.println("c:" + c.hashCode());

        Queue queue = new LinkedList();


    }
}
