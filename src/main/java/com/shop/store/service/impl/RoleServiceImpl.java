package com.shop.store.service.impl;

import com.shop.store.entity.Role;
import com.shop.store.repository.RoleRepository;
import com.shop.store.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月25日)
 */

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findAllById(long id) {
        return roleRepository.findAllById(id);
    }
}
