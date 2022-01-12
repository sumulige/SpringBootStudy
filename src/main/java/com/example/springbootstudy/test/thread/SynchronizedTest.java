package com.example.springbootstudy.test.thread;

public class SynchronizedTest {
    public void synchronizedDemo() {
        synchronized (SynchronizedTest.this) {
            System.out.println("Synchronized");
        }
    }
}
