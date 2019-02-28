package com.shop.store.service;

import com.shop.store.entity.Commodity;
import org.springframework.data.domain.Page;

/**
 * 类名:
 * 概要:
 * 商品CRUD接口；删除和查询只需要商品ID。保存和更新则需要一个商品的实体类
 * 保存是没有实体类ID的，但是更新有实体类ID。
 * findAllEmployeeByPage 是商品数据的分页查询
 * @author xzz
 * @version 1.00 (2019年02月28日)
 */
public interface CommodityService {
    void saveCommodity(Commodity commodity);

    void delCommodityById(String id);

    void updCommodity(Commodity commodity);

    Commodity queryCommdityById(String id);

    Page<Commodity> findAllEmployeeByPage(Integer pageStart, Integer pageEnd);
}
