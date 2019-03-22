package com.shop.store.repository;

import com.shop.store.entity.Comdity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

/**
 * 类名:
 * 概要:
 *
 * @version 1.00 (2019年03月20日)
 */
@Repository
public interface CommodityRepository extends CrudRepository<Comdity, Long> {
    @Async
    @Query(value = "select * from commodity c where c.id like ?1", nativeQuery = true)
    Comdity findByComdityId(Long id);
}
