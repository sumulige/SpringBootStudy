/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: CallableTest
 * Author:   willem
 * Date:     2021/9/28 11:50 上午
 * Description: 任务返回型Callable
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
 * 〈任务返回型Callable〉
 *
 * @author willem
 * @create 2021/9/28
 * @since 1.0.0
 */
public class CallableTest {

    private Logger logger = LoggerFactory.getLogger(getClass());
    public void callableTest() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Executors.callable(new Runnable() {
            @Override
            public void run() {
                logger.info(Thread.currentThread().getName() + LocalTime.now() + "IS RUNNING");
            }
        }).call();

    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            new CallableTest().callableTest();
        }
    }


}
