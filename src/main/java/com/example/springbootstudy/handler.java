/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: handler
 * Author:   willem
 * Date:     2021/11/26 5:03 下午
 * Description: 配置默认异常处理advice
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy;

import com.example.springbootstudy.base.CommonResponseVO;
import com.example.springbootstudy.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 〈一句话功能简述〉<br>
 * 〈配置默认异常处理advice〉
 *
 * @author willem
 * @create 2021/11/26
 * @since 1.0.0
 */
@RestControllerAdvice
@Slf4j
public class handler {

    @ExceptionHandler(MyException.class)
    public CommonResponseVO MyExceptionHandler(MyException e) {
        e.printStackTrace();
        log.error(e.getMsg());
        return CommonResponseVO.fail(e.getStatus(), e.getMsg(), null);
    }

    @ExceptionHandler(Exception.class)
    public CommonResponseVO commonExceptionHandler(Exception e) {
        e.printStackTrace();
        log.error(e.getMessage());
        return CommonResponseVO.FAIL;
    }
}
