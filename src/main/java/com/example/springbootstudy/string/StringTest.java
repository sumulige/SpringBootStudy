package com.example.springbootstudy.string;

public class StringTest {
    public static void main(String[] args) {
        String string = "ahdsahfhslfdihwiheflhwlfhlwhaflwahflhealfh";
        String[] split = string.split(" ", 8);
        System.out.println(split);
    }
}
