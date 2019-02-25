package com.shop.store.service;

import com.shop.store.entity.Role;
import com.shop.store.repository.RoleRepository;
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
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getRolesOfUser(String username)
    {
        return roleRepository.findRolesOfUser(username);
    }

    public List<Role> getRolesOfResource(long id)
    {
        return roleRepository.findRolesOfResource(id);
    }
}
