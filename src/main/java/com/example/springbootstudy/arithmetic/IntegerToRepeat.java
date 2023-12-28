package com.example.springbootstudy.arithmetic;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class IntegerToRepeat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int input = in.nextInt();

            Set<Integer> linkedHashSet = new LinkedHashSet<>(Collections.singletonList(input));

            for (int i = linkedHashSet.size(); i > 0; i--) {
                System.out.println(i + " ");
            }

        }
    }
}
