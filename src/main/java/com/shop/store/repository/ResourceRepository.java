package com.shop.store.repository;

import com.shop.store.entity.RoleResource;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 类名:
 * 概要: 角色操作
 *
 * @author xzz
 * @version 1.00 (2019年02月25日)
 */
public interface ResourceRepository extends CrudRepository<RoleResource, Long> {
    public List<RoleResource> findByUrl(String url);

    RoleResource getByUrl(String url);
}
