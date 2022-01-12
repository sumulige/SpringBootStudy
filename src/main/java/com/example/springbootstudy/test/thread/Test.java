package com.example.springbootstudy.test.thread;

//线程唤醒问题
//        样例代码
public class Test {
    /**
     * 有三个线程 A,B,C
     * A为什么总是在C前面抢到锁？？？
     */
    private final static Object LOCK = new Object();

    public void startThreadA() {
        new Thread(() -> {
            synchronized (LOCK) {
                System.out.println(Thread.currentThread().getName() + ": get lock");
                //启动线程b
                startThreadB();
                System.out.println(Thread.currentThread().getName() + ": start wait");
                try {
                    //线程a wait
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": get lock after wait");
                System.out.println(Thread.currentThread().getName() + ": release lock");
            }
        }, "thread-A").start();
    }

    private void startThreadB() {
        new Thread(() -> {
            synchronized (LOCK) {
                System.out.println(Thread.currentThread().getName() + ": get lock");
                //启动线程c
                startThreadC();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": start notify");
                //线程b唤醒其他线程
                LOCK.notify();
                System.out.println(Thread.currentThread().getName() + ": release lock");
                Thread.currentThread().interrupt();
            }
        }, "thread-B").start();
    }

    private void startThreadC() {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": thread c start");
            synchronized (LOCK) {
                System.out.println(Thread.currentThread().getName() + ": get lock");
                System.out.println(Thread.currentThread().getName() + ": release lock");
            }
        }, "thread-C").start();
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//
//        }
        new Test().startThreadA();
    }
}

/*输出结果:
        thread-A: get lock
        thread-A: start wait
        thread-B: get lock
        thread-C: thread c start
        thread-B: start notify
        thread-B: release lock
        thread-A: get lock after wait
        thread-A: release lock
        thread-C: get lock
        thread-C: release lock

        问题：
        为什么每次运行，线程A总是优先于线程C获取锁*/
