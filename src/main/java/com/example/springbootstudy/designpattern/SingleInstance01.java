package com.example.springbootstudy.designpattern;

public class SingleInstance01 {
    private static volatile SingleInstance01 instance = null;

    private SingleInstance01() {
    }

    public static SingleInstance01 getInstance() {
        if (instance == null) {
            synchronized (SingleInstance01.class) {
                if (instance == null) {
                    instance = new SingleInstance01();
                }
            }

        }
        return instance;
    }
}
