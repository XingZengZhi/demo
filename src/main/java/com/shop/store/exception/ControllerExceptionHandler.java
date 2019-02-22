package com.shop.store.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名:
 * 概要: 处理来自Controller的异常信息
 *
 * @author xzz
 * @version 1.00 (2019年02月22日)
 */

// 处理其他Controller抛出的异常
@ControllerAdvice
public class ControllerExceptionHandler {
    // 当Controller中抛出指定的这个类时候，都用这个方法进行处理
    @ExceptionHandler(UserNotExistException.class)
    @ResponseBody
    // 返回状态码，当值为发生服务内部错误
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,Object> handlerUserNotExistException(UserNotExistException ex){
        Map<String,Object> result=new HashMap<>();
        result.put("id", ex.getId());
        result.put("message", ex.getMessage());
        return result;
    }
}
