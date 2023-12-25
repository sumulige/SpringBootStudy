/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: ThreadPool
 * Author:   willem
 * Date:     2021/8/19 3:08 下午
 * Description: 线程池
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 〈一句话功能简述〉<br>
 * 〈线程池〉
 *
 * @author willem
 * @create 2021/8/19
 * @since 1.0.0
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

        int i = 0;
        while (i < 5) {
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            i++;
        }

    }
}
