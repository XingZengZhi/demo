package com.shop.store.repository.page;

import com.shop.store.entity.Commodity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年02月28日)
 */
public interface PageCommodityRepository extends PagingAndSortingRepository<Commodity, String> {
}
