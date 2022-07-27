package com.example.springbootstudy.partics;

/**
 * 以下代码的循环次数是
 */
public class Test {
    public static void main(String args[]) {
        int i = 7;
        do {
            System.out.println(--i);
            --i;
        } while (i != 0);
        System.out.println(i);
    }
}
