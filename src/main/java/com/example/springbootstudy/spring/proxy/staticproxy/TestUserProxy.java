/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: TestUserProxy
 * Author:   willem
 * Date:     2021/9/28 5:46 下午
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.spring.proxy.staticproxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试〉
 *
 * @author willem
 * @create 2021/9/28
 * @since 1.0.0
 */
public class TestUserProxy {
    public static void main(String[] args) {
        new UserProxy(new UserServiceImpl()).add("hadoe");

    }

}
