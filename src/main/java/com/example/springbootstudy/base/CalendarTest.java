/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: CalendarTest
 * Author:   willem
 * Date:     2021/9/29 3:37 下午
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.base;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author willem
 * @create 2021/9/29
 * @since 1.0.0
 */
public class CalendarTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calendar cal1 = Calendar.getInstance();

        System.out.println(

        );
        System.out.println("cal1+getTime" + cal1.getTime().getTime());
        System.out.println("cal1+getTime" +
                "" + cal1.getTime());
        cal1.add(Calendar.MARCH, -3);
//        String s =
        System.out.println(cal1);

        Class c = Class.forName("com.example.springbootstudy.base.CalendarTest");
        System.out.println(c);
        LocalDate l = LocalDate.now();
//        l.add
        System.out.println(l);

        String str = "2021-09-08";
        Date date = new Date(str);
//        if(date<new Date()){

    }

}
