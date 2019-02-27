package com.shop.store.controller;

import com.shop.store.yml.Storepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    @Autowired
    private Storepage storepage;

    @RequestMapping("page/{pagename}")
    public String pageJump(@PathVariable String pagename, Model m){
        String[] pageArray = pagename.split("_");
        String s = "";
        for (int i = 0, len = pageArray.length; i < len; i++) {
            s += pageArray[i];
            if(i != len - 1) {
                s += "/";
            }
        }
        m.addAttribute("pagemap", storepage.getPagemap());
        return s;
    }
}
