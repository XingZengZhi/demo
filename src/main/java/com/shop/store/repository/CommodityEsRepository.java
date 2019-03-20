package com.shop.store.repository;

import com.shop.store.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月27日)
 */
@Component
public interface CommodityEsRepository extends ElasticsearchRepository<Commodity, String> {
    Commodity queryById(String id);
}
