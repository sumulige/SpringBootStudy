/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: OptionTest
 * Author:   willem
 * Date:     2021/11/5 4:46 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.base;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author willem
 * @create 2021/11/5
 * @since 1.0.0
 */
public class OptionTest {

    @Test
    public void optTest() {
        //不可消除nullpoint
        String str = null;
        final Optional<String> cum = Optional.of(str);

        cum.ifPresent(
                System.out::println
        );


    }

}
