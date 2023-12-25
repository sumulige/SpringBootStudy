/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: Girl
 * Author:   willem
 * Date:     2021/5/26 2:29 下午
 * Description: girl类定义睡和吃的方法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.spring.proxy.staticproxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈girl类定义睡和吃的方法〉
 *
 * @author willem
 * @create 2021/5/26
 * @since 1.0.0
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {

        System.out.println("DISPLAYING" + fileName);

    }


    public void loadFromDisk(String fileName) {

        System.out.println("LOADING" + fileName);

    }
}
