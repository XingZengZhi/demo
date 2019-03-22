package com.shop.store.response;

import lombok.Data;

/**
 * 类名:
 * 概要: 接口返参类
 *
 * @version 1.00 (2019年03月22日)
 * @param msg 返回界面的提示信息
 * @param code 返回的状态码
 * @param data 返回的数据
 */
@Data
public class DataResponse<T> {
    private String msg;
    private Integer code = 200;
    private T data;
}
