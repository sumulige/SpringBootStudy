/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: NewFixedThreadPool
 * Author:   willem
 * Date:     2021/9/28 10:38 上午
 * Description: 线程池的使用newFixedThreadPool
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.thread.threadpool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 〈一句话功能简述〉<br>
 * 〈线程池的使用newFixedThreadPool〉
 *
 * @author willem
 * @create 2021/9/28
 * @since 1.0.0
 */
public class NewFixedThreadPool {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void newFixedThreadPoolTest() {
        ExecutorService pool = Executors.newFixedThreadPool(5);

        pool.execute(new Runnable() {
            @Override
            public void run() {

                logger.info("thread" + Thread.currentThread().getName() + LocalTime.now() + "is running");
            }
        });

    }

    public static void main(String[] args) throws ClassNotFoundException {
        int i = 0;
        while (i < 20) {
            new NewFixedThreadPool().newFixedThreadPoolTest();
        }
    }
}
