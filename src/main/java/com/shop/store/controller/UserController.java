package com.shop.store.controller;

import com.shop.store.entity.User;
import com.shop.store.request.Pageparam;
import com.shop.store.response.DataResponse;
import com.shop.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 类名:
 * 概要: 用户Controller
 *
 * @version 1.00 (2019年02月21日)
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("save_user")
    public String saveUser(User user) {
        // 密码加密
        String pwd = DigestUtils.md5DigestAsHex(user.getPassword().getBytes()).toUpperCase();
        user.setPassword(pwd);
        userService.saveUser(user);
        return "my home";
    }

    @GetMapping("findAllUser")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
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

    @GetMapping("findAllUserByPage")
    public Page<User> findAllUserByPage(Pageparam pageparam) {
        return userService.findAllUserByPage(pageparam.getPageStart(), pageparam.getPageEnd());
    }

    @PostMapping("login")
    // @PreAuthorize("hasRole('ROLE_ADMIN')")
    public DataResponse login(User user) {
        return userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}
