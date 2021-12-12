/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: TestValid
 * Author:   willem
 * Date:     2021/11/26 4:12 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springbootstudy.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author willem
 * @create 2021/11/26
 * @since 1.0.0
 */
@Data
public class TestValid {

    @Range(min = 0, max = 6, message = "错了")
    private Integer sss;

}
