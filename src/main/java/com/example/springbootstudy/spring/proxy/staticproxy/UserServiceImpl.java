/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: UserServiceImpl
 * Author:   willem
 * Date:     2021/9/28 5:41 下午
 * Description: 实现UserService接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.spring.proxy.staticproxy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现UserService接口〉
 *
 * @author willem
 * @create 2021/9/28
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService{

    @Override
    public void add(String s) {
        System.out.println("真正的实现类"+s);
    }
}
