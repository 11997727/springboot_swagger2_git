package com.example.springboot_swagger2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: springboot_swagger2
 * @Package com.example.springboot_swagger2.model
 * @Description:
 * @date 2020/1/6 星期一 17:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "返回的对象")
public class Result {
    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "状态信息")
    private String msg;
    @ApiModelProperty(value = "结果")
    private String data;
}
