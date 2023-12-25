package com.example.springbootstudy.arithmetic;

import java.util.Scanner;

public class LastIndexOfString {

    /**
     * 描述
     * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
     * 输入描述：
     * 输入一行，代表要计算的字符串，非空，长度小于5000。
     * <p>
     * 输出描述：
     * 输出一个整数，表示输入字符串最后一个单词的长度。
     * <p>
     * 示例1
     * 输入：
     * hello nowcoder
     * 复制
     * 输出：
     * 8
     * 复制
     * 说明：
     * 最后一个单词为nowcoder，长度为8
     * 相似企业真题
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(lastIndex(scanner.nextLine()).length());

    }

    private static String lastIndex(String string) {
        String[] strings = string.split(" ");
        return strings[strings.length - 1];
    }
}
