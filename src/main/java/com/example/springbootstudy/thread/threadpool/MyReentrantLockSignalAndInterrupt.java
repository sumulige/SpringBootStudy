package com.example.springbootstudy.thread.threadpool;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/*********************************************
 *
 * jdk源码&多线程&高并发-【阶段3、深入juc源码解析】
 * 主讲：码炫码哥
 *
 ********************************************/

/**
 * 来玩个好玩的东西[表情]：
 * 在上面这段代码中增加一些代码，
 * 让线程1既可能正常结束，（要求后面这4句都得打印
 * ），也要让他可能发生异常
 */

public class MyReentrantLockSignalAndInterrupt {
    public static void main(String[] args) {
        ReentrantLock myReentrantLock = new ReentrantLock();
        Condition condition = myReentrantLock.newCondition();
        Thread t1 = new Thread(() -> {
            myReentrantLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "拿到锁，开始执行任务");
                mySleep(1000000000);
                System.out.println(Thread.currentThread().getName() + "执行了1s，然后开始阻塞");
                condition.await();
                System.out.println(Thread.currentThread().getName() + "被唤醒后继续执行");
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("发生中断了");
                }
            } catch (InterruptedException e) {
                System.out.println("发生了异常");
                e.printStackTrace();
            } finally {
                myReentrantLock.unlock();
            }
        }, "t1");
        t1.start();
    }

    public static void mySleep(long timeOut) {
        long start = System.nanoTime();
        long end;
        do {
            end = System.nanoTime();

        } while (start + timeOut >= end);
    }
}
