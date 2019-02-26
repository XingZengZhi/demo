package com.shop.store.service.impl;

import com.shop.store.entity.UserRole;
import com.shop.store.repository.UserRoleRepository;
import com.shop.store.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月26日)
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Resource
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAllByUsername(String username) {
        return userRoleRepository.findAllByUsername(username);
    }
}
