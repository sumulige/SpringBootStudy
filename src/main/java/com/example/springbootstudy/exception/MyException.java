/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: MyException
 * Author:   willem
 * Date:     2021/11/26 5:06 下午
 * Description: 异常处理自定义
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br>
 * 〈异常处理自定义〉
 *
 * @author willem
 * @create 2021/11/26
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyException extends RuntimeException {

    private String msg;

    private Integer status;

    public MyException(Integer status, String msg) {
        super(msg);
        this.msg = msg;
        this.status = status;
    }

    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
