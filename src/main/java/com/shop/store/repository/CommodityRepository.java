package com.shop.store.repository;

import com.shop.store.entity.Commodity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年03月20日)
 */
@Component
public interface CommodityRepository extends CrudRepository<Commodity, String> {
}
