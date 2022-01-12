package com.example.springbootstudy.test.thread;

public class ThreadTest01 {

    private static final Object o = new Object();

    public void threastop() {

        new Thread(() -> {

            System.out.println("创建一个线程");

        }, "Thread---01").start();


    }

    public static void main(String[] args) {
        ThreadTest01 th = new ThreadTest01();
        th.threastop();


//        .threastop();

    }
}
