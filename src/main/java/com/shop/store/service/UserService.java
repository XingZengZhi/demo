package com.shop.store.service;

import com.shop.store.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */
public interface UserService {
    void saveUser(User user);

    /**
     * 用户分页数据
     * @param pageStart 页数（从0开始）
     * @param pageEnd 每页数量
     * @return
     */
    Page<User> findAllUserByPage(Integer pageStart, Integer pageEnd);

    List<User> findAllUser();

    List<User> findUserByUserName(String username);

    User findByUserId(Integer userid);

    User findByUsernameAndPassword(String username, String password);
}
