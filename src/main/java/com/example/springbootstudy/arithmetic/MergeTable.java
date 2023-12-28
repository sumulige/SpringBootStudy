package com.example.springbootstudy.arithmetic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MergeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int input = in.nextInt();

            if (1 > input || input > 500) {
                System.out.println("请重新录入，录入数值不正确");
            }

            //使用hashmap接受键值对
            Map<Integer, Integer> mapIndex = new HashMap<>();
            for (int i = 0; i < input; i++) {
                int index = in.nextInt();
                int value = in.nextInt();

                mapIndex.put(index, mapIndex.getOrDefault(index, 0) + value);

            }

            Map<Integer, Integer> sortSet = new TreeMap<>(mapIndex);

            sortSet.forEach((k, v) -> System.out.println(k + " " + v));
        }
    }
}
