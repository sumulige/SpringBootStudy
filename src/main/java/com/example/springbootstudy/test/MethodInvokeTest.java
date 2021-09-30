/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: MethodInvokeTest
 * Author:   willem
 * Date:     2021/8/10 2:21 下午
 * Description: 反射方法测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test;

import com.example.springbootstudy.spring.proxy.staticproxy.RealImage;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反射方法测试〉
 *
 * @author willem
 * @create 2021/8/10
 * @since 1.0.0
 */
public class MethodInvokeTest {

    public static void main(String[] args) throws NoSuchFieldException, IOException {
        Field f = RealImage.class.getDeclaredField("fileName");
        System.out.println(f);

        List list = new ArrayList<>();

//        ListIterator listIterator = list.listIterator();

//        listIterator.hasNext();

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write("1");
        charArrayWriter.write("1");
        charArrayWriter.write("1");

        System.out.println(charArrayWriter);

        String s = "hello world";
        char c1 = ' ';

        char[] c2 = new char[]{' '};
        c2.toString();



        //\s需要转义\\s
        String[] split = s.split("\\s");

//        new StringBuilder().toString().toC;

//        s.t

        char[] c = new char[]{'h','e','l',};

//        c.


        String s1 = new MethodInvokeTest().reverseWords("Let's take LeetCode contest");
        System.out.println(s1);

    }

    public String reverseWords(String s) {
        String[] temp = s.split("\\s");
        // StringBuilder sb = new StringBuilder();
        for(int i  = 0;i < temp.length;i++){
            reversString(temp[i].toCharArray());
        }
        return temp.toString();
    }

    public void reversString(char[] c){
        for(int left = 0,right = c.length - 1;left < right;left++,right--){
            char ch = c[left];
            c[left] = c[right];
            c[right] = ch;
        }
    }


}
