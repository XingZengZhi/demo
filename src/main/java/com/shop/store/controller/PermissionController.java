package com.shop.store.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类名:
 * 概要: 需要权限的页面
 *
 * @author xzz
 * @version 1.00 (2019年02月26日)
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("perpage")
public class PermissionController {
    @RequestMapping("shopcart")
    public String shopcart() {
        return "html/permission/shopcart";
    }
}
