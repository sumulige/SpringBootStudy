/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: VailidTestController
 * Author:   willem
 * Date:     2021/11/26 4:21 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.controller;

import com.example.springbootstudy.base.CommonResponseVO;
import com.example.springbootstudy.pojo.TestValid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author willem
 * @create 2021/11/26
 * @since 1.0.0
 */
@RestController
@RequestMapping("con")
public class ValidTestController {

    @PostMapping("v")
    public CommonResponseVO valid(@Validated @RequestBody TestValid tv) throws Exception {
        return CommonResponseVO.SUCCESS;
    }
}
