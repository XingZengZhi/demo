package com.shop.store.controller;

import com.shop.store.entity.User;
import com.shop.store.service.UserService;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 类名:
 * 概要: 测试Controller
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */

@RestController
@EnableAutoConfiguration
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("save_user")
    public String saveUser() {
        String password = "123456";
        // 密码加密
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User u = new User("lsm", bCryptPasswordEncoder.encode(password), 1, "人间大炮");
        userService.saveUser(u);
        System.out.println(u.toString());
        return "my home";
    }

    @GetMapping("findAllUser")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("findUserByName/{username}")
    public List<User> findAllUser(@PathVariable String username) {
        return userService.findUserByUserName(username);
    }

    @GetMapping("findUserById/{userid}")
    public User findUserId(@PathVariable Integer userid) {
        return userService.findByUserId(userid);
    }

    @GetMapping("findAllUserByPage/{pageStart}/{pageEnd}")
    public Page<User> findAllUserByPage(@PathVariable Integer pageStart,
                                        @PathVariable Integer pageEnd) {
        return userService.findAllUserByPage(pageStart, pageEnd);
    }
}
