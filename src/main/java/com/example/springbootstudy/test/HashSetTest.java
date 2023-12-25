/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: HashSetTest
 * Author:   willem
 * Date:     2021/6/11 10:45 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.test;

import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author willem
 * @create 2021/6/11
 * @since 1.0.0
 */
public class HashSetTest {
    public static void main(String[] args) {

        HashSet<Object> objects = new HashSet<>();
        objects.add(new Object());
        objects.add(new Object());

        objects.size();

        LinkedHashMap objectObjectLinkedHashMap = new LinkedHashMap<>(16, 0.75f, false);
        System.out.println(objects.size());
    }

}
