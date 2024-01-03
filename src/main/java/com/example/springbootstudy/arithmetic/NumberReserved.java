package com.example.springbootstudy.arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberReserved {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            Integer a = in.nextInt();
            char[] c = a.toString().toCharArray();
            List<Character> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (int i = c.length - 1; i >= 0; i--) {
                System.out.println(c[i]);
                sb.append(c[i]);
                // list.add(c[i]);
            }
            // int b = in.nextInt();
            System.out.println(sb.toString());
        }
    }
}
