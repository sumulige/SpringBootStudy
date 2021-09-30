/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: ScheduledExectorTest
 * Author:   willem
 * Date:     2021/8/20 8:40 上午
 * Description: 测试任务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试任务〉
 *
 * @author willem
 * @create 2021/8/20
 * @since 1.0.0
 */
public class ScheduledExecutorTest {

    public static void main(String[] args) {
        Executors.newScheduledThreadPool(3).schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("每隔3秒执行一次");
            }
        },3, TimeUnit.SECONDS);

        Executors.newScheduledThreadPool(3).scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟2秒每5秒执行一次");
            }
        },2,5,TimeUnit.SECONDS);
    }

}
