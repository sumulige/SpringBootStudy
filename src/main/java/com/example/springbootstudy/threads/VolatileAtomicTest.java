package com.example.springbootstudy.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileAtomicTest {

    public volatile int number;
    public AtomicInteger atomicInteger = new AtomicInteger(0);

    public void addNumber() {
        number++;
    }

    public void atomicAdd() {
        atomicInteger.getAndIncrement();
    }

    public static void main(String[] args) {
        System.out.println("测试Volatile是否保证原子性");
        VolatileAtomicTest VolatileAtomicTest = new VolatileAtomicTest();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " 线程启动");
                for (int j = 0; j < 1000; j++) {
                    VolatileAtomicTest.addNumber();

                    VolatileAtomicTest.atomicAdd();
                }
            }, "线程" + i).start();
        }
        // 保证主线程是在其他线程执行完了 再进行 获取值，否则获取为0
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "非原子性操作 获取VolatileAtomicTest的number等于" + VolatileAtomicTest.number);
        // 得到的值 != 20* 1000
        System.out.println(Thread.currentThread().getName() + " 原子性操作 获取VolatileAtomicTest的number等于" + VolatileAtomicTest.atomicInteger.get());
    }
}

