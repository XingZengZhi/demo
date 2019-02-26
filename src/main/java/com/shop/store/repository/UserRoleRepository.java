package com.shop.store.repository;

import com.shop.store.entity.UserRole;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月26日)
 */
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
    List<UserRole> findAllByUsername(String username);
}
