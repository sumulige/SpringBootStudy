package com.example.springbootstudy.dowhile;

public class dowhileTest {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("start" + start);
        long timeOut = 100000000;
        long end;
        do {
            end = System.nanoTime();

            System.out.println("start + timeOut" + (start + timeOut));
            System.out.println("end" + end);
        } while (start + timeOut >= end);
    }
}
