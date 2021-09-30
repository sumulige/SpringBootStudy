/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: GirlProxy
 * Author:   willem
 * Date:     2021/5/26 2:46 下午
 * Description: girl代理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.spring.proxy.staticproxy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈girl代理类〉
 *
 * @author willem
 * @create 2021/5/26
 * @since 1.0.0
 */
public class RealImageProxy implements Image{

    private RealImage  realImage;

    private String fileName;

    public RealImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }

}
