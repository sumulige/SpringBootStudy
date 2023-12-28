package com.example.springbootstudy.arithmetic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountToChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            char[] c = input.toCharArray();
            Set<Character> set = new HashSet();
            for (char cc : c
            ) {
                set.add(cc);
            }
            System.out.println(set.size());
        }
    }
}
