package com.example.springbootstudy.emumTest;

//@Component
public enum EmumTest {
    ID,
    NAME,
    AGE;

    private EmumTest() {
    }

//    Enum


    public void say() {
        System.out.println("hello");
    }


    /*public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clz = Class.forName("com.example.springbootstudy.emumTest.EmumTest");
        Object o = clz.newInstance();

    }*/
}
