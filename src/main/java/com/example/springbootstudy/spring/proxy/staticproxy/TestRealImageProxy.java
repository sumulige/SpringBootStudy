/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: TestGirlProxy
 * Author:   willem
 * Date:     2021/5/26 2:49 下午
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.spring.proxy.staticproxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试类〉
 * 代理本质是隐藏 在不改变源码的基础上对功能上的增强
 *
 * @author willem
 * @create 2021/5/26
 * @since 1.0.0
 */
public class TestRealImageProxy {


    public static void main(String[] args) {

        Image image = new RealImageProxy("xxx.jpg");


        //第一次图像将从磁盘加载
        image.display();

        System.out.println("******************");


        //第二次不需要初始化这个直接调用
        image.display();

        new Exception("shsh");


    }

}
