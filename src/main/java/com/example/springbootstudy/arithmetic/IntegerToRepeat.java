package com.example.springbootstudy.arithmetic;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class IntegerToRepeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            Integer a = in.nextInt();
            char[] c = a.toString().toCharArray();

            LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

            for (int i = c.length - 1; i >= 0; i--) {
                linkedHashSet.add(Character.getNumericValue(c[i]));
            }

            linkedHashSet.forEach(k -> {
                System.out.println(k.intValue());
            });


        }
    }
}
