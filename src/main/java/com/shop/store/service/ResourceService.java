package com.shop.store.service;

import com.shop.store.entity.Role;
import com.shop.store.entity.RoleResource;

import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月25日)
 */
public interface ResourceService {
    RoleResource getByUrl(String url);

    List<Role> getRoles(long id);
}
