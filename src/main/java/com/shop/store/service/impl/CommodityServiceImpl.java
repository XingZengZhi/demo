package com.shop.store.service.impl;

import com.shop.store.entity.Commodity;
import com.shop.store.repository.CommodityRepository;
import com.shop.store.repository.page.PageCommodityRepository;
import com.shop.store.service.CommodityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类名:
 * 概要:
 *
 * @author zbx
 * @version 1.00 (2019年02月28日)
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    @Resource
    private CommodityRepository commodityRepository;

    @Resource
    private PageCommodityRepository pageCommodityRepository;

    @Override
    public void saveCommodity(Commodity commodity) {
        commodityRepository.save(commodity);
    }

    @Override
    public void delCommodityById(String id) {
        commodityRepository.deleteById(id);
    }

    @Override
    public void updCommodity(Commodity commodity) {
        commodityRepository.save(commodity);
    }

    @Override
    public Commodity queryCommdityById(String id) {
        return commodityRepository.queryEmployeeById(id);
    }

    @Override
    public Page<Commodity> findAllEmployeeByPage(Integer pageStart, Integer pageEnd) {
        return pageCommodityRepository.findAll(PageRequest.of(pageStart, pageEnd));
    }
}
