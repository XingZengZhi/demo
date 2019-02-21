package com.shop.store.repository;

import com.shop.store.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

/**
 * 类名:
 * 概要:用户repository
 * 操作用户数据
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */
public interface UserRepository extends CrudRepository<User, String> {
    List<User> findAllByUsername(String username);

    @Async
    @Query(value = "select * from user_base u where 1=1", nativeQuery = true)
    List<User> findAllUser();

    @Async
    @Query(value = "select * from user_base u where u.id like ?1", nativeQuery = true)
    User findByUserId(Integer userid);
}
