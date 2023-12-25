/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: threadpool
 * Author:   willem
 * Date:     2021/8/18 12:20 下午
 * Description: 线程池 callable 和runnable
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test.thread;


import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈线程池 callable 和runnable 〉
 *
 * @author willem
 * @create 2021/8/18
 * @since 1.0.0
 */
public class MyCallable implements Callable {

    public MyCallable(String s) {
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(5);

        ArrayList<Future> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Callable c = new MyCallable(i + "hhhhh");
            Future f = es.submit(c);

            list.add(f);

        }

        es.shutdown();

        for (Future f : list) {
            System.out.println("res" + f.get().toString());
        }


    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception {
        return null;
    }


}
