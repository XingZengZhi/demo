package com.shop.store.repository;

import com.shop.store.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Component;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月27日)
 */
@Component
public interface CommodityRepository extends ElasticsearchCrudRepository<Commodity, String> {
    Commodity queryEmployeeById(String id);
}
