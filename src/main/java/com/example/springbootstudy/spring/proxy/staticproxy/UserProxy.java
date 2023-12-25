/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: UserProxy
 * Author:   willem
 * Date:     2021/9/28 5:43 下午
 * Description: 代理实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.spring.proxy.staticproxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈代理实现〉
 *
 * @author willem
 * @create 2021/9/28
 * @since 1.0.0
 */
public class UserProxy implements UserService {

    private UserServiceImpl us;


    public UserProxy(UserServiceImpl us) {
        this.us = us;
    }

    @Override
    public void add(String s) {
        us.add("代理" + s);
    }
}
