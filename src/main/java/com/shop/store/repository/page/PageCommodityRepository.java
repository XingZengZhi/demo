package com.shop.store.repository.page;

import com.shop.store.entity.Comdity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月28日)
 */
@Repository
public interface PageCommodityRepository extends PagingAndSortingRepository<Comdity, Long> {
}
