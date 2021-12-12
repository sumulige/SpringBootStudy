package com.example.springbootstudy.designpattern;

/**
 * 饿汉式
 */
class SingleInstanceTest1 {

    private static SingleInstanceTest1 instance = new SingleInstanceTest1();

    private SingleInstanceTest1() {
    }

    public static SingleInstanceTest1 getInstance() {

        return instance;
    }
}

/**
 * 懒汉式
 * 非线程安全
 */
class SingleInstanceTest2 {
    private static SingleInstanceTest2 instance;

    private SingleInstanceTest2() {
    }

    public static SingleInstanceTest2 getInstance() {
        if (instance == null) {
            instance = new SingleInstanceTest2();
        }
        return instance;

    }
}

/**
 * 饿汉式
 * 线程安全1
 * 简单
 */
class SingleInstanceTest3 {
    private static SingleInstanceTest3 instance;

    private SingleInstanceTest3() {
    }

    public static synchronized SingleInstanceTest3 getInstace() {
        if (instance == null) {
            instance = new SingleInstanceTest3();
        }
        return instance;
    }
}

/**
 * 饿汉式
 * 线程安全
 * 双重锁
 */
class SingleInstanceTest4 {
    private static SingleInstanceTest4 instance;

    private SingleInstanceTest4() {
    }

    public static SingleInstanceTest4 getInstance() {
        if (instance == null) {
            synchronized (SingleInstanceTest4.class) {
                if (instance == null) {
                    instance = new SingleInstanceTest4();
                }
            }

        }
        return instance;
    }
}

/**
 * 使用volatile关键字
 * 线程安全
 * 简单
 * 就是多线程内存变量共享 主动通知
 */
class SingleInstanceTest5 {
    private volatile static SingleInstanceTest5 instance;

    private SingleInstanceTest5() {
    }

    public static SingleInstanceTest5 getInstance() {
        if (instance == null) {
            synchronized (SingleInstanceTest5.class) {
                instance = new SingleInstanceTest5();
            }

        }
        return instance;
    }
}

/**
 * 使用静态内部类
 * 线程安全
 * 比较常用
 */
class SingleInstanceTest6 {
    private static class SingleHolder {
        private static final SingleInstanceTest6 INSTANCE = new SingleInstanceTest6();

    }

    private SingleInstanceTest6() {

    }

    public static SingleInstanceTest6 getINSTANCE() {
        return SingleHolder.INSTANCE;
    }
}

/**
 * 枚举
 * 最简单
 */

enum SingleInstanceTest7 {
    INSTANCE
}
