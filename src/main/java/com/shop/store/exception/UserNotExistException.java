package com.shop.store.exception;

/**
 * 类名:
 * 概要: 处理关于用户的异常信息
 *
 * @author xzz
 * @version 1.00 (2019年02月22日)
 */
public class UserNotExistException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String id;

    public UserNotExistException(String id) {
        super("user not exist.");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
