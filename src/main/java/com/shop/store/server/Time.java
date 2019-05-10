package com.shop.store.server;

import java.util.Date;

/**
 * 类名:
 * 概要: 自定义时间类
 *
 * @author xzz
 * @version 1.00 (2019年05月08日)
 */
public class Time {
    private final long value;
    public Time () {
        this(System.currentTimeMillis() / 1000L);
    }
    public Time (long value) {
        this.value = value;
    }
    public long value(){
        return value;
    }

    @Override
    public String toString() {
        return new Date((value()) * 1000L).toString();
    }
}
