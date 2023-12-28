/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: BaseTest
 * Author:   willem
 * Date:     2021/9/28 2:55 下午
 * Description: 数组final变化
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy;

import com.example.springbootstudy.emumTest.EmumTest;
import com.example.springbootstudy.system.SystemTest;
import com.google.common.collect.Lists;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈数组final变化〉
 *
 * @author willem
 * @create 2021/9/28
 * @since 1.0.0
 */
public class BaseTest {

    @Autowired
    @NotNull
    private EmumTest emumTest;

    private final SystemTest s = new SystemTest();


    public static void main(String[] args) {
//        System.out.println(emumTest.say(););

        final SystemTest systemTest = new SystemTest();
        /**
         *
         * 修改前284720968
         * [3, 4, 5, 4, 7]
         * 修改完了284720968
         * 修改前189568618
         * [4, 5, 9, 9, 12, 3]
         * 修改完了189568618
         * -------------------------
         * c修改前793589513
         * [3, 4, 5, 4, 7]
         * c修改完了793589513
         * d修改前1313922862
         * [4, 5, 9, 9, 12, 3]
         * d修改完了1313922862
         */
        Integer[] a = {1, 2, 3, 4, 7};
        final Integer[] b = {1, 2, 6, 6, 9, 0};
        System.out.println("修改前" + System.identityHashCode(a));
        for (int i = 0; i < 3; i++) {
            a[i] += 2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("修改完了" + System.identityHashCode(a));

        System.out.println("修改前" + System.identityHashCode(b));
        for (int i = 0; i < b.length; i++) {
            b[i] += 3;
        }
        System.out.println(Arrays.toString(b));
        System.out.println("修改完了" + System.identityHashCode(b));


        System.out.println("-------------------------");

        Integer[] c = new Integer[]{1, 2, 3, 4, 7};
        final Integer[] d = new Integer[]{1, 2, 6, 6, 9, 0};
        System.out.println("c修改前" + System.identityHashCode(c));
        for (int i = 0; i < 3; i++) {
            c[i] += 2;
        }
        System.out.println(Arrays.toString(c));
        System.out.println("c修改完了" + System.identityHashCode(c));

        System.out.println("d修改前" + System.identityHashCode(d));
        for (int i = 0; i < b.length; i++) {
            d[i] += 3;
        }
        System.out.println(Arrays.toString(d));
        System.out.println("d修改完了" + System.identityHashCode(d));

        List<String> strings = Lists.newArrayList("1", "2", "3");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("3")) {
                iterator.remove();
            }
        }
    }

}
