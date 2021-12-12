package com.example.springbootstudy.base;

public class CharTest {
    Object[] o;
    public static Object[] o2 = {};

    public void test() {
        System.out.println(o);
        System.out.println(o2);

        System.out.println(o == o2);
    }

    public static void main(String[] args) {
        new CharTest().test();
    }
}
