package com.shop.store.service;

import com.shop.store.entity.UserRole;

import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月26日)
 */
public interface UserRoleService {
    List<UserRole> findAllByUsername(String username);
}
