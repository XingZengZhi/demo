package com.shop.store.repository.page;

import com.shop.store.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 类名:
 * 概要:分页实现
 * 用户数据分页
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */
public interface PageUserRepository extends PagingAndSortingRepository<User, Long> {
}
