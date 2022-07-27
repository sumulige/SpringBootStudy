package com.example.springbootstudy.base;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i = 128;
        System.out.println(new Integer(127) == new Integer(127));

        System.out.println(new String("1") == new String("1"));
        System.out.println(new Boolean(true));
    }
}
