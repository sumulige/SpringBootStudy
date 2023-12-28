package com.example.springbootstudy.thread.threadpool;

public class MySynchronizedTest {
    public static void main(String[] args) {

    }

    public void s() {
        synchronized (this) {
            System.out.println("sajdj");
        }
    }
}
