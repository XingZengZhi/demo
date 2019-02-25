package com.shop.store.service.impl;

import com.shop.store.entity.Role;
import com.shop.store.entity.RoleResource;
import com.shop.store.repository.ResourceRepository;
import com.shop.store.repository.RoleRepository;
import com.shop.store.service.ResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月25日)
 */

@Service
public class ResourceServiceImpl implements ResourceService {
    @Resource
    private ResourceRepository resourceRepository;

    @Resource
    private RoleRepository roleRepository;

    @Override
    public RoleResource getByUrl(String url) {
        return resourceRepository.getByUrl(url);
    }

    @Override
    public List<Role> getRoles(long id) {
        return roleRepository.findRolesOfResource(id);
    }
}
