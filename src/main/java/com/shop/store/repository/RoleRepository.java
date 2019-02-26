package com.shop.store.repository;

import com.shop.store.entity.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 类名:
 * 概要: 角色操作
 *
 * @author xzz
 * @version 1.00 (2019年02月25日)
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    @Query(value = "select r.* from role r, user_role ur where ur.username = ?1 and ur.rid = r.id", nativeQuery = true)
    public List<Role> findRolesOfUser(String username);

    //根据resource的主键查找resource允许的所有权限
    @Query(value = "select r.* from role r, resource_role rr where rr.res_id = ?1 and rr.rid = r.id", nativeQuery = true)
    public List<Role> findRolesOfResource(long resourceId);

    Role findAllById(long id);
}
