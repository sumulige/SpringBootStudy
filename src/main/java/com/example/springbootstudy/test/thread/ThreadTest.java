/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: ThreadTest
 * Author:   willem
 * Date:     2021/8/18 8:54 上午
 * Description: 线程测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test.thread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈线程测试〉
 *
 * @author willem
 * @create 2021/8/18
 * @since 1.0.0
 */
public class ThreadTest extends Thread{

    public void print(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello"+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();

    }
}
