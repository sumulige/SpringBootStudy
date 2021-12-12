/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: MyObject
 * Author:   willem
 * Date:     2021/10/14 11:41 上午
 * Description: 测试内存地址
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test.base;


import org.openjdk.jol.info.ClassLayout;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试内存地址〉
 *
 * @author willem
 * @create 2021/10/14
 * @since 1.0.0
 */
public class MyObject {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }

}
