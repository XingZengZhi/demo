package com.shop.store.service.impl;

import com.shop.store.entity.User;
import com.shop.store.repository.UserRepository;
import com.shop.store.repository.page.PageUserRepository;
import com.shop.store.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Resource
    private PageUserRepository pageUserRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Page<User> findAllUserByPage(Integer pageStart, Integer pageEnd) {
        return pageUserRepository.findAll(PageRequest.of(pageStart,pageEnd));
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAllUser();
    }

    @Override
    public List<User> findUserByUserName(String username) {
        return userRepository.findAllByUsername(username);
    }

    @Override
    public User findByUserId(Integer userid) {
        return userRepository.findByUserId(userid);
    }
}
