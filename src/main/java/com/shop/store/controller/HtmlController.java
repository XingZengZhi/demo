package com.shop.store.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类名:
 * 概要: 控制页面跳转
 *
 * @author xzz
 * @version 1.00 (2019年02月22日)
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("html")
public class HtmlController {
    @RequestMapping("page")
    public String pageJump(String pagename){
        String[] pageArray = pagename.split("_");
        String s = "";
        for (int i = 0, len = pageArray.length; i < len; i++) {
            s += pageArray[i];
            if(i != len - 1) {
                s += "/";
            }
        }
        return s;
    }
}
