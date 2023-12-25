/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: Solution
 * Author:   willem
 * Date:     2021/9/14 5:21 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test.base;

import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author willem
 * @create 2021/9/14
 * @since 1.0.0
 */
public class Solution {
    public static void main(String[] args) {

        int number = 5;
        System.out.println("5/2" + 5 / 2);
        changeInt(number);
        System.out.println("int ---->" + number);

        String s = "2";
        changeString(s);
        System.out.println("String --->" + s);

        String strw = new Solution().reverseWords("Let's take LeetCode contest");
        System.out.println(strw);

        Set<Character> occ = new HashSet<Character>();
//        occ.stream().forEach(o->o.);

        System.out.println(occ);


        List list = new ArrayList();
        for (int i = 0; i < 1000; ++i) {
            list.add(i);
        }
        list.stream().spliterator();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Arrays.sort(nums);//[-5, -3, -2, -1, 1, 1, 2, 4, 4]
        Arrays.sort(nums1);//[-5, -3, -2, -1, 1, 1, 2, 4, 4]
        System.out.println();

        Arrays.sort(nums);


    }

    public String reverseWords(String s) {
        String[] temp = s.split("\\s");
        String[] strings = new String[temp.length];
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (int i = 0; i < temp.length; i++) {
            char[] cha = reversString(temp[i].toCharArray());
            strings[i] = String.valueOf(reversString(temp[i].toCharArray()));

            // (sb.append(cha)).toString().split("\\s");

            sb.append(cha).append(" ");
        }
        str = sb.toString();
        return str.substring(0, str.length() - 1);
    }

    public char[] reversString(char[] c) {
        for (int left = 0, right = c.length - 1; left < right; left++, right--) {
            char ch = c[left];
            c[left] = c[right];
            c[right] = ch;
        }
        return c;
    }

    public static int changeInt(int number) {
        number = 10;
        return number;
    }

    public static String changeString(String str) {

        return "22";
    }

}
