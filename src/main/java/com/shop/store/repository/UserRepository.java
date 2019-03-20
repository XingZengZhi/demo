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
    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    List<User> findAllByUsername(String username);

    /**
     * 查询所有用户信息
     * @return
     */
    @Async
    @Query(value = "select * from user_base u where 1=1", nativeQuery = true)
    List<User> findAllUser();

    /**
     * 根据用户ID查询
     * @param userid
     * @return
     */
    @Async
    @Query(value = "select * from user_base u where u.id like ?1", nativeQuery = true)
    User findByUserId(Integer userid);

    /**
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户对象
     */
    User findByUsernameAndPassword(String username, String password);
}
