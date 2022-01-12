package com.example.springbootstudy.test.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        if (lock.tryLock()) {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (lock != null) {
                    lock.unlock();
                }
            }
        }

    }

}
